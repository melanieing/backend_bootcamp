package examjava04;
// 메뉴를 만들어 관리 프로그램 짜보기
// 한 번에 하나의 메뉴만 실행 가능, 하나의 메뉴 동작 후 프로그램 종료 (while 사용 x)
import java.util.Scanner;

public class Day004_switch_menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언과 초기화 
		String name = "";
		double kor = 0.0;
		double eng = 0.0;
		double mat = 0.0;
		             
		double sum = 0.0;
		double avg = 0.0;
		
		while (true) {
			System.out.println("1. 학생 이름 등록");
			System.out.println("2. 국어, 영어, 수학 점수 입력");
			System.out.println("3. 학생 이름 출력");
			System.out.println("4. 총점 출력");
			System.out.println("5. 평균 출력");
			System.out.println("6. 종료");
			System.out.println("---------------------------");
			System.out.print("위의 메뉴 중 해당하는 번호를 입력하시오: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				System.out.println("당신이 입력한 이름 : " + name);
				break;
			case 2:
				System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
				kor = sc.nextDouble();
				eng = sc.nextDouble();
				mat = sc.nextDouble();
				System.out.println("당신이 입력한 국어 점수 : " + kor);
				System.out.println("당신이 입력한 영어 점수 : " + eng);
				System.out.println("당신이 입력한 수학 점수 : " + mat);
				break;
			case 3:
				System.out.println("등록된 학생 이름 : " + name);
				break;
			case 4:
				sum = kor + eng + mat;
				System.out.println("세 과목 점수의 총점 : " + sum);
				break;
			case 5:
				avg = sum / 3.0;
				System.out.println("세 과목 점수의 평균 : " + String.format("%.2f", avg));
				break;
			case 6:
				System.out.println("프로그램을 종료합니다!");
				System.exit(0); // 현재의 자바 프로그램 종료 메소드
			}
			sc.close();
		}
	}
}
