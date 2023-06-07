package in.ineuron.question;

import java.util.*;

public class Question3 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printNthFromLast(int N) {
		int len = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		if (len < N)
			return;

		temp = head;
		for (int i = 1; i < len - N + 1; i++)
			temp = temp.next;

		System.out.println(temp.data);
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(20);
		ll.push(4);
		ll.push(15);
		ll.push(35);
		ll.printNthFromLast(4);
	}

}
