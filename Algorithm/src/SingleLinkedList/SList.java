package SingleLinkedList;

import java.util.NoSuchElementException;

public class SList<E> {
	protected Node head;
	private int size;

	public SList() {
		head = null;
		size = 0;
	}

	public int search(E target) {
		Node p = head;
		for (int i = 0; i < size; i++) {
			if (target == p.getItem()) {
				return i;
			}
			p = p.getNext();
		}
		return -1;
	}
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteAfter(Node p) {
	    if (p == null || p.getNext() == null) {
	        throw new NoSuchElementException("다음 노드가 존재하지 않습니다.");
	    }
	    Node t = p.getNext();
	    p.setNext(t.getNext());
	    t.setNext(null);
	    size--;
	}
	
	
	public void deleteFront() {
	    if (head == null) {
	        throw new NoSuchElementException("리스트가 비어 있습니다.");
	    }
	    Node temp = head;
	    head = head.getNext();
	    temp.setNext(null);
	    size--;
	}

	@Override
	public String toString() {
		return "SList [head=" + head + ", size=" + size + "]";
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
