package linkedlist;
class QNode{
	int data;
	QNode next;
	QNode(int data){
		this.data = data;
	}
}
class Queue{
	QNode front, rear;
	
	Queue(){
		front = rear=null;
	}
	
	public void enQueue(int key){
		QNode node = new QNode(key);
		if(rear==null){
			front = rear=node;
			return;
		}
		rear.next = node;
		rear = node;
	}
	public QNode deQueue(){
		if(front==null){
			return null;
		}
		
		QNode node = front;
		front = front.next;
		if(front==null){
			rear=null;
		}
		return node;
	}
}
public class LinkedListQueue {

	public static void main(String[] args) {
		Queue queue  = new Queue();
		queue.enQueue(10);
	    queue.enQueue(20);
	    System.out.println(queue.deQueue().data);
	    System.out.println(queue.deQueue().data);
	    queue.enQueue(30);
	    queue.enQueue(40);
	    queue.enQueue(50);
	    System.out.println("Dequeued item is "+ queue.deQueue().data);

	}
	

}
