package chap10Exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			//int i =5;
		//	System.out.println(i); 이렇게 입력하면 밑에 주석처리 정상 실행
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}

	}

}
