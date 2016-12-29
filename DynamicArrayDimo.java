package DSAlgorithem;

public class DynamicArrayDimo {

	public static void main(String [] args){
		DynamicArray <Integer>darray = new DynamicArray<Integer>();
		darray.put(4);
		System.out.println("size:"+darray.getSize());
		
		darray.put(14);
		darray.put(41);
		System.out.println("size:"+darray.getSize());
 
	}
}