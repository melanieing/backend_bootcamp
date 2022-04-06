package array;
// 알고리즘 문제
// d(n) : 어떤 자연수 n의 각 자릿수 숫자들과 n 자신을 더한 숫자
//  n : d(n)의 제너레이터
// ex) d(91) = 9 + 1 + 91 = 101 -> 91은 101의 제너레이터
// ex) 100도 101의 제너레이터 (d(100) = 1 + 0 + 0 + 100 = 101)
// 셀프 넘버(self-number) : 제너레이터를 가지고 있지 않은 숫자
// ex) 1, 3, 5, 7, 9, 20, 31, ...

public class Day009_selfNumber {
	public static void main(String[] args) {
		
		long selfNumsSum = 0;
		int[] numsList = new int[5000];
		int[] genResultList = new int[5000];
		
		// 1 ~ 5000까지 중 제너레이터가 있는 수들을 genResultList에 담기
		// 1 ~ 5000까지의 자연수를 numsList에 담기
		for (int i = 1; i < 5000; i++) {
			genResultList[i-1] = generator(i);
			numsList[i-1] = i;
		}
		
		// 1 ~ 5000까지의 수들 중 제너레이터가 있는 수들을 제거하기
		for (int i = 0; i < 5000; i++) {
			for (int j = 0; j < 5000; j++) {
				if (genResultList[i] == numsList[j]) {
					numsList[j] = 0;
				}
			}
		}
		// 1 ~ 5000까지의 수들 중 셀프 넘버들만 더한 값 출력
		for (int i = 0; i < 5000; i++) {
			selfNumsSum += numsList[i];
		}
		System.out.println(selfNumsSum);
	}	
	
	// 제너레이터 생성함수
	public static int generator(int n) {
		int digitsSum = 0;
		
		String digit = Integer.toString(n);
		String[] digits = digit.split("");
		for (int i = 0; i < digits.length; i++) {
			digitsSum += Integer.parseInt(digits[i]);
		}
		int gen = digitsSum + n;
		
		return gen;
	}
}
