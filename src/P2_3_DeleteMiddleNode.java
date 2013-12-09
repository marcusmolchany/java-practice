public class P2_3_DeleteMiddleNode {

	public static void main (String [] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		System.out.print("First list: ");
		printList(a);
		System.out.println();
		deleteMiddleNode(c);
		System.out.print("Modified list: ");
		printList(a);
	}
	
	public static void deleteMiddleNode(Node n) {
		if (n == null || n.next == null) {
			return;
		}
		Node next = n.next;
		n.next = next.next;
		n.data = next.data;
	}
	
	public static void printList(Node start) {
		Node currentNode = start;
		while (currentNode != null) {
			System.out.print(currentNode + " ");
			currentNode = currentNode.next;
		}
	}
	
	static class Node {
		Node next = null;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		public String toString() {
			return "" + this.data;
		}
	}
}
