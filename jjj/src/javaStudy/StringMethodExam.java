package javaStudy;

public class StringMethodExam {

	public static void main(String[] args) {
		//String str = new String("hello");
		String str = "hello"; // 축약가능
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		//lenght는 문자열의 길이를 알수있음
		System.out.println(str);
		str=str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
	}

}
