package constructor;

// 생성자 오버로딩 활용

class Point {
	
	int x; 
	int y;
	
	void pointPrint() {
		System.out.println("[" + x + "," + y + "]");
	}
	
	Point() {} // default constructor
	
	Point(int a) {
		x = a;
		y = a;
	}
	
	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class Day011_OverloadingConstructor {

	public static void main(String[] args) {
		
		Point point3 = new Point();
		Point point4 = new Point(10);
		Point point5 = new Point(20, 30);
		point3.pointPrint();
		point4.pointPrint();
		point5.pointPrint();
	}

}
