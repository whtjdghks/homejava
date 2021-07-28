package chap15.two.two;

import java.util.*;


public class VectorExample {

	public static void main(String[] args) {
		List<Board>list = new Vector<Board>();

		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));

		list.remove(2);
		list.remove(3);
//		list.remove(3);
//		list.remove(2); 이렇게 해야 자료가 안날라가고 정상작동
		
		for(int i=0; i<list.size(); i++) {
			Board board =list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}

}
