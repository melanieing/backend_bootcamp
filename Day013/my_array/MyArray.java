package myArray;

public class MyArray {
	
	private int[] arr;
	private int length;
	public static final int DEFAULT_LENGTH = 5;
	public static final int ERROR = -1;
	
	// 입력받은 길이만큼 배열을 생성
	protected void initArray(int length) {
		this.length = length;
		arr = new int[this.length];
	}
	
	// 유효한 인덱스인지 확인하는 메서드
	protected boolean indexCheck(int index) {
		return (index >= 0 && index < length) ? true : false;
	}
	
	// 기본적으로 요소를 5개 가지는 배열 생성
	public MyArray() {
		initArray(DEFAULT_LENGTH);
	}
	
	// 입력받은 길이만큼의 배열을 생성 (생성자 오버로딩)
	public MyArray(int length) {
		initArray(length);
	}
	
	// 입력된 배열을 복사해서 새로운 객체를 갖도록 설정
	public void setArray(int[] arr) {
		initArray(arr.length);
		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
	}
	
	// 특정 인덱스에 특정 값을 입력
	public void setValue(int index, int value) {
		if (indexCheck(index)) { // 유효하지 않은 인덱스라면, 입력하지 않음
			arr[index] = value;
		} 
	}
	
	// 객체가 참조하는 배열을 반환
	public int[] getArray() {
		return arr;
	}
	
	// 참조하는 배열을 복사해서 반환
	public int[] getCopiedArray() {
		int[] tmpArr = new int[length];
		for (int i = 0; i < length; i++) {
			tmpArr[i] = arr[i];
		}
		return tmpArr;
		// return arr.clone();
	}
	
	// 인덱스를 입력받아 해당하는 값 반환
	public int getValue(int index) {
		return (indexCheck(index)) ? arr[index] : ERROR;
	}
		
	// 객체가 참조하는 배열의 길이 반환
	public int getLength() {
		return length;
	}
}
