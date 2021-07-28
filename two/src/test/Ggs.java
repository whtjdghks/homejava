package test;
import java.io.*;// 전체가 문제
import java.util.Scanner;//스캐너가 문제

public class Ggs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("구구셈 몇단 :");
			int dan =scan.nextInt();
			if(!(dan==0) || (dan==1)){
				System.out.println(dan+"단 출력");
				for(int j=1; j<=9; j++) {
					System.out.print(dan+"*"+j+"="+dan*j+"\n");//syso가 문제
				}
			  }
			else
			{
				System.out.println("프로그램을 종료합니다");
				break;//break가 문제
			}

		}
	}
}
	
