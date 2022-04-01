package for_star;
//*
//**
//***
//****
//*****
public class Day005_star08 {
	public static void main(String[] args) {
			
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 0; j <= i; j++) { // 0 ~ 01234 : 12345행
				System.out.print("*");	// 별 1/2/3/4/5개
			}
			System.out.println();
		}

	}
}
