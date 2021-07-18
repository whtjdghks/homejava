package homeExample;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value =0;
		Scanner scan = new Scanner(System.in);
		//scanner가 있어야 글을 입력할수잇다.
		do {
			//반복시킬 문장
			//while을만족시 한번더
			System.out.println("10을 입력해주세요");
			System.out.println("입력해주세용 : ");
			value = scan.nextInt();//정수값을 받아서 작성
			//nextint가 있어야지 정수값을 받아서 입력가능
			System.out.println("입력받은값 : "+value);
			
		}while(value !=10);
		System.out.println("반복종료!");
	}

}
