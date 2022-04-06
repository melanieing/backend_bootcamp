package array;

import java.util.Scanner;

// 입력받은 배열의 값을 정렬하여 출력하기

public class Day009_arraySort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 길이를 입력하세요 : ");
		int arrayLength = sc.nextInt();
		
		int[] array = new int[arrayLength];
		System.out.println(arrayLength + "개의 배열이 생성되었습니다.");
		
		System.out.println("값을 입력하세요.");
		for (int i = 0; i <  arrayLength; i++) {
			System.out.print(i+1 + "번째 값 : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("배열에 입력된 값은 : ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + " ");
		}
		
		// 오름차순으로 정렬하기
		for (int i = 0; i < arrayLength - 1; i++) {
			for (int j = i+1; j < arrayLength; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		// 정렬한 값들 출력
		System.out.print("입니다.\n정렬 후 값은 : ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("입니다.");
		
		sc.close();
	}
}
