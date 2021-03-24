package dataStructure;

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last;
	private int size;
	public CList() {
		last = null;
		size = 0;
	}
	public void insert(E newItem) {
		Node newNode = new Node(newItem, null);
		if(last == null) {
			newNode.setNext(newNode);
			last = newNode;
		}
		else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	public Node delete() {
		if(isEmpty()) throw new NoSuchElementException();
		Node x = last.getNext();
		if(x==last) last = null;
		else {
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}
	public void print() {
		if(size > 0) {
			int i = 0;
			for(Node p = last.getNext(); i<size;p=p.getNext(),i++)
				System.out.print(p.getItem()+"\t");
		}
		else
			System.out.println("리스트 비어있음.");
	}
}
