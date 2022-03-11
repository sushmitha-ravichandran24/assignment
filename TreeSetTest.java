package TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*; 
 

public class TreeSetTest {
	public static void main(String args[]){
		//Create TreeSet object.
		Set treeSet = new TreeSet();
 
		//Add objects to the HashSet.
		treeSet.add("Yashu");
		treeSet.add("Oviya");
		treeSet.add("Medo");
		treeSet.add("Ashwini");
		treeSet.add("Deepa");
 
		//Print the TreeSet object.
		System.out.println("TreeSet elements:");
		System.out.println(treeSet);
 
		//Print the TreeSet elements using iterator.
		Iterator itr=treeSet.iterator();
		System.out.println("TreeSet elements using iterator:");
		while(itr.hasNext()){  
		   System.out.println(itr.next());  
		}  
	}
}