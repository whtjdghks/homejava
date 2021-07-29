package chap16.one;

import java.util.*;
import java.util.stream.Stream;

public class IteratorVsStreamExmaple {

	public static void main(String[] args) {
		List<String>list =Arrays.asList("홍길동","신용권","감자바");
		
		//Iterator 이용
		Iterator<String>iterator =list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		//stream이용 이제부터 이런 방식을 사용하는게 좋음
		Stream<String>stream = list.stream();
		stream.forEach(name ->System.out.println(name));
		//람다식 적용시 -> 뒤로는 함수로 작용한다.
		//forEach는 스트림의 메소드 낱개로 하나씩 잡으라는 뜻
	}

}
