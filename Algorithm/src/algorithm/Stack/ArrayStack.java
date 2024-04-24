package algorithm.Stack;

import java.util.EmptyStackException;

public class ArrayStack<E> {
	private E[] s; // 스택을 위한 배열
	private int top; // 스택의 top 항목의 배열 원소 인덱스

	public ArrayStack() { // 스택 생성자
		s = (E[]) new Object[1]; // 초기에 크기가 1인 배열 생성
		top = -1; // 1개가 들어오면 +1을 함으로써 0이 됨
	}

	public int size() {
		return top + 1;
	} // 사이즈가 top이 -1이니까 +1되서 0으로 초기화됨

	public boolean isEmpty() {
		return (top == -1);
	}
	// top이 -1이면 true를 return

	public E peek() { // 스택 top 항목의 내용만을 리턴
		if (isEmpty())
			throw new EmptyStackException(); // underflow시 프로그램 정지
		return s[top];
	}

	public void push(E newItem) { // push 연산
		if (size() == s.length) {
			resize(2 * s.length);
		} // 스택을 2배의 크기로 확장
		s[++top] = newItem; // 새 항목을 push

	}

	public E pop() { // pop연산
		if (isEmpty())
			throw new EmptyStackException(); // underflow에서 프로그램 정지
		E item = s[top];
		s[top--] = null; // null 초기화
		if (size() > 0 && size() == s.length / 4)
			resize(s.length / 2); // 스택을 1/2 크기로 축소
		return item;
	}

	private void resize(int newSize) {

		Object[] t = new Object[newSize];
		for (int i = 0; i < size(); i++) {
			t[i] = s[i];
		}
		s = (E[]) t;
	}
	
	public void print() {
		if(isEmpty()) System.err.println("스택이 비어 있습니다.");
		else for (int i = 0; i < size(); i++) System.out.print(s[i]+"\t");
		System.out.println();
	}
}
