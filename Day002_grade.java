package examjava02;
// 3 ����(����, ����, ����)�� ������ �Է� �ޱ�
// �հ�� ����� ����ϱ�
import java.util.Scanner;

public class Day002_grade {

	public static void main(String[] args) {
		
//		int kor = 0, eng = 0, mat = 0;
//		int sum = 0;
//		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		double mat = sc.nextDouble();
		
		double sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.println("�հ�: " + sum + "��");
		System.out.println("���: " + (Math.round(avg*100)/(double)100) + "��");
		
		sc.close();

	}

}
