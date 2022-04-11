package info;
//클래스 : 객체를 정의해 놓은 것
//관련 있는 속성과 행위를 묶음(멤버)으로 관리
public class Info {
	String name; // 멤버 필드(속성)
	int age; // 멤버 필드(속성)
	
	void printInfo() { // 멤버 메서드(행위)
		System.out.println("[" + name + " : " + age + "]");
	}
	
	String infoToString() { // 멤버 메서드(행위)
		return "Info[name=" + name + ", age =" + age + "]";
	}
}
