import java.util.Iterator;

public class Customlistimplementation {

	public static void main(String args[])
	{
		CustomArrayList<String> list2 = new CustomArrayList<String>();
		System.out.println("Adding elements to the list\n");
		list2.add("epam");
		list2.add("java");
		list2.add("Eclipse");
		list2.add("custom");
		list2.add("list");
		System.out.println("Elements in the list are:\n");
		list2.display();
		System.out.println("\nElement fetching at index 1 is: "+list2.get(1));
		System.out.println("\nElement removed at index 2 is: "+list2.remove(2));
		
		System.out.println("\nRemaining elements in list are:");
		Iterator<String> iterator = list2.iterator();
        System.out.println("\nNow List elements are: "); 
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
	}
}