package basketball_ver2;

import java.util.Scanner;

public class ScoreCalculatorVer2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GoalVer2 goal1 = new GoalVer2(1); // 1점 슛 객체 생성
		GoalVer2 goal2 = new GoalVer2(2); // 2점 슛 객체 생성
		GoalVer2 goal3 = new GoalVer2(3); // 3점 슛 객체 생성
		
		while (true) {
			System.out.print("골 입력 (0:종료) : ");
			int input = sc.nextInt();
			
			if (input == 0) {
				System.out.println("프로그램 종료!");
				break;
			} else if (input == 1) {
				goal1.countUp();
			} else if (input == 2) {
				goal2.countUp();
			} else if (input == 3) {
				goal3.countUp();
			} else {
				System.out.println("잘못 입력하셨습니다! 1점, 2점, 3점 중에서 입력하십시오!");
			}
		}
		
		System.out.println("--------------------");
		System.out.println("슛 종류\t슛 횟수\t점수");
		System.out.println("1점 슛\t" + goal1.getCount() + "번\t" + goal1.countToScore() + "점");
		System.out.println("2점 슛\t" + goal2.getCount() + "번\t" + goal2.countToScore() + "점");
		System.out.println("3점 슛\t" + goal3.getCount() + "번\t" + goal3.countToScore() + "점");
		System.out.println("--------------------");
		
		int totalCount = goal1.getCount() + goal2.getCount() + goal3.getCount();
		int totalScore = goal1.countToScore() + goal2.countToScore() + goal3.countToScore();
	
		System.out.println("total\t" + totalCount + "번\t" + totalScore + "점");
		
		sc.close();
	}
}
