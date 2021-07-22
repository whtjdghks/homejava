package chap09;

public class A {
	A(){System.out.println("A라는 객체가 생성됨");}
	
	
	Class B{
		B(){System.out.println("B라는 객체가 생성됨");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2(){}
	}
	

	static class C {
		C(){System.out.println("C라는 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		
		class D{
		  D(){System.out.println("D라는 객체가 생성됨")}
		  int field1;
		  //static int field2;
		  void method1() {}
		  //static void method2(){}
	}
		  D d = new D();
		  d.field1=3;
		  d.method1();
	}
}
