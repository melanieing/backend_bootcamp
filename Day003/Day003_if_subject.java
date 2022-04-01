package examjava03;
// 세 과목의 성적을 입력받아 합계와 평균을 구하고
// 평균이 90 이상이면 "A", 80 이상이면 "B"
// 70 이상이면 "C", 60 이상이면 "D", 60 미만이면 "F"를 출력
import java.util.Scanner;

public class Day003_if_subject {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 과목의 성적을 입력하시오: ");
		double sub1 = sc.nextDouble(), sub2 = sc.nextDouble(), sub3 = sc.nextDouble();
	
		double sum = sub1+sub2+sub3;
		double avg = sum / 3.0;
		char grade = 0;
		
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'c';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		
		System.out.printf("당신의 성적은 %c입니다.", grade);
		sc.close();
	}
}
