package examjava03;
// �� ������ ������ �Է¹޾� �հ�� ����� ���ϰ�
// ����� 90 �̻��̸� "A", 80 �̻��̸� "B"
// 70 �̻��̸� "C", 60 �̻��̸� "D", 60 �̸��̸� "F"�� ���
import java.util.Scanner;

public class Day003_if_subject {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ ������ �Է��Ͻÿ�: ");
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
		
		System.out.printf("����� ������ %c�Դϴ�.", grade);
		sc.close();
	}
}
