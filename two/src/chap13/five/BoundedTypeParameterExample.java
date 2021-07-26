package chap13.five;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str = Util.comapare("a","b"); String은 Number 타입이 아니다.
		
		int result1 =Util.compare(10,20);//int -> Integer(자동 Boxing)
		System.out.println(result1);

		int result2 = Util.compare(4.5, 3);//(double->Double)자동 Boxing
		System.out.println(result2);
	}

}
