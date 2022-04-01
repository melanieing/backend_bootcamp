package while_examples;
//1부터 시작하여 홀수의 합을 구하면서
//그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램
public class Day006_while_oddsum {
	public static void main(String[] args) {
		
		// while문 사용
		int i = 1;
		int sum = 0;
		
		while (sum < 10000) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.printf("마지막 수 %d를 더한 합계 : %,d", i-1, sum);

		// 비교 : for문 사용
//		int i = 0;
//		int sum = 0;
//		
//		for (i = 1; sum < 10000; i++) {
//			if (i % 2 != 0) {
//				sum += i;
//				System.out.printf("%d를 더한 합계 : %,d\n", i, sum);
//			}
//		}
//		System.out.printf("마지막 수 %d를 더한 합계 : %,d", i-1, sum);

	}
}
