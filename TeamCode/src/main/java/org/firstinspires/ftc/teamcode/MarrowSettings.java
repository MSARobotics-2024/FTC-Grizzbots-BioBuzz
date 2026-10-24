package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.skeletonarmy.marrow.prompts.BooleanPrompt;
import com.skeletonarmy.marrow.prompts.OptionPrompt;
import com.skeletonarmy.marrow.settings.SettingsOpMode;

// This class asks several questions then stores that information for use latter - Jason
@TeleOp
public class MarrowSettings extends SettingsOpMode {
    // This enum is a list with values for each alliance - Jason
    public enum Alliance {RED, BLUE}
    @Override
    public void defineSettings() {
        // This adds the question debug mode and stores a true or false answer which can be read later in other parts of the code - Jason
        add("debug_mode", "Debug Mode", new BooleanPrompt("Enable debug mode?", false));
        // This adds the question alliance which stores either RED or BLUE this can be used in the code to determine which team we are on - Jason
        add("alliance", "Select Alliance", new OptionPrompt<>("Select alliance", Alliance.RED, Alliance.BLUE));
        // More questions can be added by using add()
    }
}