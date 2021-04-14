package dataStructure;


interface Queue{
	boolean isEmpty();
	void enQueue(char item);
	char dQueue();
	void delete();
	char peek();
}

class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Inserting fail Array Queue is Full!");
		}else {
			itemArray[++rear] = item;
			System.out.println("Inserted Item:" + item);
		}
	}
	public char deQueue() {
		if(isEmpty()) {	
			System.out.println("Deleting fail Array Queue is empty");
			return 0;
		}
		else {
			return itemArray[++front];
		}
	}
	public void delete() {
		if(isEmpty()) {	
			System.out.println("Deleting fail Array Queue is empty");
		}else {
			++front;
		}
	}
	public void printQueue() {
		if(isEmpty())
			System.out.printf("Array Queue is empty!! %n %n");
		else {
			System.out.printf("Array Queue>> ");
			for(int i=front+1; i<=rear; i++)
				System.out.printf("%c ",itemArray[i]);
			System.out.println();
			System.out.println();
		}
	}

	@Override
	public char dQueue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}
}