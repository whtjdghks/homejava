package chap08.car;

public class Car {
	Tire frontLeftTire = new HankiikTire();
	Tire frontRightTire = new HankiikTire();
	Tire BackLeftTire = new HankiikTire();
	Tire BackRightTire = new HankiikTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
