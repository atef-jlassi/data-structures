package d.udemy.section.six.queue;

public class LinearQueueUsingArray {

	int [] array;
	int rear;
	int front;
	
	public void createQueue(int size) {
		array = new int[size];
		rear = front = -1;
	}
	
	public void enQueue(int value) {
		if(rear==array.length-1) 
			System.out.println("Queue Overflow Error!");
		else if(rear == -1) {
			front = 0;
			rear++;
			array[front]=value;
		} else {
			rear++;
			array[rear]=value;
		}
	}
	
	public void deQueue() {
		if(rear==-1)
			System.out.println("Queue underflow Error!");
		else {
			int temp=array[front];
			System.out.println(temp);
			array[front]=0;
			front++;
			if(front > rear)
				front = rear = -1;
		}
	}
	
	public void peek() {
		if(front != -1) {
			System.out.println(array[front]);
		} else {
			System.out.println("Queue is Empty");
		}
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return rear == array.length-1;
	}
	
	
	public void deleteQueue() {
		array = null;
	}

	public void printQueue() {
		if(isEmpty())
			System.out.println("Queue is Empty");
		else {
			for(int i=front; i<=rear; i++)
				System.out.println(array[i]);
		}
			
	}
	
	public static void main(String[] args) {
	
		LinearQueueUsingArray queue=new LinearQueueUsingArray();
		
		queue.createQueue(5);
			
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		queue.printQueue();
		
		queue.peek();

		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		queue.deQueue();
		System.out.println("---");
		queue.printQueue();

	}

}
