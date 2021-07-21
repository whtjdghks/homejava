package chap07;

public class Computer extends Calculator {
	@Override    //어노테이션 뒤에는 ;을 붙이지 않는다.
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
