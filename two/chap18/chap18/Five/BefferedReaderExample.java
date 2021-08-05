package chap18.Five;
//입출력

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BefferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		String lineString = br.readLine(); //한줄씩 줄단위로 읽어라
		
		System.out.println("출력 : "+lineString);
		
		br.close();
		reader.close();
		is.close();// 안쪽부터 닫고 나와야함

	}

}
