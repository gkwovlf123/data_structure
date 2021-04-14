package dataStructure;

public class Queue_test {

	public static void main(String[] args) {
		int QueueSize=3;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(QueueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
	}

}