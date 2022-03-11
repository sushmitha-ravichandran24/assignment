package TreeSet;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("def");
		set.add("fgh");
		System.out.println("Traversing elements in the descending order");
		Iterator i=set.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
