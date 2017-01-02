package DSAlgorithem;

public class StackArrayDimo {
	public static void main(String[] args){
		System.out.println("normel stack");
		StackArray<Integer> stack = new StackArray<Integer>(5);
		stack.push(11);
		stack.push(12);
		stack.push(41);
		stack.push(18);
		
		System.out.println("Top :" + stack.top);
		System.out.println(stack.pop());
		System.out.println("Top :" + stack.top);
		
		System.out.println("dynamic stack");
		// dynamic stack
		StackArrayDynamic<Integer> stackDynamic = new StackArrayDynamic<Integer>(3);
		stackDynamic.push(11);
		stackDynamic.push(12);
		stackDynamic.push(41);
		
		
		System.out.println("Top :" + stackDynamic.top);
		System.out.println("Size :" + stackDynamic.ArrayStack.length);
		
		stackDynamic.push(18);
		System.out.println("Size :" + stackDynamic.ArrayStack.length);
		
		System.out.println(stackDynamic.pop());
		System.out.println("Top :" + stackDynamic.top);
	
		// stack linkedlist
		
		System.out.println("linkedlist stack");
		StackArray<Integer> stackl = new StackArray<Integer>(5);
		stackl.push(11);
		stackl.push(12);
		stackl.push(41);
		stackl.push(18);
		
		System.out.println("Top :" + stackl.top);
		System.out.println(stackl.pop());
		System.out.println("Top :" + stackl.top);
		
	}
}
