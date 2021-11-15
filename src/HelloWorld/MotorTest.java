package HelloWorld;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class MotorTest {

	private static EV3MediumRegulatedMotor motor;

	public static void main(String[] args) {
		try {
			motor = new EV3MediumRegulatedMotor(MotorPort.D);
			motor.setSpeed(240);
			
			System.out.println("Press right, left, enter to control the motor");
			
			int pressed;
			//print the button name until the pressed button is escape
			pressed = Button.getButtons();
			while(pressed != Button.ID_ESCAPE) {
				// block the thread until a button is pressed
				pressed = Button.getButtons();
				// left button
				if(pressed == Button.ID_LEFT) {
					System.out.println("Left");
					motor.rotate(-360, true);
				}
				// right button
				if(pressed == Button.ID_RIGHT) {
					System.out.println("Right");
					motor.rotate(360, true);
				}
				// enter button
				if(pressed == Button.ID_ENTER || pressed == 0) {
					motor.stop();
				}
			}
		} catch (Exception e) {
			System.out.println("Connect Medium Motor to Port D");
			Button.waitForAnyPress();
		}
	}
}