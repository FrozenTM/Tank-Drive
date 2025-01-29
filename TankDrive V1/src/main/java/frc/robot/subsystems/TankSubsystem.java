// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.tankDriveConstants;

public class TankSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
    TalonSRX clockMotor; 
    TalonSRX leftMotorA;
    TalonSRX leftMotorB;
    TalonSRX rightMotorA;
    TalonSRX rightMotorB;
    // TalonFXConfiguration pidconfig = new TalonFXConfiguration().withSlot0(new Slot0Configs().withKP(1).withKI(0).withKD(0));


  public TankSubsystem() {
    clockMotor = new TalonSRX(Constants.clockMotorPort);
    leftMotorA = new TalonSRX(Constants.leftMotorAPort);
    leftMotorB = new TalonSRX(Constants.leftMotorBPort);
    rightMotorA = new TalonSRX(Constants.rightMotorAPort);
    rightMotorB = new TalonSRX(Constants.rightMotorBPort);
    // leftMotorA.getConfigurator().apply(pidconfig);
    // leftMotorB.getConfigurator().apply(pidconfig);
    // rightMotorA.getConfigurator().apply(pidconfig);
    // rightMotorB.getConfigurator().apply(pidconfig);
  }

  public void tankDrive(double leftDrive, double rightDrive) {
    leftMotorA.set(TalonSRXControlMode.PercentOutput, leftDrive);
    leftMotorB.set(TalonSRXControlMode.PercentOutput, leftDrive);
    rightMotorA.set(TalonSRXControlMode.PercentOutput, -rightDrive);
    rightMotorB.set(TalonSRXControlMode.PercentOutput, -rightDrive);
  }
  
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
