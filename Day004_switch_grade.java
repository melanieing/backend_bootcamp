package examjava04;
// ����ǥ �����
// 100-95�� : 'A+', 94-90�� : 'A'
// 89-85�� : 'B+', 84-80�� ; 'B'
// 79-75�� : 'C+', 74-70�� : 'C'
// 69-65�� : 'D+', 64-60�� : 'D'
// 59-�� : 'F'
import java.util.Scanner;

public class Day004_switch_grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Ư���ϰ� �غ���
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = sc.nextInt();
		sc.close();
		
		// ���� ����� �ʱ�ȭ
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
			System.out.print("����� ������? " + grade);
			return;
		}
		
		switch (score % 10) {
		case 9:	case 8:	case 7:	case 6:	case 5:
			// if�� ���� �ʱ� ���� ������ return�� ����غ�!
			// if (score >= 60) 
				plus = "+";
				break;			
		}
		System.out.print("����� ������? " + grade + plus);
	}
}
