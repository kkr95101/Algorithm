package LinkedList.CirculLInkedList;


import LinkedList.SingleLinkedList.Node;



public class CList<E> {
	
	private Node<E> last; //리스트의 마지막노드(항목)을 가르킨다.
	private int size;     //리스트의 항목(노드)수
	public CList() {      //리스트 생성자
		last = null;
		size = 0;
	}
	//삽입, 삭제 연산을 위한 메소드 선언
	
	public void insert(E newItem) { //last가 가르키는 노드의 다음에 새노드 삽입
		Node newNode = new Node<E>(newItem, null); //새노드 생성
		if(last ==null) {						   //리스트가 empty일떄
			newNode.setNext(newNode);
			last = newNode;
		}else {
			newNode.setNext(last.getNext()); //newNode의 다음 노드가 last가 가르키는 노드의 다음노드가 되도록 
			last.setNext(newNode);			 //last가 가르키는 노드의 다음 노드가 newNode가 되도록
		}										
		size++; 
	}
	
	public Node delete() { //last가 가르키는 노드의 다음 노드를 제거
			
		Node x= last.getNext();//리스트에 1개의 노드만 있는 경우
		if(x == last) {
			last =null;
		}else {
			last.setNext(x.getNext()); //last가 가르키는 노드의 다음 노드가 x의 다음 노드가 되도록
			x.setNext(null); //x가 가르키는 노드를 null로 설정
		}
		size--;
		return x;
	}
}
