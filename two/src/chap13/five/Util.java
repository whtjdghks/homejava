package chap13.five;

public class Util {
	public static <T extends Number>int compare(T t1, T t2) {//extends 는 어떤 종류를 사용하겠다라는 뜻으로 사용
		
		double v1 =t1.doubleValue();
		
		double v2 =t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
