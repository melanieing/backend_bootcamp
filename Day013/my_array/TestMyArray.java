package myArray;

public class TestMyArray {

	public static void main(String[] args) {
		
		System.out.println("=====Test1=====");
		MyArray testArr1 = new MyArray();
		int[] originArray = new int[] {1,2,3};
		
		testArr1.setArray(originArray);
		testArr1.setValue(0, 10);
		System.out.println("-----testArr1-----");
		for (int i = 0; i < testArr1.getLength(); i++) {
			System.out.println(testArr1.getValue(i)); // 10,2,3으로 값 변경
		}
		System.out.println("test객체의 10번째 인덱스 : " + testArr1.getValue(10)); // 유효하지 않은 인덱스이므로 -1 반환
		
		System.out.println("-----원본 배열-----");
		for (int origin : originArray) {
			System.out.println(origin); // 1,2,3으로 유지됨
		}
		
		System.out.println("=====Test2=====");
		MyArray testArr2 = new MyArray();
		
		testArr2.setArray(originArray);
		int[] tmpArr = testArr2.getArray();
		tmpArr[0] = 100; // testArr2까지 변경해버림
		
		System.out.println("-----tmpArr-----");
		for (int tmp : tmpArr) {
			System.out.println(tmp); // 100,2,3으로 값 변경
		}
		
		System.out.println("-----testArr2-----");
		for (int i = 0; i < testArr2.getLength(); i++) {
			System.out.println(testArr2.getValue(i)); // 10,2,3으로 값 변경
		}

		System.out.println("=====Test3=====");
		MyArray testArr3 = new MyArray(3);
		
		testArr3.setArray(originArray);
		tmpArr = testArr3.getCopiedArray();
		tmpArr[0] = 1000;
		
		System.out.println("-----tmpArr-----");
		for (int tmp : tmpArr) {
			System.out.println(tmp); // 100,2,3으로 값 변경
		}
		
		System.out.println("-----testArr3-----");
		for (int i = 0; i < testArr3.getLength(); i++) {
			System.out.println(testArr3.getValue(i)); // 10,2,3으로 값 변경
		}
	}
}
