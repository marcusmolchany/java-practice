import java.util.Hashtable;

public class P2_2_KToLast {

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
		b.prev = a; b.next = c;
		c.prev = b; c.next = d;
		d.prev = c; d.next = e;
		e.prev = d; e.next = f;
		f.prev = e; f.next = g;
		g.prev = f; g.next = h;
		h.prev = g; h.next = i;
		i.prev = h; i.next = j;
		j.prev = i; j.next = k;
		k.prev = j; k.next = l;
		l.prev = k; l.next = m;
		m.prev = k;
		
		System.out.print("First list: ");
		printList(a);
		System.out.println();
		System.out.println(kthToLastRecursive(a, 4, false));
	}
	
	public static Node kthToLastRecursive(Node n, int k, boolean end) {
		System.out.println("Node: " + n + " k: " + k + " end: " + end);
		if (n.next == null) {
			//System.out.println("in 1");
			end = true;
		}
		//System.out.println("here1");
		if (k == 0) {
			//System.out.println("in 2");
			return n;
		}
		//System.out.println("here2");
		if (end) {
			//System.out.println("in 3");
			k--;
			return kthToLastRecursive(n.prev, k, end);
		}
		//System.out.println("here3");
		return kthToLastRecursive(n.next, k, end);
	}
	public static Node kthToLast(Node n, int k) {
		Node pointer = n;
		int count = 0;
		
		while (pointer != null) {
			pointer = pointer.next;
			count++;
		}
		
		int kToLast = count - k;
		pointer = n;
		
		for (int i = 0; i < kToLast; i++) {
			pointer = pointer.next;
		}
		
		return pointer;
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
		Node prev = null;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		public String toString() {
			return "" + this.data;
		}
	}
}
