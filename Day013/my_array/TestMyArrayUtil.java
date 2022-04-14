package myArray;

public class TestMyArrayUtil {
	public static void main(String[] args) {
		MyArrayUtil mau1 = new MyArrayUtil();
		mau1.setArray(new int[] {1,2,3,4,5});
		System.out.println(mau1.getValueSum());
		System.out.println(mau1.ifThereGetIndex(2));
		System.out.println(mau1.ifThereGetIndex(3));
		System.out.println(mau1.ifThereGetIndex(6));
		System.out.println("=======================");	

		MyArrayUtil mau2 = new MyArrayUtil();
		int[] tmp = new int[] {11, 22, 33, 44, 11, 22, 11, 66};
		mau2.setArray(tmp);
		System.out.println(mau2.getValueSum());
		System.out.println(mau2.ifThereGetIndex(22));
		printArray(mau2.getArray());
		
		int startIndex = 0;
		int searchValue = 11;
		while(true) {
			startIndex = mau2.ifThereGetIndex(startIndex, searchValue);
			if(startIndex == -1) {
				System.out.println("모두 찾았습니다.");
				break;
			}
			System.out.println("찾은 위치:" + startIndex);
			startIndex++;
		}
		
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
}