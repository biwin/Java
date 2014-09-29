package com.twenty;

public class roboApp {
	public static void main(String[] args) {
		robo WallE = new robo();
		System.out.println("Settign temperature to 356");
		WallE.temperature = 356;
		WallE.checkTemperature();
		WallE.showAttributes();
		System.out.println("Setting temperature to 456");
		WallE.temperature = 456;
		WallE.checkTemperature();
		WallE.showAttributes();
		System.out.println("Setting temperature to 764");
		WallE.temperature = 764;
		WallE.checkTemperature();
		WallE.showAttributes();
		System.out.println("Sorry I am dead!! :(");
	}
}
