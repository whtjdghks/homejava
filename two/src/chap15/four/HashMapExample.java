package chap15.four;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//map 컬렉션 생성
		Map<String,Integer>map =new HashMap<String,Integer>();
		
		//객체 저장 내용이 같으면 같은것으로 추정
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		System.out.println("총 Entry 수 :"+map.size());

		//객체 찾기
		System.out.println("\t 홍길동 :"+map.get("홍길동"));
		System.out.println();
		//객체하나씩 처리
		Set<String>keySet = map.keySet();
		Iterator<String>keyIterator =keySet.iterator();
		while(keyIterator.hasNext()) {
			String key =keyIterator.next();
			Integer value =map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 :"+map.size());
		
		Set<Map.Entry<String,Integer>>entrySet =map.entrySet();
		Iterator<Map.Entry<String, Integer>>entIterator =entrySet.iterator();
		
		while(entIterator.hasNext()) {
			Map.Entry<String, Integer>entry =entIterator.next();
			String key =entry.getKey();
			String value = entry.getKey();
			Integer vlaue =entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 entry 수 :"+map.size());
	}


}
