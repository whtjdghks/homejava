package chap07;

public class ComputerExmaple {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCirCle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 :"+ computer.areaCircle(r));

	}

}
