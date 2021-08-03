package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
//메모장 프로그램 만들기에 읽기 쓰기가 필요
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data="나를 홍길동이라 부르지마".toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
