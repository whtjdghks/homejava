package chap18.one;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		byte[]data = "파일 입력".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}
	

}
