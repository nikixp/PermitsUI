package au.com.cdsw.permitsUI.Config;

import au.com.cdsw.permitsUI.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebMvcConfigurer  {//extends WebSecurityConfigurerAdapter

    @Autowired
    private CustomAuthenticationSuccessHandler successHandler;

    private AuthenticationService authenticationService;

    @Autowired
    public void setAuthenticationService(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    @Bean
    public WebSecurityConfigurerAdapter webSecurityConfig(){
        return new WebSecurityConfigurerAdapter() {
            @Override
            protected void configure(HttpSecurity http) throws Exception {

                http
                        .csrf()
                        .disable()
                        .authorizeRequests()
                        .antMatchers("/webjars/**").permitAll()
                        .anyRequest().authenticated()
                        .and()
                        .formLogin()
                        .loginPage("/user/login")
                        .loginProcessingUrl("/authenticateTheUser")
                        .successHandler(successHandler)
                        .permitAll()
                        .and()
                        .logout()
                        .permitAll();
            }
            @Override
            protected void configure(AuthenticationManagerBuilder builder) throws Exception{
                builder.authenticationProvider(authenticationService);
            }
        };
    }




//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//
//        //add our users for in memory authentication
//        User.UserBuilder users = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(users.username("adam").password("test").roles("ADMIN"));
//    }


//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
//        http.authorizeRequests()
//
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/").authenticated()
//
//                .and()
//                .formLogin().loginPage("/user/login")
//                .loginProcessingUrl("/authenticateTheUser")
//                .successHandler(successHandler)
//                .permitAll()
//
//                .and()
//                .logout().permitAll()
//
//                .and()
//                .exceptionHandling().accessDeniedPage("/user/accessDenied");
//    }


}
