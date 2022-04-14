package myArray;

public class MyArrayUtil extends MyArray {

	// 생성자(요소를 5개 가지는 배열 생성)
	public MyArrayUtil() {
		initArray(DEFAULT_LENGTH);
	}
	
	// 생성자 오버로딩 (정수를 전달받아 길이로 사용)
	public MyArrayUtil(int length) {
		initArray(length);
	}
	
	// 배열에 모든 값의 합을 반환
	public int getValueSum() {
		int valueSum = 0;
		for (int i = 0; i < this.getLength(); i++) {
			valueSum += this.getArray()[i];
		}
		return valueSum;
	}
	
	// 배열에 특정 값이 존재하는지 확인하여 해당 위치를 반환
	public int ifThereGetIndex(int value) {
		for (int i = 0; i < this.getLength(); i++) {
			if (value == this.getValue(i)) {
				return i;
			}
		}
		return ERROR;
	}
	// 배열에 특정 값이 존재하는지를 특정 인덱스부터 탐색해서 해당 위치 반환
	public int ifThereGetIndex(int startIndex, int searchValue) {
		for (int i = startIndex; i < this.getLength(); i++) {
			if (searchValue == this.getValue(i)) {
				return i;
			}
		}
		return ERROR;
	}
}
