package repeat;
// 1~100���� Ȧ���� �հ� ¦���� ��
public class Day004_for_odd_even {
	public static void main(String[] args) {
		
		int i = 0, j = 0;
		int oddSum = 0, evenSum = 0;
		
		for (i = 1; i <= 100; i+=2) {
			oddSum += i;
		}
		
		for (j = 0; j <= 100; j+=2) {
			evenSum += j;
		}
		
		System.out.printf("1���� 100���� Ȧ���� �� : %,d\n", oddSum);
		System.out.printf("1���� 100���� ¦���� �� : %,d", evenSum);
	}
}
