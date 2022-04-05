package array;

import java.util.Scanner;

// 주민등록번호(13자리) 검증하기
// 주민등록번호 맨 뒷자리를 제외하고 각 자리마다 특정 수를 곱해서 모두 더한 검증값
// 11 - (검증값 % 11)의 결과와 맨 뒷자리를 비교해서 일치하면 검증된 주민등록번호

public class Day008_arrayIdVerifier {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호를 '-' 없이 이어서 입력 : ");
		String id = sc.nextLine();
		sc.close();
		String[] idArray = id.split("");
		
		int[] idVerify = new int[idArray.length];
		int idVerifySum = 0;
		
		for (int i = 0; i < idArray.length-1; i++) {
			if (i >=0 && i <= 7) {
				idVerify[i] = Integer.parseInt(idArray[i]) * (i+2);
			} else {
				idVerify[i] = Integer.parseInt(idArray[i]) * (i-6);
			}
			idVerifySum += idVerify[i];
		}
		
		int verifier = 11 - (idVerifySum % 11);
		if (verifier == Integer.parseInt(idArray[idArray.length-1])) {
			System.out.println("검증 결과, 일치합니다!^_^");
		} else {
			System.out.println("검증 결과, 불일치합니다!ㅠ_ㅠ");
		}

	}
}
