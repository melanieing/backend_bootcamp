package doll_clear;

public class Use {

	public static void main(String[] args) {
		
		Doll kitty = new Doll("AA"); //인형 생성

		// 첫 번째 배터리 생성
		Battery bat1 = new Battery(100, "AA");
		
		System.out.println("kitty 인형에 bat1 배터리 넣기");
		kitty.insertBattery(bat1);
		
		kitty.record("첫 번째 메시지");
		kitty.record("두 번째 메시지"); 
		kitty.record("세 번째 메시지"); 
		kitty.record("네 번째 메시지"); 
		kitty.speak();
		kitty.speak();
		kitty.speak();
		
		// 두 번째 배터리 생성
		Battery bat2 = new Battery(50, "AA");
		//Battery tmp = kitty.insertBattery(bat2);
		
		// 남아있는 배터리 bat1Left에 넣어놓기
		Battery bat1Left = kitty.removeBattery();
		System.out.println("bat1의 남은 용량:" + bat1Left.getCap());
		
		System.out.println("kitty 인형에 bat2 배터리 넣기");
		kitty.insertBattery(bat2);
		
		kitty.speak();
	

	}

}
