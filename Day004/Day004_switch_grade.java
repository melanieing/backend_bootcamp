package switch_examples;
// 성적표 만들기
// 100-95점 : 'A+', 94-90점 : 'A'
// 89-85점 : 'B+', 84-80점 ; 'B'
// 79-75점 : 'C+', 74-70점 : 'C'
// 69-65점 : 'D+', 64-60점 : 'D'
// 59-점 : 'F'
import java.util.Scanner;

public class Day004_switch_grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 특이하게 해보기
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		sc.close();
		
		// 변수 선언과 초기화
		String grade = "";
		String plus = "";
		
		switch (score/10) {
		case 10:
			grade = "A+"; break;
		case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		case 6:
			grade = "D"; break;
		default:
			grade = "F";
			System.out.print("당신의 성적은? " + grade);
			return;
		}
		
		switch (score % 10) {
		case 9:	case 8:	case 7:	case 6:	case 5:
			// if를 쓰지 않기 위해 위에서 return을 사용해봄!
			// if (score >= 60) 
				plus = "+";
				break;			
		}
		System.out.print("당신의 성적은? " + grade + plus);
	}
}
