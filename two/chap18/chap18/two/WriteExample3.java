package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {
//메모장 프로그램 만들기에 읽기 쓰기가 필요
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data="홍길동".toCharArray();//문자 '홍'이 짤림
		writer.write(data,1,2);//for문 제외
		writer.flush();
		writer.close();
	}

}
