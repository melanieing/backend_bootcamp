package examjava03;
// 입력한 데이터가 3의 배수인 경우 출력하시오

import java.util.Scanner;

public class Day003_if_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터를 입력하시오: ");
		int data = sc.nextInt();
		
		if (data % 3 == 0) {
			System.out.printf("%d는 3의 배수입니다.", data);
		}
		
		sc.close();
	}

}
