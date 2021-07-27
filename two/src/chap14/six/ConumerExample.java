package chap14.six;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;
//import java.util.function.*; 이런식으로 한줄로 대체가능
public class ConumerExample {

	public static void main(String[] args) {
		Consumer<String>consumer = t ->System.out.println(t+"8");
		consumer.accept("java");
		
		BiConsumer<String,String>bigConsumer = (t,u)->System.out.println(t+u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String>objIntConsumer=(t,i)-> System.out.println(t+i);
		objIntConsumer.accept("java", 8);

	}

}
