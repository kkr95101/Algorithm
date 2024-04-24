package algorithm.Stack;

public class Node<E> { //generic으로 구현
	private E item;     // item/node
	private Node<E> next; //다음노드를 가르킴

	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	
	public E getItem() {return item;} 
	public Node<E> getNext(){return next;} //next가 가르키고있는 node를 리턴
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node<E> newNext) {next = newNext;} 
	
}
