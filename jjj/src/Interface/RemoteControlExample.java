package Interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		//RemoteControl.changeBattery(); //정적메시지를 다이렉트로 실행
		RemoteControl rc;
		
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(11);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);
		
		
	}

}
