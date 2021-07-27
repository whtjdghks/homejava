package chap14.seven;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*100)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : "+ num);
		
	}

}
