package random;

import java.util.Random;

// flag 기법
/* 1. 45개의 boolean 배열 생성 (flag 용도)
 * 2. 6칸 짜리 배열 생성 (결과 값을 저장할 배열)
 * 3. 랜덤값을 추출(0~44)
 * 4. 3번에서 추출한 값을 index로 flag배열에서 확인
 * - flag가 false이면 true로 변경하기
 * - 6칸짜리 배열에 모든 값이 저장되면 5번으로!
 * 5. 6칸짜리 결과 배열 값 출고 6칸짜리 배열에 값 저장
 * - flag가 true이면 다시 3번으로!
 */
public class Day007_lotto_flag {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		boolean[] flagList = new boolean[45];
		int[] resultList = new int[6];
		int resultIndex = 0;
		
		while (resultIndex < resultList.length) {
			int index = ran.nextInt(45)+1;
			if (flagList[index] == false) {
				flagList[index] = true;
				resultList[resultIndex] = index;
				resultIndex++;
			} else {
				continue;
			}
		}
		System.out.print("로또 자동 번호 : ");
		for (int i = 0; i < resultList.length; i++) {
			System.out.print(resultList[i] + " ");
		}	

	}
}
