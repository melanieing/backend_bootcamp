package examjava03;
// 디스켓 1통에 5000원
// 한 번에 10통 이상을 사면 전체 금액의 10%를 할인
// 100통 이상을 사면 전체 금액의 12% 할인
// X통의 디스켓을 사려면 얼마?
import java.util.Scanner;

public class Day003_if_disk {
	public static void main(String[] args) {
		
		int basePrice = 5000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("디스켓 몇 통을 구매하시겠습니까? ");
		int orderDisk = sc.nextInt();
		double orderPrice = 0;
		
		if (orderDisk >= 100) {
			orderPrice = orderDisk * basePrice * 0.88;
		} else if (orderDisk >= 10) {
			orderPrice = orderDisk * basePrice * 0.9;
		}
		
		System.out.printf("%d통의 디스크의 구매 총 금액은 %,d입니다.", orderDisk, (int)orderPrice);
		
		sc.close();
	}
}
