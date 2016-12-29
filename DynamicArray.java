package DSAlgorithem;

import java.util.Arrays;

public class DynamicArray<T> {
    Object[] data;
    int size;
    
	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	
	public int getSize(){
		return data.length;
	}
	
	public T get(int index){
		return (T) data[index];
	}
	
	public void put(int element){
		ensureCapcity(size + 1);
		data[size++] = element;
	}
	
	public void ensureCapcity(int minCapacity){
		int oldCapacity = data.length;
		if(minCapacity > oldCapacity){
			int newCapacity = oldCapacity*2;
			if(newCapacity < minCapacity)
				newCapacity = minCapacity;
			
			data = Arrays.copyOf(data, newCapacity);
		}
	}

}