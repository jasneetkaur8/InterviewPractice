package sorts;

public class MergeSortForLinkedList {
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val=val;
			next = null;
		}
	}
	Node head = null;

	public void push(int val){
		Node newNode = new Node(val);
		newNode.next=head;
		head = newNode;
		
	}
	public Node findMiddleNode(Node node){
		if(node==null){
			return node;
		}
		Node fast = node.next;
		Node slow = node;
		while(fast!=null){
			fast = fast.next;
			if(fast!=null){
				fast = fast.next;
				slow= slow.next;
			}
		}
		return slow;
	}
	
	public Node merge(Node left, Node right){
		if(left==null){
			return right;
		}
		if(right==null){
			return left;
		}
		Node result = null;
			if(left.val<=right.val){
				result = left;
				result.next = merge(left.next, right);
			} else{
				result = right;
				result.next = merge(left, right.next);
			}
			return result;
	}
	
	public Node sort(Node node){
		if(node==null || node.next==null){
			return node;
		}
		Node middleNode = findMiddleNode(node);
		Node nextToMiddle = middleNode.next;
		
		middleNode.next=null;
		Node left = sort(node);
		Node right = sort(nextToMiddle);
		Node sortedNode = merge(left,right);
		return sortedNode;
		
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
	 
	public static void main(String[] args) {
		MergeSortForLinkedList ll = new MergeSortForLinkedList();
		 /*
         * Let us create a unsorted linked lists to test the functions Created
         * lists shall be a: 2->3->20->5->10->15
         */
        ll.push(15);
        ll.push(10);
        ll.push(5);
        ll.push(20);
        ll.push(3);
        ll.push(2);
		
        ll.head = ll.sort(ll.head);
        ll.printList(ll.head);

	}

}
