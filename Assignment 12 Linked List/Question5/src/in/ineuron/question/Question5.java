package in.ineuron.question;
import java.util.*;

public class Question5 {
	static Node head; 
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    static boolean removeLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (h != null) {
 
            if (s.contains(h)) {
                prev.next = null;
                return true;
            }
            else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }
 
        return false;
    }
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
 
        llist.head.next.next.next.next = llist.head;
 
        if (removeLoop(head)) {
            System.out.println("Linked List after removing loop");
            llist.printList(head);
        }
        else
            System.out.println("No Loop found");
    }

}
