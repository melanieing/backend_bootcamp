package method;

import java.util.Scanner;
// 인자로 N을 전달하면 N에 대한 절댓값을 반환하는 메서드 만들기
public class Day010_MethodAbsolute {
	public static int absolute(int N) {
		if (N >= 0) {
			return N;
		} else {
			return N*-1;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수의 절댓값을 구하시겠습니까? : ");
		int N = sc.nextInt();
		
		System.out.println(absolute(N));
		
		sc.close();
	}
}
