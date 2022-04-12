package basketball;

public class Goal {
	
	// 각 슛의 횟수
	private int countGoal1;
	private int countGoal2;
	private int countGoal3;
	// 각 슛의 점수
	private int scoreGoal1;
	private int scoreGoal2;
	private int scoreGoal3;
	// 각 슛의 횟수와 점수의 총합
	private int countGoalTotal;
	private int scoreGoalTotal;
	
	// 디폴트 생성자
	public Goal() {
		countGoal1 = 0;
		countGoal2 = 0;
		countGoal3 = 0;
	}
	
	// 사용자가 각 슛의 횟수를 초기화할 수 있는 메서드
	public void setCountGoal1(int countGoal1) {
		this.countGoal1 = countGoal1;
	}
	public void setCountGoal2(int countGoal2) {
		this.countGoal2 = countGoal2;
	}
	public void setCountGoal3(int countGoal3) {
		this.countGoal3 = countGoal3;
	}
	
	// 각 슛의 횟수를 반환하는 메서드
	public int getCountGoal1() {
		return countGoal1;
	}
	public int getCountGoal2() {
		return countGoal2;
	}
	public int getCountGoal3() {
		return countGoal3;
	}
	
	// 각 슛의 횟수를 추가하는 메서드
	public void countUpGoal1() {
		countGoal1++;
	}
	public void countUpGoal2() {
		countGoal2++;
	}
	public void countUpGoal3() {
		countGoal3++;
	}
	
	// 각 슛의 합산 점수를 내는 메서드
	public int countGoal1ToScore() {
		scoreGoal1 = countGoal1 * 1;
		return scoreGoal1;
	}
	public int countGoal2ToScore() {
		scoreGoal2 = countGoal2 * 2;
		return scoreGoal2;
	}
	public int countGoal3ToScore() {
		scoreGoal3 = countGoal3 * 3;
		return scoreGoal3;
	}
	
	// 모든 슛의 횟수를 합산해서 반환하는 메서드
	public int getGoalTotal() {
		countGoalTotal = countGoal1 + countGoal2 + countGoal3;
		return countGoalTotal;
	}
	// 모든 슛의 합산 점수의 총합을 반환하는 메서드
	public int getScoreTotal() {
		scoreGoalTotal = scoreGoal1 + scoreGoal2 + scoreGoal3;
		return scoreGoalTotal;
	}
	
}
