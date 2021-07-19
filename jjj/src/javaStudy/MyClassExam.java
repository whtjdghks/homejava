package javaStudy;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		
		myclass.method();//MyClass를 객체화낸걸 통해 불러내서 콘솔에 나타냄
		
		myclass.method2(10);
		
		int value = myclass.method3();//myclass의 리턴갓 10을 받기 위해서
		//그 리턴값에 해당하는 변수가 필요함
		System.out.println("m3이 리턴한값"+value);
		
		myclass.method4(5, 10);
		
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한값"+ value2);
		
	}

}
