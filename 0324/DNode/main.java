package dataStructure;

public class main {

	public static void main(String[] args) {
		DList<String> s = new DList<>();
		
		s.insertAfter(s.head,"apple");
		s.insertBefore(s.tail, "orange")
		s.insertBefore(s.head, "cherry");
		s.insertAfter(s.head.getNext(),"pear");
		s.print(); System.out.println();
		
		s.delete(s.tail.getPrevious());
		s.print(); System.out.println();
		s.insertBefore(s.tail, "grape");
		s.print(); System.out.println();
		s.delete(s.head.getNext());s.print();
		s.delete(s.head.getNext());s.print();
		s.delete(s.head.getNext());s.print();
		s.delete(s.head.getNext());s.print();
	}

}
