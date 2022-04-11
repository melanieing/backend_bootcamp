package doll;

public class Doll {
	// 속성(값)
	Battery batt = null;
	final int RECORDER_USE = 11;
	final int SPEAKER_USE = 10;
	
	String name = "";
	String message = "I love you!"; // static이 붙지 않으면 객체마다 존재
	
	// 모든 객체가 공유하는 코드
	void voiceRecorder(String voice) {
		if (battCheck()) {
			System.out.println("No Battery!!");
			return;
		}
		if (batt.electricity(RECORDER_USE) != 0) {
			message = voice;
			System.out.println("Recording Done!");
		}
		System.out.println("Remaining Battery : " + batt.capacity);
	}
	
	String voiceSpeaker() {
		if (battCheck()) {
			System.out.println("No Battery!!");
			return null;
		} 
		if (batt.electricity(SPEAKER_USE) != 0) {
			System.out.println("Speaker ON!");
			System.out.println("Remaining Battery : " + batt.capacity);
			return message;
		}
		return null;
	}
	
	boolean battCheck() {
		return (batt == null) ? true : false;
	}
	
	final String BATT_TYPE = "AA"; // only certain type fits
	void setBatt(Battery b) {
		if (b.type.contentEquals(BATT_TYPE)) {
			batt = b;
			System.out.println("Battery mounted!");
		} else {
			System.out.println("Wrong Battery type!!");
		}
		batt = b;
	}
	
	Battery removeBatt() {
		Battery tmp = batt;
		batt = null;
		System.out.println("Battery removed!");
		return tmp;
	}
}
