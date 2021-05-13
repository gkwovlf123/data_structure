package dataStructure;

public class HuffmanMain {

	public static void main(String[] args) {
		HuffmanEntry[] a;
		a = new HuffmanEntry[7];
		
		a[1] = new HuffmanEntry(60, "a", null, null, null);
		a[2] = new HuffmanEntry(20, "b", null, null, null);
		a[3] = new HuffmanEntry(30, "c", null, null, null);
		a[4] = new HuffmanEntry(35, "d", null, null, null);
		a[5] = new HuffmanEntry(40, "e", null, null, null);
		a[6] = new HuffmanEntry(90, "a", null, null, null);
		
		Huffman h = new Huffman(a, 6);
		System.out.print("최소 힙 만들기 전: ");
		h.print();
		
		h.createHeap();
		System.out.println("최소 힙: ");
		h.print();
		
		System.out.println("히프만 코드");
		HuffmanEntry root = h.createTree();
		h.preorder(root);
		System.out.println();
	}
}