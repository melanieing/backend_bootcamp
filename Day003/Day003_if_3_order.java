package examjava03;
// 세 수를 입력받아 큰 순서대로 출력
import java.util.Scanner;

public class Day003_if_3_order {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 수를 입력하시오: ");
		// 방법1 (swap)
		int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
		int temp;
		
		if (second > first && second > third) {
			temp = first;
			first = second;
			second = temp;
		} else if (third > first && third > second) {
			temp = first;
			first = third;
			third = temp;
		} 
		if (third > second) {
			temp = second;
			second = third;
			third = temp;
		}
		
		System.out.printf("큰 순서대로 나열 : %d, %d, %d", first, second, third);

		// 방법2 (if - else if - else문)
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if (a >= b) {
			if (a >= c) {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", a,b,c);
			} else {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", a,c,b);
			}
		} else if (b >= c) {
			if (a >= c) {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", b,a,c);
			} else {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", b,c,a);
			}
		} else {
			if (a >= b) {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", c,a,b);
			} else {
				System.out.printf("큰 순서대로 나열 : %d, %d, %d", c,b,a);
			}
		}
		
		sc.close();
	}
}
