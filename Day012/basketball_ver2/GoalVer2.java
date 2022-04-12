package basketball_ver2;

public class GoalVer2 {

	private int type; // 슛 종류
	private int count; // 슛 횟수
	private int score; // 슛 점수
	

	// 슛의 종류를 입력하는 생성자
	public GoalVer2(int type) {
		this.type = type;
	}
	
	// 슛의 횟수를 설정하기
	public void setCount(int count) {
		this.count = count;
	}
	
	// 슛의 횟수를 반환하기
	public int getCount() {
		return count;
	}
	
	// 슛의 횟수를 증가시키기
	public void countUp() {
		count++;
	}
	
	// 슛의 횟수를 이용해 점수 구하기
	public int countToScore() {
		score = count * type;
		return score;
	}
	
}
