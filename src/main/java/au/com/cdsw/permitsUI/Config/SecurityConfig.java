package au.com.cdsw.permitsUI.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomAuthenticationSuccessHandler successHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        //add our users for in memory authentication
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("adam").password("test").roles("ADMIN"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeRequests()

                .antMatchers("/resources/**").permitAll()
                .antMatchers("/").authenticated()

                .and()
                .formLogin().loginPage("/user/login")
                .loginProcessingUrl("/authenticateTheUser")
                .successHandler(successHandler)
                .permitAll()

                .and()
                .logout().permitAll()

                .and()
                .exceptionHandling().accessDeniedPage("/user/accessDenied");
    }

}
