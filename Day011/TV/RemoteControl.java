package tv;

public class RemoteControl {
	// 참조객체를 참조하는 참조변수
	TV tv;
	
	// 전원 관련 기능
	void setPower(TV tv) {
		tv.powerOn();
	}
	
	// 채널 관련 기능
	void chUp(TV tv) {
		tv.chUp();
	}
	void chDown(TV tv) {
		tv.chDw();
	}
	void setChannel(TV tv, int channel) {
		tv.channel = channel;
		tv.view();
	}
	
	// 볼륨 관련 기능
	void volUp(TV tv) {
		tv.volUp();
	}
	void volDown(TV tv) {
		tv.volDw();
	}
	void setVolume(TV tv, int volume) {
		tv.volume = volume;
		tv.view();
	}
}
