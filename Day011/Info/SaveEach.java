package info;

public class SaveEach {
	public static void main(String[] args) {
		
		// 한 명의 이름과 나이를 저장
		Info info1 = null;
		info1 = new Info(); // 객체 생성하고 info1 참조변수로 참조
		
		 info1.name = "WINTER";
		 info1.age = 21;
		 info1.printInfo();
		
	}
}
