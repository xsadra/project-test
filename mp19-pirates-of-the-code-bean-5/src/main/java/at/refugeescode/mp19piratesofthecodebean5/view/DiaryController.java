package at.refugeescode.mp19piratesofthecodebean5.view;

import at.refugeescode.mp19piratesofthecodebean5.logic.FlyingDutchman;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diary")
public class DiaryController {

    private FlyingDutchman flyingDutchman;

    public DiaryController(FlyingDutchman flyingDutchman) {
        this.flyingDutchman = flyingDutchman;
    }

    @GetMapping
    String page() {
        return "diary";
    }

    @PostMapping
    String destroyTrident() {
        flyingDutchman.setCursed(false);
        return "redirect:/";
    }

}
