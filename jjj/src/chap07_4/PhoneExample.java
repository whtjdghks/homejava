package chap07_4;

public class PhoneExample {

	public static void main(String[] args) {
		//Phon phone = new Phone();
		
		SmartPhone smPhone = new SmartPhone("홍길동");
		
		smPhone.turnOn();
		smPhone.internetSearch();
		smPhone.turnOff();

	}

}
