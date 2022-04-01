package basic_examples;
// 1~100까지 홀수의 합과 짝수의 합
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
		
		System.out.printf("1부터 100까지 홀수의 합 : %,d\n", oddSum);
		System.out.printf("1부터 100까지 짝수의 합 : %,d", evenSum);
	}
}
