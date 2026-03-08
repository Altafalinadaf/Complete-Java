package LinkedList;

public class Program2 {
	
	
	private int size;
	
	Program2(){
		this.size=0;
	}
	
	class Node{
		String dataString;
		Node nextNode;
		
		
		Node(String dataString){
			this.dataString=dataString;
			nextNode=null;
			size++;
		}
		
	}
	
	private Node headNode;
	
	public void addFirst(String dataString) {
		Node node=new Node(dataString);
		if(headNode==null) {
			headNode=node;
			return;
		}
		node.nextNode=headNode;
		headNode=node;
	}
	
	
	
	public void printList() {
		if(headNode==null) {
			System.out.println("List is Empty ");
			return;
		}
		while(headNode!=null) {
			System.out.print(headNode.dataString+" -> ");
			headNode=headNode.nextNode;
		}
		System.out.print("null");
	}
	
	public void lastFirst(String data) {
		Node node=new Node(data);
		if(headNode==null) {
			headNode=node;
			return;
		}
		
		Node currNode=headNode;
		while(currNode.nextNode!=null) {
			currNode=currNode.nextNode;
		}
		currNode.nextNode=node;	
		
	}
	
	
	public void deleteFirst() {
		
		if(headNode==null) {
			System.out.println("List is Empty ");
			return;
		}
		size--;
		headNode=headNode.nextNode;	
	}
	
	
	public void deleteLast() {
		if(headNode==null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		// only in the case if we have only a single node in linked list 
		if(headNode.nextNode==null) {
			headNode=null;
			return;
		}
		Node secondLast=headNode;
		Node lastNode=headNode.nextNode;
		
		while(lastNode.nextNode!=null) {
			lastNode=lastNode.nextNode;
			secondLast=secondLast.nextNode;
		}
		
		secondLast.nextNode=null;
	}
	
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {	
		Program2 program2=new Program2();
		program2.addFirst("hi");
		program2.addFirst("hello");
		program2.addFirst("Good Morning");
		program2.lastFirst("hii");
		program2.deleteFirst();
		program2.deleteLast();
		program2.printList();
		System.out.println();
		System.out.println("Size of the list is "+program2.getSize());	
	}
}
