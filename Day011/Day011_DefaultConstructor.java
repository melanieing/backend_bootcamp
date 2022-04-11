package constructor;

// 생성자가 없는 클래스로 객체 생성

class Point {
	
	int x; 
	int y;
	
	void pointPrint() {
		System.out.println("[" + x + "," + y + "]");
	}
	
	// Point() {} // default constructor
}

public class Day011_DefaultConstructor {
	
	public static void main(String[] args) {
		
		Point point1 = new Point();
		point1.x = 10;
		point1.y = 20;
		point1.pointPrint();
	}

}
