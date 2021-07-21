package chap10Exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length==2) {
			String data1 =args[0];
			String data2 =args[1];
		
			System.out.println("args[0]"+data1);
			System.out.println("args[1]"+data2);//args 인덱스 오류시엔 args에 값입력 run-run con
	}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutBoundsExceptionExample");
			System.out.println("값1 값2");
			System.out.println("값이 존재하지않으면 RUN-RUN CON가서 ARGS값입력");
	}

}
}