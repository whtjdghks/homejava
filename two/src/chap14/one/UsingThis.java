package chap14.one;

public class UsingThis {
	public int outterfield =10;
	
	class Inner{
		int innerField =20;
		
		void method() {
			//람다식
			MyFunctionalInterface fi=()->{
				System.out.println("outterfield :"+ outterfield);//▽바깥 객체의 참조를 얻기위해서는 클래스명 this를 사용
				System.out.println("outterfield :"+ UsingThis.this.outterfield+"\n");
				
				System.out.println("innerField :"+ innerField);
				System.out.println("innerField :"+ this.innerField+"\n");	
			};                       //람다식 내부에서 this는 Inner객체를 참조
			fi.method();
			
		}
	}
}
