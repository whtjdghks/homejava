package homeExample;

public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89; //이걸로 점수에 따른 등급을 알 수 있다.
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A등급 입니다.");
		}else if(score>=80) {
			System.out.println("점수가 89~80 입니다");
			System.out.println("등급은 B등급 입니다.");
			
		}else if(score>=70) {
			System.out.println("점수가 79~70 입니다");
			System.out.println("등급은 C등급 입니다.");
	    }else if(score>=60) {
			System.out.println("점수가 69~60 입니다");
			System.out.println("등급은 D등급 입니다.");
	    }else if(score>=50) {
			System.out.println("점수가 59~50 입니다");
			System.out.println("등급은 F등급 입니다.");
	    }}}
