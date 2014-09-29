package com.twenty;

public class robo {
	String status;
	int speed;
	float temperature;


	void checkTemperature(){
		if (temperature > 660){
			status = "returning home!";
			speed = 5;
		}
		else if (temperature < 400){
			status = "I am freezing here!! :(";
			speed = 1;
		}
		else {
			status = "Happy here, don't disturb me";
			speed = 3;
		}
	}
	void showAttributes(){
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
	}
}
