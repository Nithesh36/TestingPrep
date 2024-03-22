package collectionsPractice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<Integer>demo1=new LinkedList<>();
    demo1.add(1);
    demo1.add(3);
    demo1.add(9);
    
//    System.out.println(demo1);
//    System.out.println(demo1.getLast());
    //remove using element value
//    demo1.remove(Integer.valueOf(1));
  ListIterator<Integer>Ls=  demo1.listIterator();
  System.out.println(Ls);
  while (Ls.hasNext()) {  
      System.out.println(Ls.next());  
  }  
  
  System.out.println("after ran");
  while(Ls.hasPrevious()) {
	  System.out.println(Ls.previous());
//	  System.out.println("ran");
  }
       
	System.out.println("demo: "+demo1);

	}

}
