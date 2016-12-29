package DSAlgorithem;

public class LinkeListDimo {

	public static void main(String [] args){
		LinkedList ls = new LinkedList(new Node<Integer>(12,null));
		ls.add(new Node<Integer>(11, null));
		ls.add(new Node<Integer>(25, null));
		ls.add(new Node<Integer>(47, null));
		ls.Display();
		System.out.println("after delete");
		ls.Delete();
		ls.Display();
	}

}