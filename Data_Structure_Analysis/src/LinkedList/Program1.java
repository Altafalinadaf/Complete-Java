package LinkedList;

public class Program1 {
	class Node{
		String data;
		Node next;
		
		public Node(String data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	private Node headNode;
	
	
	public void addFirst(String data) {
		Node node=new Node(data);
		if(headNode==null) {
			headNode=node;
			return;
		}
		node.next=headNode;
		headNode=node;
	}
	
	public void lastFirst(String data) {
		Node node =new Node(data);
		if(headNode==null) {
			headNode=node;
			return;
		}
		
		Node currentNode=headNode;
		while(currentNode.next!=null) {

			currentNode=currentNode.next;
		}
		currentNode.next=node;
		
		
	}
	
	public void printLinkedList() {	
		
		while(headNode!=null) {
			System.out.print(headNode.data+" - > ");
			headNode=headNode.next;
		}
		
		System.out.print("null");
	}
	
	public static void main(String args[]) {
		Program1 LL=new Program1();
		LL.addFirst("a");
		LL.addFirst("is");
		LL.lastFirst("apple");
		LL.printLinkedList();
	}

}
