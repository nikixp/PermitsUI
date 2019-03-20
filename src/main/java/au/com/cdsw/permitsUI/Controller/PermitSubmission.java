package au.com.cdsw.permitsUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/permits")
public class PermitSubmission {


    @GetMapping("/apply")
    public String getPermitByArea(Model model){




        return "confirmation";
    }
}
