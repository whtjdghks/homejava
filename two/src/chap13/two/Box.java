package chap13.two;

public class Box<T> {//T대신 string integer등 다 들어갈수있음
	private T t;
	public T get() {return t;}
	public void set(T t) { this.t =t;}
}
