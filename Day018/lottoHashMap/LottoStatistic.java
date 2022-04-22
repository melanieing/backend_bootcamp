package lotto_hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LottoStatistic {
	public static void main(String[] args) {
		
		// 100회차까지 당첨번호 생성하기
		final int COUNT_MAX = 100;
		
		Map<Integer, int[]> map = new LinkedHashMap<>();
			
		for (int count = 1; count <= COUNT_MAX; count++) {
			Lotto lotto = new Lotto();
			lotto.drawLotto();
			map.put(count, lotto.getLottoNums()); // value : int[] lottoNums
			System.out.println(String.format("■%03d회차■ ", count) + lotto.printLottoNums());
		}
		
		// 당첨번호 통계 생성하기
		int[] count = new int[Lotto.LOTTO_NUM_MAX]; // 1번부터 45번까지 카운트배열 생성
		for (int key = 1; key <= COUNT_MAX; key++) { // 1 ~ 100회차까지 
			int[] tempArr = map.get(key); // 배열 하나를 담고
			for (int i = 0; i < Lotto.LOTTO_NUM_MAX; i++) { // 1 ~ 45 까지 숫자
				for (int j = 0; j <Lotto.LOTTO_NUM_LENGTH; j++) { // 0 ~6까지 인덱스
					if (i+1 == tempArr[j]) {
						count[i]++;
					}
				}
			}		
		}
		// 당첨번호 통계 출력
		System.out.println();
		for (int i = 0; i < count.length; i++) {
			if ((i != 0) && (i % 5 == 0)) {
				System.out.println();
			}
			System.out.print(String.format("[%02d]번 : (%02d)회\t", i+1, count[i]));
		}
	
	}

}
