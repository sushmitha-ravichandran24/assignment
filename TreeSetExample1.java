package TreeSet;
import java.util.*;
public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set= new TreeSet<Integer>();
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println("lowest value:"+set.pollFirst());
		System.out.println("Highest value:"+set.pollLast());
		

	}

}
