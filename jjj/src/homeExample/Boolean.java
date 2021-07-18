package homeExample;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		// && 논리곱 둘다 참이여야 참
		// || 논리합 둘중 하나만 참이여도 참
		System.out.println(b1 && b2);//참 거짓
		System.out.println(b1 && b3);//참 참
		System.out.println(b1 || b2);//참 거짓
		System.out.println(b1 || b3);//참 참
		System.out.println(b2 || b2);//거짓 거짓
		
		int score =88;
		if(score <=100 && score>=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		//배타적 논리
		//두개가 서로 상반되어야  참으로 인정
		System.out.println(b1^b3);//참,참
		System.out.println(b1^b2);//참,거짓
		System.out.println(!b1);//거짓 트루를 펄스로만듬
		
	}

}
