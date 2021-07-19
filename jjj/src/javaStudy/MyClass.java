package javaStudy;
//메소드 작성법
public class MyClass {
	//public 리턴타입 메소드명 (매개변수){구현}
	public void method() {
		System.out.println("m1이 실행됨..");
	}
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	public int method3() {//받아올값이없어서 매개변수가 비었음
		System.out.println("m3실행");
		return 10;
	}
	public void method4(int x , int y) {
		System.out.println(x+y+"method4실행");
	}
	public int method5(int y) {
		System.out.println(y+"이용한 m5실행");
		return y*2;
	}
}
