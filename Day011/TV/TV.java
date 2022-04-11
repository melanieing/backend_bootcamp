package tv;
// 객체지향 (Object Oriented Programming)
// 현실을 모델링한 것
public class TV {
	// 속성(값)
	String brand;
	boolean power;
	int channel;
	int volume;
	
	// 기능
	void powerOn() {
		power = !power;
		view();
	}
	void chUp() {
		channel++;
		view();
	}
	void chDw() {
		channel--;
		view();
	}
	void volUp() {
		volume++;
		view();
	}
	void volDw() {
		volume--;
		view();
	}
	void view() {
		System.out.println("<" + brand + ">");
		if (power) {
			System.out.println("channel : " + channel + ", volume : " + volume);
		} else {
			System.out.println("black monitor");
		}
	}

}
