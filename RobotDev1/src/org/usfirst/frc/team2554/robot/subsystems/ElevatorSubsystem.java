package org.usfirst.frc.team2554.robot.subsystems;

import org.usfirst.frc.team2554.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Counter;


public class ElevatorSubsystem extends Subsystem {
	
    DigitalInput limitSwitch = new DigitalInput(RobotMap.limitSwitch);
    Victor motor1 = new Victor(RobotMap.elevator[0]);
    Victor motor2 = new Victor(RobotMap.elevator[1]);
    Counter counter = new Counter(limitSwitch);

    public boolean isSwitchSet() {
        return counter.get() > 0;
    }

    public void initializeCounter() {
        counter.reset();
    }

    public void Up() {
        motor1.set(1.0);
        motor2.set(1.0);
    }

    public void Down() {
    	motor1.set(-1.0);
        motor2.set(-1.0);
    }

    public void Stop() {
    	motor1.set(0.0);
        motor2.set(0.0);
    }
    protected void initDefaultCommand() {
    }
}