package algorithm.Stack;

public class main {

	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<String>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop(); 
		System.out.println("pear pop 이후 peek: "+stack.peek());
		stack.push("grape");
		stack.print();
		
	}

}
