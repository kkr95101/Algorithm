package LinkedList.SingleLinkedList;

public class Main {
	public static void main(String[] args) {
		
		SList<String> s = new SList<String>();
		s.insertFront("aaa");
		s.insertFront("bbb");
		s.insertAfter("ccc", s.head.getNext());
		s.insertFront("ddd");
		
		s.deleteFront();
		
		System.out.println(s.search("ddd"));
		System.out.println(s.search("bbb"));
		System.out.println(s.search("aaa"));
		System.out.println(s.search("ccc"));
		
		
		
	}
}
