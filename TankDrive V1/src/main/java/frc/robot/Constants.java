// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static int xboxControllerPort = 1;

  public static class tankDriveConstants {
    public static final int leftMotorAPort = 6;
    public static final int leftMotorBPort = 3;
    public static final int rightMotorAPort = 1;
    public static final int rightMotorBPort = 10;

    public static double kTankP = 1;
    public static double kTankI = 0;
    public static double kTankD = 0;
  }
  public static class coralOutputConstants {
    public static final int coralMotorPort = 2;
    public static final double setShootingSpeed = -0.3;
}

}
