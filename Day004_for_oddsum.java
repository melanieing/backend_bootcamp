package forHW;
// 1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭
// �� ���� 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷�
public class Day004_for_oddsum {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		// ���1
		for (i = 1; sum < 10000; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.printf("������ �� %d�� ���� �հ� : %,d", i-1, sum);
		
		// ���2
		while (true) {
			i++;
			if (i % 2 != 0) {
				sum += i;
				if (sum >= 10000) {
					System.out.printf("������ �� %d�� ���� �հ� : %,d", i, sum);
					break;
				}
			}
		}
	}
}
