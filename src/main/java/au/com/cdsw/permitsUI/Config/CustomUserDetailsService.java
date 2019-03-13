//package au.com.cdsw.permitsUI.Config;
//
//import au.com.cdsw.permitsUI.Entity.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService  implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userService.findByUsername(username);
//        if (null == user) {
//            throw new UsernameNotFoundException("No user present with username: " + username);
//        } else {
////            System.out.println("User Password: --------------------" + user.getPassword());
//            return new CustomUserDetails(user);
//        }
//    }
//
//
//
//}
