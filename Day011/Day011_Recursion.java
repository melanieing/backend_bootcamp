package recursion;

public class Day011_Recursion {

	public static void recursionMethod(int n) {
		System.out.println("RecursionMethod Call!! n : " + n);
		if (n == 0) {
			return;
		}
		recursionMethod(n-1);
		System.out.println("RecursionMethod returned. n : " + n);
	}
	
	public static void main(String[] args) {
		
		recursionMethod(4);
	
	}

}
