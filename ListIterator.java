package TreeSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 

		
		        // TODO Auto-generated method stub
		        LinkedList l = new LinkedList();
		        l.add("A");
		        l.add("B");
		        l.add("C");
		        l.add("java");
		        System.out.println(l);
		        ListIterator listIterator = l.listIterator();
		        listIterator.add("PROG"); // ---> added first
		        while (listIterator.hasNext()) {
		            //    listIterator.add("55");

		 

		            if (listIterator.next().equals("C")) {
		                listIterator.set(100); // replaced
		            }
		            System.out.println(listIterator.next());
		        }
		        System.out.println(l);
		    }

	}

}
