package array;
// 국어, 영어, 수학, 총점, 평균을 구하는 프로그램
// 0 ~ 100 사이의 점수만 입력되도록 구현
// 필요한 것이 있다면 자유롭게 추가 (평균값을 위한 실수형 변수 등)
import java.util.Scanner;

public class Day007_array_score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] subName = new String[] {"국어", "영어", "수학"};
		
		int[] scoreList = new int[subName.length+1]; // 국어, 영어, 수학점수, 총합
		double avg = 0.0;
		
		for (int i = 0; i < subName.length; i++) {
			do {
				System.out.print(subName[i] + "점수 입력 :");
				scoreList[i] = sc.nextInt();
			} while (scoreList[i] < 0 || scoreList[i] > 100); // 점수가 벗어난 범위라면, do 계속 돌려서 못빠져나감
			scoreList[subName.length] += scoreList[i]; // 마지막 인덱스값에 총합 넣기
		}		
		sc.close();
		
		avg = scoreList[subName.length] / (double)scoreList.length;
		System.out.println("총점 : " + scoreList[subName.length]);
		System.out.println("평균 : " + String.format("%.2f", avg));
	
	}
}
