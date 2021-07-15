package chap06;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();//클래스명하고같음
		s1.aaa();
		s1.bbb();
		System.out.println("s1변수가 Student 객체를 참조합니다");
		
		Student s2 = new Student();
		s1.bbb();
		System.out.println("s2 변수가 또 다른 Student 객체르 참조합니다.");
//클래스를 잘만들면 불러올수있음
	}

}
