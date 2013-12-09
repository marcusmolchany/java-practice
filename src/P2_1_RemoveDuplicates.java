import java.util.Hashtable;


public class P2_1_RemoveDuplicates {

	public static void main (String [] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(1);
		Node g = new Node(2);
		Node h = new Node(3);
		Node i = new Node(3);
		Node j = new Node(1);
		Node k = new Node(5);
		Node l = new Node(4);
		Node m = new Node(4);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = i;
		i.next = j;
		j.next = k;
		k.next = l;
		l.next = m;
		
		System.out.print("First list: ");
		printList(a);
		System.out.println();
		removeDuplicates(a);
		System.out.print("Modified list: ");
		printList(a);
	}
	
	public static void removeDuplicates(Node n) {
		Hashtable table = new Hashtable();
		Node previous = null;
		
		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
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
