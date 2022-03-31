package repeat;
// 100 ~ 1 중 3의 배수 출력
public class Day004_for_3 {
	public static void main(String[] args) {

		int i = 0;
		for (i = 100; i > 0; i--) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
