package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
//메모장 프로그램 만들기에 읽기 쓰기가 필요
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data="정말 한방에....!!!!! ".toCharArray();
		writer.write(data);//for문 제외
		writer.flush();
		writer.close();
	}

}
