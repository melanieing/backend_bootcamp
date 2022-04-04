package random;

import java.util.Random;
import java.util.Scanner;

// 셔플 기법
/* 1. 45개의 요소를 가진 배열 생성
 *  2. 1번에서 생성한 배열에 1 ~ 45를 저장
 *  3. 랜덤값 2개를 구함 (0 ~ 44)
 *  4. 3번에서 구한 값에 해당하는 배열의 값을 스왑
 *  5. 4번을 n번 반복
 *  6. 배열에서 6개의 값을 출력
 */
public class Day007_lotto_shuffle {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int[] lottoList = new int[45];
		
		for (int i = 0; i < lottoList.length; i++) {
			lottoList[i] = i+1;
		}
				
		System.out.print("몇 번 섞을까요? : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			int temp;
			int ranNum1 = ran.nextInt(44);
			int ranNum2 = ran.nextInt(44);
			
			temp = lottoList[ranNum1];
			lottoList[ranNum1] = lottoList[ranNum2];
			lottoList[ranNum2] = temp;
		}
				
		System.out.print("셔플된 로또 자동 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoList[i] + " ");
		}

	}
}
