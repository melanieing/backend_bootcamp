package basketball_ver3;

public class Main {
	public static void main(String[] args) {
		BasketCounter bc = new BasketCounter();
		bc.goal(1);		bc.goal(2);
		bc.goal(2);		bc.goal(1);
		bc.goal(1);		bc.goal(3);
		bc.goal(3);		bc.goal(3);
		bc.goal(2);		bc.goal(2);
		
		bc.printScore();
		System.out.println(bc.getGoal2());
		System.out.println(bc.getScore3());
		System.out.println(bc.getScoreT());
		
		bc.init();
		bc.printScore();
		bc.goal(2);		bc.goal(1);
		bc.goal(1);		bc.goal(3);
		bc.goal(3);		bc.goal(3);
		
		int[] goals = bc.getGoals();
		int[] scores = bc.getScores();
		for(int i = 0; i < BasketCounter.TOTAL_POINT; i++) {
			System.out.println(i+1+"점");
			System.out.print("골:" + goals[i]);
			System.out.println("(" + scores[i] + "점)");
		}
		System.out.print("전체골:" + goals[BasketCounter.TOTAL_POINT]);
		System.out.println("(" + scores[BasketCounter.TOTAL_POINT] + "점)");
		
		
	}
}


