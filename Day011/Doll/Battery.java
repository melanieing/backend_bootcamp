package doll;

public class Battery {
	// 필드
	String type; // AA, AAA, ...
	int capacity;
	
	// 기능
	int electricity(int use) {
		if (capacity - use <= 0) {
			return 0;
		} else {
			capacity -= use;
			return use;
		}
	}

}
