package chap08ITF;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	
	//turnON() 추상 메소드의 실체메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체메소드
	public void turnoff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setvolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;	
		}else if
		(volume<RemoteControl.MIN_VOLUME) {
		this.volume = RemoteControl.MIN_VOLUME;	
		}else{
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : "+ this.volume);
	  }
	//setVolume() 추상 메소드의 실체메소드


		
	}

