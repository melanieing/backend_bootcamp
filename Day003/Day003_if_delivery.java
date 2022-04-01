package examjava03;
// 배달 도시락 주문하는데 10개까지는 개당 2500원,
// 10개를 초과하는 양에 대해서는 개당 2400원
// 배달 도시락 개수를 입력받아서 금액을 계산하는 프로그램
import java.util.Scanner;

public class Day003_if_delivery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baseBox = 10;
		int basePrice = 2500;
		
		int addPrice = 2400;
		
		int orderBox = 0;
		int orderPrice = 0;
		
		System.out.print("배달 도시락의 개수를 입력하시오: ");
		orderBox = sc.nextInt();
		
		if (orderBox <= baseBox) {
			orderPrice = orderBox * basePrice;
		} else {
			orderPrice = baseBox * basePrice + (orderBox-10) * addPrice;
		}
		
		System.out.printf("배달 도시락 %d개의 주문 금액은 %,d입니다.", orderBox, orderPrice);
				
		sc.close();

	}
}
