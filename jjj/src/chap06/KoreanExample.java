package chap06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자박","011225-1234567");//맨앞에 코리안은 클래스임왼쪽 보셈
		System.out.println("k1.nation : "+ k1.nation);
		System.out.println("k1.name : "+ k1.name);
		System.out.println("k1.ssn : "+ k1.ssn);
	
		System.out.println();
		System.out.println("====================");// \n 쓰면 줄 바꾸기로 쓸수있음
		System.out.println();
		//클래스를 잘만들어놓으면 가져다 쓸수 있다.
		Korean k2 = new Korean("김자바","930525-0654321");
		System.out.println("k2.nation : "+ k2.nation);
		System.out.println("k2.name : "+ k2.name);
		System.out.println("k2.ssn : "+ k2.ssn);
		
	}

}
