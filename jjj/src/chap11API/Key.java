package chap11API;

public class Key {
	public int number;
	
	public Key(int number) {//이름이 같으면 생성자
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
		  Key compareKey = (Key)obj;
		  if(this.number==compareKey.number) {
			  return true;
		  }
		}
		return false;
	}
}
