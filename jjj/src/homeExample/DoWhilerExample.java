package homeExample;

import java.util.Scanner;

public class DoWhilerExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc= new Scanner(System.in);//이곳이 system.in.read() 메소드를 하나의 키코드로 만든것
		String cs;// sc라는 문자열을 사용하기 위해 
		
		do {
		  System.out.println(">");
		  cs = sc.nextLine();//nextLine() 메소드를 읽기 위해서 cs에다 저장
		  System.out.println(cs);
		} while(! cs.equals("q"));
	
		System.out.println();//한줄 빈칸
		System.out.println("프로그램 종료");
	} 
	
	}


