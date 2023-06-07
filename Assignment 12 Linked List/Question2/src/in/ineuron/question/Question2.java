package in.ineuron.question;


public class Question2 {
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

	public static boolean detectLoop(Node head){
       
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    
    }
	public static void main(String[] args) {
		Node h = newNode(1);
		h.next = newNode(3);
		h.next.next = newNode(4);
		

		System.out.println(detectLoop(h));
	}

}
