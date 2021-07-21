package Interface;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn()추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");	
	}
	//turnOff()추상 메소드의 실체 메소드
	public void turnoff() {
		System.out.println("Audo를 끕니다.");
	}
	//setVolume()추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		
	}

}
