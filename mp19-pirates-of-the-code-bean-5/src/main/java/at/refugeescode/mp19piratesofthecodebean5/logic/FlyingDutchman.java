package at.refugeescode.mp19piratesofthecodebean5.logic;

import org.springframework.stereotype.Service;

@Service
public class FlyingDutchman {

    private boolean cursed = true;

    public String isCursed() {
        if (cursed) {
            return "cursed";
        }
        return "released from its curse";
    }

    public void setCursed(boolean cursed) {
        this.cursed = cursed;
    }
}
