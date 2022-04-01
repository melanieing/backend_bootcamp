package for_star;
//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Day005_star12 {
	public static void main(String[] args) {
		
		// 1 ~ 5행
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 0; j < i+1; j++) { // 0 ~ 0/1/2/3/4 : 5열
				System.out.print("*"); 		// 별 : 1/2/3/4/5개
			}
			System.out.println();
		}
		
		// 6 ~ 9행
		for (int i = 0; i < 4; i++) { // 0 ~ 3 : 4행
			for (int j = 0; j < 4-i; j++) { // 0 ~ 3/2/1/0 : 4열 
				System.out.print("*"); // 별 : 4/3/2/1개
			}
			System.out.println();
		}

	}
}
