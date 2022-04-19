package myLinkedList;

public class MyLinkedListTest {
	public static void main(String[] args) {
		
		MyLinkedList mll = new MyLinkedList();
		
		mll.add(1);
		mll.add(2);
		mll.add(3);
		System.out.println(mll.toString());
		
		mll.add(0, 10);
		System.out.println(mll.toString());
		mll.add(2, 20);
		System.out.println(mll.toString());
		mll.add(1, 30);
		System.out.println(mll.toString());
		
		System.out.println(mll.getValue(0));
		System.out.println(mll.getValue(3));
		System.out.println(mll.getValue(10));
		System.out.println(mll.getValue(-1));
		
		System.out.println("size:" + mll.getSize());
		
		mll.add(1.1);
		mll.add(3, 100);
		mll.add(2.2);
		mll.add(3.3);
		System.out.println(mll.toString());
		System.out.println("size:" + mll.getSize());
	}
}
