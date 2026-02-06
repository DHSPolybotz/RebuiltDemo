package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;

public class VisionSubsystem extends SubsystemBase {

    public VisionSubsystem() {}

    /** Returns true if Limelight sees an AprilTag */
    public boolean seesAprilTag() {
        return LimelightHelpers.getTV("limelight-beta");
    }  
}
