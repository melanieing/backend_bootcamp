package examjava02;
// 3 과목(국어, 영어, 수학)의 성적을 입력 받기
// 합계와 평균을 출력하기
import java.util.Scanner;

public class Day002_grade {

	public static void main(String[] args) {
		
//		int kor = 0, eng = 0, mat = 0;
//		int sum = 0;
//		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 점수 입력 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 점수 입력 : ");
		double mat = sc.nextDouble();
		
		double sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.println("합계: " + sum + "점");
		System.out.println("평균: " + (Math.round(avg*100)/(double)100) + "점");
		
		sc.close();

	}

}
