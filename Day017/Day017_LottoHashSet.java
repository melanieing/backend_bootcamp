package lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// get 6 lotto numbers randomly! 

public class Day017_LottoHashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		HashSet<Integer> is = new HashSet<>();
		final int lottoSize = 6;

		char answer;
		
		while (true) {
			for (int i = 0; i < lottoSize; i++) {
				is.add(ran.nextInt(45)+1);
			}	
			System.out.print("로또 자동 번호 : ");
			Iterator<Integer> it = is.iterator();
			while (it.hasNext()) {
				Integer lottoNum = it.next();
				System.out.print(lottoNum + " ");
			}
			System.out.print("\n추첨을 종료하시겠습니까?(y/n)");
			answer = sc.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				System.out.println("추첨을 종료합니다!");
				break;
			} 
			is.clear();
		}
		sc.close();	

	}

}
