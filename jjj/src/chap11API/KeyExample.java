package chap11API;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//key 객체를 식별키로 사용해서 String 값을 저장하는 Hash 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key , String>();
		// <>를 쓰면 어떤 데이터 타입이 들어와도 처리할 수 있다.
		//식별키 "new Key(1)"로 "홍길동을 저장함
		hashMap.put(new Key(1),"홍길동");
		
		//식별키 "new Key(1)"로 "홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
