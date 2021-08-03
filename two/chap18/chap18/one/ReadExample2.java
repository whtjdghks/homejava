package chap18.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		byte[]readBytes =new byte[3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo==-1)break;
				data+= new String(readBytes,0,readByteNo);
		}
		System.err.println(data);
		is.close();
	}

}
