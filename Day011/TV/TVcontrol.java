package tv;

public class TVcontrol {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl(); // 리모컨 구입
		
		TV tv1 = new TV(); // 삼성 TV 구입
		tv1.brand = "삼성";
		
		TV tv2 = new TV(); // 엘지 TV 구입
		tv2.brand = "엘지";
		
		// tv1과 tv2의 전원 켜기
		rc.setPower(tv1);
		rc.setPower(tv2);
		
		// tv1과 tv2의 채널 변경
		rc.setChannel(tv1, 6);
		rc.setChannel(tv2, 11);
		
		// tv1과 tv2이 볼륨 조절
		rc.setVolume(tv1, 10);
		rc.setVolume(tv2, 7);
		
		// tv1과 tv2의 전원 끄기
		rc.setPower(tv1);
		rc.setPower(tv2);
		
	}
}
