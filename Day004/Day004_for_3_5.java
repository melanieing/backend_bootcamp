package basic_examples;
// 1 ~ 100까지의 수 중 3의 배수 제외, 3의 배수이면서 5의 배수인 수를 더해 출력
public class Day004_for_3_5 {
	public static void main(String[] args) {

		int i = 0, sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 != 0 || i % 15 == 0) {
//				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
