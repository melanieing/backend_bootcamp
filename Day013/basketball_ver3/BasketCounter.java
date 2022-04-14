package basketball_ver3;

public class BasketCounter {
	
	private Counter[] goals;
	private Counter[] scores;
	
	static final int ONE_POINT = 0;
	static final int TWO_POINT = 1;
	static final int THREE_POINT = 2;
	
	static final int TOTAL_POINT = 3;
	
	// 
	public BasketCounter() {
		init();
	}
	
	public void init() {
		goals = new Counter[4];
		scores = new Counter[4];
		
		for(int i = 0; i < goals.length-1; i++) { // 1, 2, 3점 슛 저장
			goals[i] = new Counter(); // 기본적으로 간격은 1
		}
		for(int i = 0; i < scores.length-1; i++) { // 1, 2, 3점 슛의 점수 저장
			scores[i] = new Counter(i+1); // 1점 슛의 점수 : 1점, 2점 슛의 점수 : 2점, 3점 슛의 점수 : 3점
		}
		goals[TOTAL_POINT] = new Counter();
		scores[TOTAL_POINT] = new Counter();
	}
	// 슛의 종류를 입력받아 골의 횟수와 점수를 증가시키기
	public void goal(int g) {
		g--;
		if(g < ONE_POINT || g > THREE_POINT) {
			return;
		}
		goals[g].increment();
		scores[g].increment();
		
		goals[TOTAL_POINT].increment();
		scores[TOTAL_POINT].setInterval(g+1); // 점수는 입력된 슛의 종류를 다시 1 올려주기
		scores[TOTAL_POINT].increment();
	}
	
	public int getGoal1() {
		return goals[ONE_POINT].getCount();
	}
	public int getGoal2() {
		return goals[TWO_POINT].getCount();
	}
	public int getGoal3() {
		return goals[THREE_POINT].getCount();
	}
	public int getGoalT() {
		return goals[TOTAL_POINT].getCount();
	}
	
	public int getScore1() {
		return scores[ONE_POINT].getCount();
	}
	public int getScore2() {
		return scores[TWO_POINT].getCount();
	}
	public int getScore3() {
		return scores[THREE_POINT].getCount();
	}
	public int getScoreT() {
		return scores[TOTAL_POINT].getCount();
	}
	
	public int[] getScores() {
		int[] scoreArr = new int[scores.length];
		for(int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = scores[i].getCount();
		}
		return scoreArr;
	}

	public int[] getGoals() {
		int[] goalArr = new int[goals.length];
		for(int i = 0; i < goalArr.length; i++) {
			goalArr[i] = goals[i].getCount();
		}
		return goalArr;
	}
	
	public void printScore() {
		System.out.println("결과");
		for(int i = 0; i < TOTAL_POINT; i++) {
			System.out.println(i+1+"점");
			System.out.print("골:" + goals[i].getCount());
			System.out.println("(" + scores[i].getCount() + "점)");
		}
		System.out.print("전체골:" + goals[TOTAL_POINT].getCount());
		System.out.println("(" + scores[TOTAL_POINT].getCount() + "점)");
	}
}












