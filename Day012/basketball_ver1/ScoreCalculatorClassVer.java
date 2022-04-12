package basketball;

import java.util.Scanner;

public class ScoreCalculatorClassVer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Goal goal = new Goal(); // 디폴트 생성자를 통해 각 슛의 횟수 0으로 초기화

		while (true) {
			System.out.print("골 입력 (0:종료) : ");
			int input = sc.nextInt();
			
			if (input == 0) {
				System.out.println("프로그램 종료!");
				break;
			} else if (input == 1) {
				goal.countUpGoal1();
			} else if (input == 2) {
				goal.countUpGoal2();
			} else if (input == 3) {
				goal.countUpGoal3();
			} else {
				System.out.println("잘못 입력하셨습니다! 1점, 2점, 3점 중에서 입력하십시오!");
			}
		}
		
		System.out.println("--------------------");
		System.out.println("슛 종류\t슛 횟수\t점수");
		System.out.println("1점 슛\t" + goal.getCountGoal1() + "번\t" + goal.countGoal1ToScore() + "점");
		System.out.println("2점 슛\t" + goal.getCountGoal2() + "번\t" + goal.countGoal2ToScore() + "점");
		System.out.println("3점 슛\t" + goal.getCountGoal3() + "번\t" + goal.countGoal3ToScore() + "점");
		System.out.println("--------------------");
		System.out.println("total\t" + goal.getGoalTotal() + "번\t" + goal.getScoreTotal() + "점");
		
		sc.close();
	}
	
}
