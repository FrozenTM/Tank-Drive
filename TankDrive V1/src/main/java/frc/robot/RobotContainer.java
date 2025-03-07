// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.runDynamicTankDrive;
import frc.robot.subsystems.TankSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final TankSubsystem m_clockSubsystem = new TankSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private CommandXboxController m_Controller = new CommandXboxController(Constants.xboxControllerPort);



  public runDynamicTankDrive tankFreak = new runDynamicTankDrive(m_clockSubsystem, m_Controller :: getLeftY, m_Controller :: getRightY);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    m_clockSubsystem.setDefaultCommand(tankFreak);
  }

  public Command getAutonomousCommand() {
   return null;
  }
}
