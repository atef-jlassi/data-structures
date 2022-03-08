package c.udemy.section.five.stack;

public class StackUsingArray {

	int[] array;
	int topOfStack;

	public void createStack(int size) {
		array = new int[size];
		topOfStack = -1;
	}

	public void push(int data) {
		if (topOfStack == array.length - 1)
			System.out.println("Stack Overflow Error!");

		topOfStack++;
		array[topOfStack] = data;
		System.out.println("Inserted!");
	}

	public void pop() {
		if (topOfStack == -1)
			System.out.println("Stack underflow Error!");

		System.out.println(array[topOfStack]);
//		return array[topOfStack];
		array[topOfStack] = 0;
		topOfStack--;
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			System.out.println("Stack is empty");
			return true;
		} else {
			System.out.println("Stack is not empty");
			return false;
		}
	}

	public boolean isFull() {
		if (topOfStack == array.length - 1) {
			System.out.println("Stack is Full");
			return true;
		} else {
			System.out.println("Stack is not Full");
			return false;
		}
	}

	public void peek() {
		if (topOfStack == -1)
			System.out.println("Stack is empty");
		else
			System.out.println(array[topOfStack]);
	}
	
	public void deleteStack() {
		array=null;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();

		// create stack size 5
		stack.createStack(5);
		
		// insert 1, 2 to the stack
		stack.push(1);
		stack.push(2);
		
		// pop from the stack
		stack.pop();
		stack.pop();
		
		// check whether stack is empty or not
		System.out.println(stack.isEmpty());
		
		// peek top element from stack
		stack.peek();
		
		// isFull method will check whether stack is full or not
		System.out.println(stack.isFull());
		
		
		
	}

}
