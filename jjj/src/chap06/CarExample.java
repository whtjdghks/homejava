package chap06;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car("검정",3000);//값을 갖는 생성자가 대답

		System.out.println(myCar.name);
		System.out.println(myCar.value);
		
		Car myCar2 = new Car();//값을 가지지않는 생성자가 대답
		
	}

	}
