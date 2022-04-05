package array;

import java.util.Random;

// 주민번호 생성기 만들기
// arrayIdVerifier에 값을 넣어 검증이 가능한지 확인

public class Day008_arrayIdMaker {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] id = new int[13];
		int[] idVerify = new int[id.length];
		
		for (int i = 0; i <id.length-1; i++) {
			id[i] = ran.nextInt(10);
			if (i >=0 && i <= 7) { // 0 ~ 7 자리까지 
				idVerify[i] = id[i] * (i+2);
			} else { // 8 ~ 12자리까지
				idVerify[i] = id[i] * (i-6);
			}
			idVerify[id.length-1] += idVerify[i];
		}
		
		int verifier = 11 - (idVerify[id.length-1] % 11); // 11 - 0 ~10 = 11 ~ 1의 범위
		switch(verifier) {
		case 10:
			id[id.length-1] = 0;
			break;
		case 11:
			id[id.length-1] = 1;
			break;
		default:
			id[id.length-1] = verifier;
		}
		
		System.out.print("생성한 주민등록번호 : ");
		for (int i = 0; i < id.length; i++) {
			if (i == 6) {
				System.out.print(" - ");
			}
			System.out.print(id[i]);
		}
		
	}
}
