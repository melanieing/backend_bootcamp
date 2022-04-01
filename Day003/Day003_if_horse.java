package examjava03;

import java.util.Scanner;

// 유원지에서 말을 태워주는데 처음 30분의 기본요금은 1인당 3000원이다.
// 이후에는 10분당 500원씩의 추가 요금을 받는다.
// 말을 탄 시간을 입력받아서 전체 금액을 계산하는 프로그램을 작성해라.

public class Day003_if_horse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 방법1 (soft coding)
		int basePrice = 3000;
		int baseTime = 30;
		
		int perUseTime = 10;
		int perUsePrice = 500;
		
		int useTime = 0;
		int usePrice = 0;
		
		System.out.println("말 탄 시간: ");
		useTime = sc.nextInt();
		
		if (useTime >= 0 && useTime <= baseTime) {
			useTime = baseTime;
		} else if (useTime > baseTime) {
			int addTime = useTime - baseTime;
			int addPrice = addTime / perUseTime * perUsePrice;
			usePrice = basePrice + addPrice;
		}
		
		System.out.println("이용 금액: " + usePrice + "원");
		
		// 방법2 (hard coding)
		int fee = 0;
		
		System.out.print("인원 수와 말을 탄 시간(분)을 입력하시오: ");
		int many = sc.nextInt(), time = sc.nextInt();
		
		if (time >= 0 && time <= 30) {
			fee = 3000 * many;
		} else {
			fee = (3000 + (time-30)/10 * 500) * many;
		}
		
		System.out.printf("전체 금액은 %,d원 입니다.", fee);
		
		sc.close();
	}
}
