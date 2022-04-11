package constructor;
// 생성자로 인자를 전달받아 객체 생성
class Point {
	
	int x; 
	int y;
	
	void pointPrint() {
		System.out.println("[" + x + "," + y + "]");
	}
	
	// Point() {} // default constructor
	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class Day011_ArgumentsConstructor {

	public static void main(String[] args) {
		
		Point point2 = new Point(10, 20);
		point2.pointPrint();
	}

}
