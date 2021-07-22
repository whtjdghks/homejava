package Interface;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;//상수선언을 위해서는 대문자로 해야한다.
	
	
	//추상메소드
	public void turnOn();//메소드로 인정받기위해선 객체타입이 아닌void로 하는게 좋다
	public void turnoff();
	public void setVolume(int volume);
	//8이전은 위에까지만 사용 8이후부터는 밑도 추가되었다.
	
	//디폴트 메소드(8이후 추가)
	default void setMute(boolean mute) {//일반메소드랑 별 차이를안가진다.
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드(8이후 추가)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
