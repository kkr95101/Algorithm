package LinkedList.DoubleLinkedList;

import java.util.NoSuchElementException;

public class DList<E> {
	protected DNode head, tail;
	private int size;

	public DList() {
		head = new DNode(null, null, null); 
		tail = new DNode(null, head, null); //tail의 이전노드를 head로 만들겠다
		head.setNext(tail); //head의 다음노드를 tail로 만든다
		size = 0;
	}


	public void insertAfter(DNode p, E newItem) { //p가 가르키는 노드 뒤에 삽입
		DNode t = p.getNext();
		DNode newNode = new DNode<E>(newItem, p, t);
		
		t.setPrevious(p);
		p.setNext(newNode);
		size++;
	}
	public void delete(DNode x) {
		if(x==null) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	
	@Override
	public String toString() {
		return "SList [head=" + head + ", size=" + size + "]";
	}

	public DNode getHead() {
		return head;
	}

	public void setHead(DNode head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DNode getTail() {
		return tail;
	}

	public void setTail(DNode tail) {
		this.tail = tail;
	}
	
	
}
