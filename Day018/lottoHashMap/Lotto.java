package lotto_hashMap;

public class Lotto {

	private int[] lottoNums; // 로또 번호
//	private int count; 		 // 회차
	public static final int LOTTO_NUM_LENGTH = 7; // 로또 번호 6개 + 보너스 번호 1개
	public static final int LOTTO_NUM_MAX = 45; // 로또 번호 최댓값
	
	public Lotto() {
		this.lottoNums = new int[LOTTO_NUM_LENGTH];
	}
	
	public void drawLotto() { // 로또 번호 7개 뽑기
		for (int i = 0; i < LOTTO_NUM_LENGTH; i++) {
			this.lottoNums[i] = (int)(Math.random()*LOTTO_NUM_MAX) + 1;
			for  (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					i--;
				}
			}
		}
	}

	public int[] getLottoNums() {
		return lottoNums;
	}

	public void setLottoNums(int[] lottoNums) {
		this.lottoNums = lottoNums;
	}

	public String printLottoNums() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 7; i++) {
			if (i == 6) {
				sb.append(String.format(" Bonus[%02d]", lottoNums[i]));
				break;
			}
			sb.append(String.format("%02d ", lottoNums[i]));
		}
		return " " + sb;
	}
	
	
}
