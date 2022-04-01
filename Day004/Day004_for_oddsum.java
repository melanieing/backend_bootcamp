package more_examples;
// 1부터 시작하여 홀수의 합을 구하면서
// 그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램
public class Day004_for_oddsum {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		// 방법1
		for (i = 1; sum < 10000; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.printf("마지막 수 %d를 더한 합계 : %,d", i-1, sum);
		
		// 방법2
		while (true) {
			i++;
			if (i % 2 != 0) {
				sum += i;
				if (sum >= 10000) {
					System.out.printf("마지막 수 %d를 더한 합계 : %,d", i, sum);
					break;
				}
			}
		}
	}
}
