package array;

import java.util.Scanner;
// 무한배열(정수) 만들기
// 정수를 저장하는 배열을 무한대로 늘어나도록 작성
// 따로 함수 만들어서 구현
public class Day009_arrayInfiniteInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int defaultSize = 3;
		int size = defaultSize;
		
		// 기본 사이즈의 배열 생성
		int[] arr = new int[size];
		
		while(true) {
			System.out.printf("입력(현재길이:%d):", size);
			int n = sc.nextInt();
			if(n == -1) { // -1을 입력하면 종료
				break;
			}
			arr[index++] = n;
			if(size == index) { // 배열이 꽉 차면
				size += defaultSize; // 3칸(기본사이즈) 더 늘려주기
				int[] tmp = arr; // 새로운 배열로 이사가기
				arr = new int[size];
				for(int i = 0; i < tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("증가됨("+arr.length+")");
			}
			printArray(arr, index);
			System.out.println();
		}
		
		sc.close();
	}
	
	// 배열에 담긴 것들을 순서대로 출력해주는 메서드 
	public static void printArray(int[] array, int index) {
		for(int i = 0; i < index; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
