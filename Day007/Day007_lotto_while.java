package random;
// 배열을 이용하여 Lotto 프로그램 만들기
// 추첨을 종료할 때까지 계속 추첨할 수 있도록 만들기
import java.util.Random;
import java.util.Scanner;

public class Day007_lotto_while {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] lotto = new int[6]; // 로또 번호 6개 넣을 배열
		char answer;
		
		while (true) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ran.nextInt(45)+1;
				for  (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
					}
				}
			}	
			System.out.print("로또 자동 번호 : ");
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + "\t");
			}
			System.out.print("\n추첨을 종료하시겠습니까?(y/n)");
			answer = sc.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				System.out.println(answer);
				System.out.println("추첨을 종료합니다!");
				break;
			} 
		}
		sc.close();
		
	}
}
