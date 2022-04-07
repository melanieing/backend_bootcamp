package array;

import java.util.Scanner;

//달팽이 배열 만들기
// 정사각형 행과 열의 칸 수를 입력받아 달팽이 모양 배열을 완성시키는 코드 
// 방향이 달라질 때마다 flag로 표시하는 방법

public class Day009_arraySnailFlag {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정사각형 행렬 칸 수
		int row = 0, col = 0;
		int flag = 0; // 방향 전환 표시 : 오른쪽, 아래, 왼쪽, 위
		int count = 1; // 입력할 숫자 

		int[][] snail = new int[n][n];

		for (int i = 0; i < n * n; i++) { // 총 입력할 숫자 개수만큼 반복
			snail[row][col] = count++;
			if (flag == 0) { // 오른쪽으로 진행하는 방향
				if (col < n - 1 && snail[row][col + 1] == 0) {
					col++; // 한 열 오른쪽으로 증가
				} else {
					flag++; // 진행방향을 아래로 바꿈
					row++; // 한 행 아래로 내려감
				}
			} else if (flag == 1) { // 아래쪽으로 진행하는 방향
				if (row < n - 1 && snail[row + 1][col] == 0) {
					row++; // 한 행 아래로 증가
				} else {
					flag++; // 진행방향을 왼쪽으로 바꿈
					col--; // 한 열 왼쪽으로 줄어듦
				}
			} else if (flag == 2) { // 왼쪽으로 진행하는 방향
				if (col > 0 && snail[row][col - 1] == 0) {
					col--; // 한 열 왼쪽으로 감소
				} else {
					flag++; // 진행방향을 위로 바꿈
					row--; // 한 행 위로 줄어듦
				}
			} else { // 위쪽으로 진행하는 방향
				if (row > 0 && snail[row - 1][col] == 0) {
					row--; // 한 행 위로 감소
				} else {
					flag = 0; // 진행방향을 오른쪽으로 바꿈
					col++; // 한 열 오른쪽으로 옮김
				}
			}
		}
		
		sc.close();
		
		// 달팽이배열 출력하기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d\t", snail[i][j]);
			}
			System.out.println();
		}
		
	}
}
