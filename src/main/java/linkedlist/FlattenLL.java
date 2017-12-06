package linkedlist;
/*Flatten following linked list into 5->7->8->10->19->20->22->28->30->35->40->45->50.
/* Let us create the following linked list
5 -> 10 -> 19 -> 28
|    |     |     |
V    V     V     V
7    20    22    35
|          |     |
V          V     V
8          50    40
|                |
V                V
30               45
*/


public class FlattenLL {
	static class Node{
		int val;
		Node down, right;
		public Node(int val){
			this.val = val;
			down = right=null;
		}
	}
	Node head;

	public Node merge(Node left, Node right){
		if(left==null){
			return right;
		}
		if(right==null){
			return left;
		}
		Node result;
		if(left.val<=right.val){
			result = left;
			result.down = merge(left.down, right);
		} else{
			result = right;
			result.down = merge(left, right.down);
		}
		return result;
	}
	public Node flatten(Node root){
		if(root==null || root.right==null){
			return root;
		}
		Node right = flatten(root.right);
		root = merge(root, right);
		return root;
	}
	public Node push(Node head, int val){
		Node node = new Node(val);
		node.down=head;
		head = node;
		return head;
	}
	public void printList(Node head){
		Node ref = head;
		while(ref!=null){
			System.out.println(ref.val);
			ref = ref.down;
		}
	}
	public static void main(String[] args) {
		// creating the list of linked list
		/* Let us create the following linked list
		5 -> 10 -> 19 -> 28
		|    |     |     |
		V    V     V     V
		7    20    22    35
		|          |     |
		V          V     V
		8          50    40
		|                |
		V                V
		30               45
		*/
		FlattenLL ll = new FlattenLL();
		ll.head = ll.push(ll.head, 30);
		ll.head = ll.push(ll.head, 8);
		ll.head = ll.push(ll.head, 7);
		ll.head = ll.push(ll.head, 5);
		ll.head.right = ll.push(ll.head.right, 20);
		ll.head.right = ll.push(ll.head.right, 10);
		ll.head.right.right = ll.push(ll.head.right.right, 50);
		ll.head.right.right = ll.push(ll.head.right.right, 22);
		ll.head.right.right = ll.push(ll.head.right.right, 19);
		ll.head.right.right.right = ll.push(ll.head.right.right.right, 45);
		ll.head.right.right.right = ll.push(ll.head.right.right.right, 40);
		ll.head.right.right.right = ll.push(ll.head.right.right.right, 35);
		ll.head.right.right.right = ll.push(ll.head.right.right.right, 28);
		ll.head=ll.flatten(ll.head);
		ll.printList(ll.head);

	}

}
