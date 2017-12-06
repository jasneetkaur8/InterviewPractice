package tree;

public class BreadthFirstSearch {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		levelOrder(node);

	}
	static void levelOrder(Node node) 
    {
        if(node==null){
            return;
        }
        int height = height(node);
        for(int i=1;i<=height;i++){
            printLevel(node,i);
            System.out.print("$ ");
        }
    }
    
    static int height(Node node){
        if(node==null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
    static void printLevel(Node node, int level){
        if(node==null){
            return;
        }
        if(level==1){
            System.out.print(node.data+" ");
            
        }
        if(level>1){
            printLevel(node.left,level-1);
            printLevel(node.right, level-1);
           
        }
        
    }

}
