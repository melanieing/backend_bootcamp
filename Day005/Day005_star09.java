package for_star;
//*****
//****
//***
//**
//*
public class Day005_star09 {
	public static void main(String[] args) {
		
		// 증가하는 i와 감소하는 j의 결합
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 5; j > i; j--) { // 5 ~ 1/2/3/4/5 : 5열
				System.out.print("*"); // 1행 : i=0,j=54321 -> 5개
			}						   // 2행 : i=1,j=5432 -> 4개
			System.out.println();	   // 5행 : i=4,j=5 -> 1개
		}
		
		// 증가하는 i와 증가하는(사실상 감소하는) j의 결합
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 0; j < 5 - i; j++) { // 0 ~ 4/3/2/1/0 : 5열
				System.out.print("*"); // 1행 : i=0,j=01234 -> 5개
			}						   // 2행 : i=1,j=0123 -> 4개
			System.out.println();	   // 5행 : i=4,j=0 -> 1개
		}
		
		// 감소하는 i와 증가하는 j의 결합
		for (int i = 5; i > 0; i--) { // 5 ~ 1 : 5행
			for (int j = 1; j <= i; j++) { // 1 ~ 5/4/3/2/1 : 5열
				System.out.print("*"); // 1행 : i=5,j=12345 -> 5개
			}						   // 2행 : i=4,j=1234 -> 4개
			System.out.println();	   // 5행 : i=1,j=1 -> 1개
		}
	}
}
