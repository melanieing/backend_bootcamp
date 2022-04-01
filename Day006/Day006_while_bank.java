package while_examples;
//첫 날에 10원을 예금하고, 
//다음날에는 전날의 2배를 예금
//한 달(30일) 동안 저축한 금액은?
public class Day006_while_bank {

	public static void main(String[] args) {
		
		// while문 사용
		int day = 1;
		long bank = 0;
		long money = 10;
		
		while (day <= 30) {
			bank += money;
			money *= 2;
			System.out.printf("날짜 : %d일, 입금액 : %,d원, 잔고 : %,d원\n", day, money, bank);
			day++;
		}
		System.out.printf("총 저축한 금액 : %,d원", bank);
		
		// 비교 : for문 사용
//		for (int d = 1; d <= day; d++) {
//			bank += money;
//			money *= 2;
//			System.out.printf("날짜 : %d일, 입금액 : %,d원, 잔고 : %,d원\n", d, money, bank);
//		}
//		System.out.printf("총 저축한 금액 : %,d원", bank);

	}

}
