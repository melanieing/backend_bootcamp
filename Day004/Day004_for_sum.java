package basic_examples;
// 1부터 100까지의 합 구하기
public class Day004_for_sum {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1부터 100까지의 합 : %d", sum);
	}
}
