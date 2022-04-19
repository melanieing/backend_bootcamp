package myArrayList;

public class MyArayListTest {
	public static void main(String[] args) {
		
		// make an array with size 5
		MyArrayList mal = new MyArrayList();
		
		// insert various types of values
		mal.add(1);
		mal.add(2.0);
		mal.add(3);
		mal.add("four");
		mal.add(5);
		mal.add('6'); // oversize -> extension
		
		// show all values
		System.out.println(mal.toString());
		// show the third index's value
		System.out.println(mal.hashCode() + " array[3] = " + mal.getValue(3)); 
		// insert String into the third index
		mal.add(3, "third");
		System.out.println(mal);

	}
}
