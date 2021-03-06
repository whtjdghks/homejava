package chap15.five;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
//정렬프로그램 2
	public static void main(String[] args) {
		TreeSet<Integer>scores =new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
	
		NavigableSet<Integer>descendingset=scores.descendingSet();
		for(Integer score : descendingset ) {
			System.out.println(score+" ");
		}
		System.out.println();
		
		NavigableSet<Integer>ascendingSet = descendingset.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
	}

}
