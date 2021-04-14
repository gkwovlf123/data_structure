package dataStructure;

import java.util.NoSuchElementException;

public class ArrayQueue <E> {
	private E[] q;
	private int front, rear, size;
	public ArrayQueue() {
		q = (E[]) new Object[2]; //초기에 생성자가 2인 배열생성 
		front = rear = size = 0;
	}
	public int size() {return size;} //큐에 있는 항목들을 리턴 
	public boolean isEmpty() {return (size == 0);}
	public void add(E newItem) {
		if((rear+1)%q.length == front)
			resize(2*q.length);
			rear = (rear+1)%q.length;
			q[rear] = newItem;
			size++;
	}
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		front = (front+1) % q.length;
		E item = q[front];
		q[front] = null;
		size--;
		if(size>0 && size == q.length/4)
			resize(q.length/2);
			return item;	
	}
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i=1, j=front+1; i<size+1; i++,j++) {
			t[i] = q[j%q.length];
		}
		front = 0;
		rear = size;
		q = (E[]) t;
	}
	public void print() {
		if(isEmpty())
			System.out.print("큐가 비어있음.");
		else {
			for(int i=0; i<q.length; i++) System.out.print(q[i]+"\t ");
			System.out.println();
		}
	}
}