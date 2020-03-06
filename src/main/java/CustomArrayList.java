import java.util.AbstractList;
import java.util.Arrays;
public class CustomArrayList<E> extends AbstractList<E>{
	public static final int initial_capacity=10;
	public int size=0;
	Object[] array= {};
	CustomArrayList()
	{
		array = new Object[initial_capacity];
	}
	@Override
	public boolean add(E e)
	{
		if(size==array.length)
		{
			increaseCapacity();
		}
		
		array[size++]=e;
		return true;
	}
	private void increaseCapacity() {
		int newIncreasedCapacity = array.length * 2;
        array = Arrays.copyOf(array, newIncreasedCapacity);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if(index<0 ||index >=size)
		{
			throw new IndexOutOfBoundsException();
		}
		return (E) array[index];
	}
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		E elementRemoved=(E) array[index];
		for(int i=index;i<size-1;i++)
			array[i]=array[i+1];
		size--;
		return elementRemoved;
	}
	
	public void display() {
        System.out.print("Displaying list : \n");
        for (int i = 0; i < size; i++) {
               System.out.print(array[i] + " ");
        }
        System.out.print("\n ");
 }
	@Override
	public int size() {		
		return size;
	}

}