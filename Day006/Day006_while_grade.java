package while_examples;
//국어, 영어, 수학 과목 점수를 입력받아
//총점, 평균, 학점을 출력
import java.util.Scanner;

public class Day006_while_grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double kor = 0, eng = 0, mat = 0;
		double sum = 0, avg = 0;
		char grade = 0;
		
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		kor = sc.nextDouble();
		eng = sc.nextDouble();
		mat = sc.nextDouble();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		while (avg >= 0 && avg <= 100) {
			if (avg >= 90) {
				grade = 'A';
				break;
			} else if (avg >= 80) {
				grade = 'B';
				break;
			} else if (avg >= 70) {
				grade = 'C';
				break;
			} else if (avg >= 60) {
				grade = 'D';
				break;
			} else {
				grade = 'F';
				break;
			}
		}
		
		System.out.printf("총점 : %.2f\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.printf("학점 : %c", grade);
		
		sc.close();
	}
}
