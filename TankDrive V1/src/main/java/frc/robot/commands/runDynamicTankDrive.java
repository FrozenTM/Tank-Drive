// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.TankSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;

/** An example command that uses an example subsystem. */
public class runDynamicTankDrive extends Command {

  private final TankSubsystem subsystem;
  Supplier <Double> lSpeed;
  Supplier <Double> rSpeed;

  public runDynamicTankDrive(TankSubsystem subsystem, Supplier<Double> leftSpeed, Supplier<Double> rightSpeed) {
    this.subsystem = subsystem;
    this.lSpeed = leftSpeed;
    this.rSpeed = rightSpeed;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {


    subsystem.tankDrive(lSpeed.get(), rSpeed.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
