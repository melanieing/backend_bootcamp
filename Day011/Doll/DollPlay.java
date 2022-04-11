package doll;

public class DollPlay {

	public static void main(String[] args) {
		// 객체를 조립하는 기능
		// 말하는 인형
		Doll kitty = null;
		kitty = new Doll(); // 객체를 생성(메모리에 실체를 만들어내는 것)
							// 동적으로 heap 메모리에 만듦 
		kitty.name = "kitty";
		
		String v = kitty.voiceSpeaker();
		System.out.println(kitty.name + " says : \"" + v + "\"");
		
		Battery b1 = new Battery();
		b1.capacity = 100;
		b1.type = "AA";
		
		kitty.setBatt(b1);
		
		kitty.voiceRecorder("How are you?");
		v = kitty.voiceSpeaker();
		System.out.println(kitty.name + " says : \"" + v + "\"");
		
		kitty.removeBatt();
		
		System.out.println("----------------------------------------");
		// 두 번째 객체 생성
		Doll maerong = new Doll();
		maerong.name = "maerong";
		
		maerong.setBatt(b1);
		
		maerong.voiceRecorder("I'm second doll!");
		
		v = maerong.voiceSpeaker();
		System.out.println(maerong.name + " says : \"" + v + "\"");
		
		Battery b2 = new Battery();
		b2.capacity = 50;
		b2.type = "AA";
		
		kitty.setBatt(b2);
		v = kitty.voiceSpeaker();
		System.out.println(kitty.name + " says : \"" + v + "\"");
		

	}

}
