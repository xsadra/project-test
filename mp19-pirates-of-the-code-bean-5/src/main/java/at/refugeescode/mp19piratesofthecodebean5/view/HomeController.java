package at.refugeescode.mp19piratesofthecodebean5.view;

import at.refugeescode.mp19piratesofthecodebean5.logic.FlyingDutchman;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private FlyingDutchman flyingDutchman;

    public HomeController(FlyingDutchman flyingDutchman) {
        this.flyingDutchman = flyingDutchman;
    }

    @GetMapping
    String page() {
        return "home";
    }

    @ModelAttribute("status")
    String status() {
        return flyingDutchman.isCursed();
    }


}
