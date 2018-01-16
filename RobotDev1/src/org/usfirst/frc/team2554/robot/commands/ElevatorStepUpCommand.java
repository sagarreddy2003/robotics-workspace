package org.usfirst.frc.team2554.robot.commands;

import org.usfirst.frc.team2554.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorStepUpCommand extends Command {
	public ElevatorStepUpCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.kElevatorSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		Robot.kElevatorSubsystem.initializeCounter();
		Robot.kElevatorSubsystem.Up();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Robot.kElevatorSubsystem.isSwitchSet();
	}

	// Called once after isFinished returns true
	@Override
	protected void end(){
		Robot.kElevatorSubsystem.Stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted(){
		//TODO: PUT INTERRUPTION LOGIC HERE
	}
}
