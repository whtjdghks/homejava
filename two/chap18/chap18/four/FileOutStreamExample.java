package chap18.four;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName =
				"C:/imgsource/justdo.mp3"; //원본 경로
		String targetFileName =
				"C:/imgtarget/justdo.mp3"; // 복사할 경로
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[ ]readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fos.close();
		
		System.out.println("복사 완료");
	}

}
