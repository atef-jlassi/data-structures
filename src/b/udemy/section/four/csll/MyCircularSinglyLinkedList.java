package b.udemy.section.four.csll;

public class MyCircularSinglyLinkedList {

	
	Node head = null;
	Node tail = null;
	int size = 0;
	
	// addNode() will add add node at the tail
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
		size++;
	}
	
	// print() will print all the nodes present in the list
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;			
		}
		// print the data of head node
		System.out.println(head.data);
		// initially current point will point to the first node
		Node current = head.next;
		while(current != head) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// search() method will return the index of a given node
	public int search(int val) {
		if(head==null)
			return -1;
		if(head.data==val)
			return 0;
		int index = 1;
		Node current = head.next;
		while(current != head) {
			if(current.data==val)
				return index;
			else {				
				current=current.next;
				index++;
			}
		}
		return -1;
	}
	
	// addAtHead() 
	public void addAtHead(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = tail = newNode;
		else {
			newNode.next = head;
			tail.next = newNode;
			head=newNode;
		}
	}
	
	// addAtTail()
	public void addAtTail(int data) {
		Node newNode = new Node(data);
		if (head == null) 
			head = tail = newNode;
		else {
			newNode.next = head;
			tail.next = newNode;
			tail=newNode;
		}
		size++;
	}
	
	public Node getNode(int index) {
		Node current = head;
		
		for(int i=0; i<index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public void addAtIndex(int index, int val) {
		if(index < 0 || index > size)
			return;
		if(index == 0) {			
			addAtHead(val);
		} else if(index == size) {
			addAtTail(val);
		} else {
			Node newNode = new Node(val);
			Node prevNode=getNode(index-1);
			newNode.next=prevNode.next;
			prevNode.next=newNode;
		}
		size++;
	}
	
	public static void main(String [] args) {
		MyCircularSinglyLinkedList linkedList = new MyCircularSinglyLinkedList();

		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		
		linkedList.print();
		linkedList.addAtHead(0);
		linkedList.addAtTail(5);
		System.out.println("----");
		linkedList.print();
		linkedList.addAtIndex(7, 6);
		linkedList.print();
		System.out.println("--------------");
		System.out.println(linkedList.search(3));
		System.out.println("--------------");
		linkedList.print();
	}
}
