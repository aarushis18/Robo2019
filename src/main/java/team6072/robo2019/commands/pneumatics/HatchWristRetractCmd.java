/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package team6072.robo2019.commands.pneumatics;

import edu.wpi.first.wpilibj.command.Command;
import team6072.robo2019.subsystems.PneumaticSys;

public class HatchWristRetractCmd extends Command {


  private PneumaticSys mPneuSys;


  public HatchWristRetractCmd() {
    mPneuSys = PneumaticSys.getInstance();
    requires(mPneuSys);
   
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    mPneuSys.setWristRetract();

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
