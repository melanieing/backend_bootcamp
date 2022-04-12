package doll_clear;

public class Battery {
	
	// 인스턴스 변수 선언
	private int capacity;
	private String type;
	
	// 매개변수가 없는 public 생성자
	public Battery(){ }
	
	// 매개변수가 있는 public 생성자 
	public Battery(int capacity, String type){
		setCap(capacity);
		setType(type);
	}
	
	// public 메서드
	public void setCap(int capacity) { // 배터리 용량을 설정
		this.capacity = capacity;
	}
	
	public void setType(String type) { // 배터리 타입을 설정
		this.type = type;
	}
	
	public int getCap() { // 배터리 용량을 확인
		return capacity;
	}
	
	public String getType() { // 배터리 타입을 확인
		return type;
	}
	
	// 전력을 사용하고 남은 용량 반환하는 메서드
	public int electric(int w) { 	// 필요한 전력량을 넣는데,
		if (capacity - w >= 0) { // 용량이 필요한 전력량보다 많이 있다면
			capacity -= w; 		// 필요한 전력량만큼 사용하고 남은 전력량을 
			return w; 			// 반환
		} else {				// 용량이 부족하면
			int tmp = capacity; 
			capacity = 0;		// 현재 용량은 0이 되고
			return tmp;			// 남아있던 용량을 반환 
		}
	}
	
}
