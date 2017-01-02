package DSAlgorithem;

public class StackArray<T> {
     int Size;
     Object[] ArrayStack;
     int top;
     
     public StackArray(int Size){
    	 this.Size = Size;
    	 ArrayStack = new Object[this.Size];
    	 top = -1;
     }
     
     public void push(Object newItem){
    	 if(Isfull()) {
    		 System.out.println("stack is full");
        	 return ; //is full
    	 }
    	 top = top + 1;
    	 ArrayStack[top] = newItem;
    	
     }
     
     public T pop(){
         if (Isempty()) {
        	 System.out.println("stack is empty");
        	 return null; //is empty
         }
        	 
    	 T item = (T) ArrayStack[top];
    	 top = top - 1;
    	 return item;
    	 
     }
     
     public boolean Isfull(){
    	 return (top == Size - 1);
 
     }
     
     public boolean Isempty(){
    	 return (top == - 1);
     }
}
