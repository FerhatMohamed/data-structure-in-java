package DSAlgorithem;

import java.util.Arrays;

public class StackArrayDynamic<T> {
	int Size;
    Object[] ArrayStack;
    int top;
    
    public StackArrayDynamic(int Size){
   	 this.Size = Size;
   	 ArrayStack = new Object[this.Size];
   	 top = -1;
    }
    
    public void push(Object newItem){
    	ensureCapcity(top + 2);
    	/*if(Isfull()) {
   		 System.out.println("stack is full");
       	 return ; //is full
   	    }*/
   	    top = top + 1;
   	    ArrayStack[top] = newItem;
   	
    }
    
    public void ensureCapcity(int minCapacity){
		int oldCapacity = ArrayStack.length;
		if(minCapacity > oldCapacity){
			int newCapacity = oldCapacity*2;
			if(newCapacity < minCapacity)
				newCapacity = minCapacity;
			
			ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
		}
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
