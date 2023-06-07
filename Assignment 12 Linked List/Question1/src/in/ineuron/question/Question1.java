package in.ineuron.question;

import java.util.*;

public class Question1 {
	static class Node {
		int data;
		Node next;
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	static int countOfNodes(Node h) {
		int count = 0;
		while (h != null) {
			h = h.next;
			count++;
		}
		return count;
	}

	static Node removeMid(Node head) {
		if (head == null)
			return null;
		if (head.next == null) {
			return null;
		}
		Node copyHead = head;
		int count = countOfNodes(head);
		int mid = count / 2;
		while (mid-- > 1) {
			head = head.next;
		}
		head.next = head.next.next;

		return copyHead;
	}

	static void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		Node h = newNode(1);
		h.next = newNode(2);
		h.next.next = newNode(3);
		h.next.next.next = newNode(4);
		h.next.next.next.next = newNode(5);
		h.next.next.next.next.next = newNode(6);

		System.out.println("Given Linked List");
		printList(h);

		h = removeMid(h);

		System.out.println("Linked List after deletion of middle");
		printList(h);
	}
}
