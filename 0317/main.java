package dataStructure;

public class main {

	public static void main(String[] args) {
		Slist<String> s = new Slist<String>();
		s.IsertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry",s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s의 길이 = " + s.size()+"\n");
		System.out.println("체리가 \t" + s.search("cherry")+"번째에 있다.");	
		System.out.println("키위가  \t" + s.search("kiwi")+"번째에 있다. \n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이 = "+s.size()); System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이= "+s.size()); System.out.println();
		
		Slist(Integer) t = new Slist<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300,t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = "+t.size());
	}

}
