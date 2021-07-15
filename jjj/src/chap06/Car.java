package chap06;

public class Car {
	
	String name;
	int value;// 초기값을 안정해줘도 힙에서 알아서 초기호됨
	
	Car()//생성자
	{
		System.out.println("나 카생성자야");//값이 없는 생성자
	}// 아무말이없을때 대답하는 생성자
	
	Car(String color , int cc){
		name = color;
		value = cc;
	}// 글자와 숫자가 있을대 대답하는 생성자
}
