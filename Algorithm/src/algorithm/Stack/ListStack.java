package algorithm.Stack;

import java.util.EmptyStackException;

public class ListStack<E> {
	private Node<E> top; //스택 top항목을 가진 Node를 가르키기 위해
	private int size; 	//스택 항목수
	public ListStack() { //스택 생성자
		top = null;
		size = 0;
	}
	public int size() {return size;} //스택의 항목의 수를 리턴
	public boolean isEmpty() {return size ==0;} //스택 empty이면 ture리턴
	
	public E peak() {
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	
	public void push(E newItem) {
		Node<E> newNode = new Node<E>(newItem, top); //리스트의 앞부분에 삽입
		top = newNode;	//top이 새노드 가리킴
		size++; // 스택 항목 수 1 증가
	}
	
	public E pop() { //스택 pop연산
		if(isEmpty()) throw new EmptyStackException(); //underflow 시 프로그램 정지
		E topItem = top.getItem(); //스택 top항목을 topItem에 저장
		top = top.getNext(); //top이 top 바로 아래 항목을 가리킴
		size --; //스택 항목 수를 1감소
		return topItem;
	}
	public void print() {
		if(isEmpty()) System.out.println("스택이 비어있음.");
		else {
			for (Node p = top; p!= null; p = p.getNext()) {
				System.out.print(p.getItem()+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peak());

		stack.push("pear");
		stack.print();
		
		stack.pop();
		System.out.println(stack.peak());
		
		stack.push("grape");
		stack.print();
	}
}
