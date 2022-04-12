package doll_clear;

public class Doll {

	// 인스턴스 변수 선언
	private Battery battery; // 배터리 객체를 참조
	private String bType; 	 // 인형의 배터리 타입 
	private String message;  // 인형의 녹음 저장소
	// 클래스 변수 선언
	public static final int REC_W = 20; //상수 : 녹음 시 필요한 전력량
	public static final int SPK_W = 10; //상수 : 출력 시 필요한 전력량
	
	// 생성자로 인스턴스 변수 초기화
	public Doll(String bType){ // 인형의 배터리 타입 설정
		this.bType = bType;
		message = "녹음하세요."; // 녹음 전 디폴트값 설정
	}
	
	//배터리 삽입
	public Battery insertBattery(Battery battery) { // 배터리를 넣고
		if (!battery.getType().equals(bType)) { // 인형의 배터리 타입과 맞지 않으면
			System.out.println("배터리 타입 오류!");
			return null;
		}
		Battery bTmp = removeBattery(); // 남아있는 배터리는 반환
		this.battery = battery; // 새로운 배터리 넣기
		System.out.println("배터리 장착 완료!");
		return bTmp;
	}
	
	//배터리 제거
	public Battery removeBattery() {
		Battery bTmp = null;
		if (battery != null) { // 안에 있는 배터리가 남아있다면
			bTmp = battery; // 남아있던 배터리를 반환
		}
		return bTmp; // 남아있는 배터리가 없다면 0을 반환
	}
	
	// 녹음 기능
	public void record(String message) {
		System.out.println("녹음 기능 실행 (현재 용량 : " + battery.getCap() + ")");
		if (battery == null) // 배터리가 없으면 기능X
			return;
		int w = battery.electric(REC_W); // 남을 용량 예상해서 가져오기
		if(w >= REC_W) { // 남은 용량이 녹음 시 필요한 전력량보다 크거나 같다면
			this.message = message; // 녹음 완료
			System.out.println("녹음 완료 (남은 용량 : " + battery.getCap() + ")");

		} else {
			System.out.println("배터리가 부족하여 녹음이 불가합니다!");
		}
	}
	
	// 녹음된 메시지 출력
	public void speak() {
		System.out.println("출력 기능 실행 (현재 용량 : " + battery.getCap() + ")");
		int w = battery.electric(SPK_W); // 남을 용량 예상해서 가져오기
		if(w >= SPK_W) { // 남은 용량이 출력 시 필요한 전력량보다 크거나 같다면
			System.out.println("message:" + message); // 출력 완료
			System.out.println("출력 완료 (남은 용량 : " + battery.getCap() + ")");

		} else { // 남은 용량이 출력 시 필요한 전력량보다 작다면
			System.out.println("배터리가 부족하여 출력이 불가합니다!");
		}
	}
	
}
