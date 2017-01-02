package DSAlgorithem;

public class StackLinkedList {

Node head;
    
	public StackLinkedList(Node head) {
		this.head = head;
		
	}
	
	public void push(Node newNode){
		newNode.next = head;
		head = newNode;
	}
	
	public void pop(){
		head = head.next;
	}
    
	public void Display(){
		Node n = head;
		while(n != null){
			System.out.println(n.value);
			n = n.next;
		}
	}
}
