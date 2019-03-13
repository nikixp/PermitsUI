package au.com.cdsw.permitsUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public String showLogin(){ return "login";}

    //add request mapping for access denied
    @GetMapping("/accessDenied")
    public String showAccessDenied(){
        return "accessDenied";
    }

}
