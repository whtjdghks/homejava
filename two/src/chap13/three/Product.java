package chap13.three;

public class Product<T,M> {
	private T kind;//개인용
	private M model;
	
	public T getKind() {return this.kind;}
	public M getModel() {return model;}
	
	public void setKind(T kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
}
