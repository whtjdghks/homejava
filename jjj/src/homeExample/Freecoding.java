package homeExample;

import java.util.Scanner;

public class Freecoding {

	public static void main(String[] args) {
		
		boolean run =(true);
		
		int balance =0;
		
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("====================");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("====================");
			System.out.print  ("선택> :");
			
			balance=sc.nextInt();
			System.out.println("예금액 :");
			System.out.print(sc.nextInt());
			
			System.out.println("출금액");
			
			
		}while(balance !=4);
		System.out.println("프로그램 종료");
		}
		
	
		}
	


		
		
		
		


