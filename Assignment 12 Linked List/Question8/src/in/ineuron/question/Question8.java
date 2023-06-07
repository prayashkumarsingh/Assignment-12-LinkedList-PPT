package in.ineuron.question;

public class Question8 {
	static class Node {
		int data;
		Node next;
	}

	static boolean isCircular(Node head) {
		if (head == null)
			return true;
		Node node = head.next;
		while (node != null && node != head)
			node = node.next;

		return (node == head);
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	public static void main(String args[]) {
		Node head = newNode(10);
		head.next = newNode(12);
		head.next.next = newNode(19);
		head.next.next.next = newNode(16);

		head.next.next.next.next = head;

		System.out.print(isCircular(head) ? "Yes\n" : "No\n");
	}

}
