package HelloWorld;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3ColorSensor;

public class HelloWorld {
	public static void main(String[] args) {
        System.out.println("Hello World!");
        Button.waitForAnyPress();
	}
}