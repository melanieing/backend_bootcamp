package repeat;
// ���� 10���� �Է¹޾� ��� ���ϱ�
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day004_for_10avg {
	public static void main(String[] args) {

		// 1. ���� 10���� ���ڿ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ���� 10���� �Է��Ͻÿ�: ");
		String str = sc.nextLine();
		sc.close();
		
		// 2. ����� ���� ���� �� �ʱ�ȭ
		String[] numbers = new String[10];
		int i = 0, j = 0, sum = 0;
		double avg = 0.0;
		
		// 3. ���ڿ��� ����������� ��ū���� ������ �迭�� ��� 
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		while (tokenizer.hasMoreTokens()) {
			numbers[i] = tokenizer.nextToken();
			i++;
		}
		
		// 4. �迭�� �ε������� ���� ���ϱ�
		for (j = 0; j < numbers.length; j++) {
			sum += Integer.parseInt(numbers[j]);
//			System.out.println(sum);
		}
		
		// 5. ��ձ��ؼ� ���
		avg = sum / 10.0;
		System.out.printf("��� : %.2f", avg);
	}
}
