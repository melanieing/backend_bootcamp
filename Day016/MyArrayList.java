package myArrayList;

public class MyArrayList implements MyList {
	
	private Object[] arr;
	private int currentIndex = 0;
	private static final int DEFAULT_SIZE = 5;
	private static final int ERROR = -1;
	
	public MyArrayList() {
		arr = new Object[DEFAULT_SIZE];
	}
	
	public MyArrayList(int size) {
		arr = new Object[size];
	}
	
	// 유효한 인덱스인지 확인하는 메서드
	public boolean indexCheck(int index) {
		return (0 <= index && index < arr.length) ? true : false;
	}
	
	public int getSize() {
		return currentIndex;
	}
	
	@Override // 다음 인덱스에 값 넣기
	public boolean add(Object obj) {
		if (currentIndex == arr.length) {
			extension();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = obj;
				currentIndex++;
				return true;
			}
		}
		return false;
	}
	
	@Override // 특정 인덱스에 값 넣기
	public boolean add(int index, Object obj) {
		if (currentIndex == arr.length) {
			extension();
		}
		if (index < currentIndex) {
			for (int i = currentIndex; i >= index; i--) {
				arr[i+1] = arr[i];
			}
			arr[index] = obj;
			currentIndex++;
			return true;
		}
		return false;
	}
	
	// 특정 인덱스 값 반환
	public Object getValue(int index) {
		return (indexCheck(index)) ? arr[index] : ERROR;
	}	
	
	@Override
	public String toString() {
		// 인덱스 번호 없이 연이어서 값들 보는 버전
		StringBuffer result = new StringBuffer("MyArrayList [");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				result.append(arr[i]);
				break;
			}
			result.append(arr[i] + ", ");
		}
		result.append("]");
		return result.toString();
		
		// 인덱스 번호 붙여서 보는 버전
//		String toStr = "";
//		for (int i = 0; i < arr.length; i++) {
//			toStr += "arr" + arr.hashCode() + "[" + i + "] : " + arr[i] + "\n";
//		}
//		return toStr;
	}
	
	private void extension() {
		Object[] tmp = arr;
		arr = new Object[tmp.length + DEFAULT_SIZE];
		for (int i = 0; i < tmp.length; i++) {
			arr[i] = tmp[i];
		}
	}
}