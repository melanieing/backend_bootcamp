package examjava02;
// 사용자의 이니셜을 입력받아 출력하기

import java.util.Scanner;

public class Day002_initial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이니셜을 문자열로 한 번에 받는 방법
		System.out.println("이니셜을 입력하세요.");
		String init = sc.nextLine();

		System.out.println("입력한 이니셜은" + init + "입니다.");
		System.out.println("당신이 입력한 이니셜 : " + init.charAt(0) + "." + init.charAt(1) + "." + init.charAt(2));

		// 2. 이니셜 입력을 한 글자씩 받는 방법
		System.out.println("첫 번째 이니셜 입력: ");
		char init1 = sc.nextLine().charAt(0);
		System.out.println("두 번째 이니셜 입력: ");
		char init2 = sc.nextLine().charAt(0);
		System.out.println("세 번째 이니셜 입력: ");
		char init3 = sc.nextLine().charAt(0);
		
		System.out.println(init1 + "." + init2 + "." + init3);
		
		// 3. for문으로 출력하기
		System.out.println("이니셜 입력: ");
		String initial = sc.nextLine();
		
		for (int i = 0; i < initial.length(); i++) {
			System.out.println(initial.charAt(i));
		}
		
		sc.close();

	}
}
