package repeat;
// 1���� 100������ �� ���ϱ�
public class Day004_for_sum {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1���� 100������ �� : %d", sum);
	}
}
