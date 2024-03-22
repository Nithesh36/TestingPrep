package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	/**
	 * @author 10322 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maintain insertion order  ,allow duplicates,we can insert null values	,non synchronized
		
		//if we perform two operations  we will get runTime exception-java.util.ConcurrentModificationException (non synchronized)
		
		ArrayList<String>myList=new ArrayList<>();
		myList.add("helo");
		myList.add("a");
		myList.add("us");
		myList.add("us");
		myList.add("WEE");
		myList.add(null);
		System.out.println("myLis "+myList);
		
		for (int $i = 0; $i < myList.size(); $i++) {
			System.out.println(myList.get($i));
			
		}
		//lastIndexOf  -return index of element if not found return -1
		System.out.println(myList.lastIndexOf("us"));
		
		System.out.println("addded to another list ");
		//add to another list (passing as a collection)
		//return true if this list changed as a result of the call
		List<Object>ls=new LinkedList<>();
				ls.addAll(myList);
			System.out.println(ls);
			//remove all-return true if the list got changed
			System.out.println("remove all");
		//System.out.println(	ls.removeAll(myList));
			System.out.println(ls.size());
			//remove -return Remove the element that was removed from the list
			System.out.println("remove using index");
			System.out.println(	myList.remove(0));  // using index
			//Return -true if the element contains specified element
			System.out.println("removed using element val");
		System.out.println(	myList.remove("us"));
		
		System.out.println("List iterator");
		//Traversing - Iterator  we can iterate forward and backward 
		//it is specific to List Based collections arrayList,LinkedList
		ListIterator<String> listIterator=myList.listIterator();
		while (listIterator.hasNext()) {
			String $string = listIterator.next();
			System.out.println($string);
		}
		System.out.println("List iterator with previous navigation");
		while (listIterator.hasPrevious()) {
			String $string = listIterator.previous();
			System.out.println($string);
		}
		
		//Iterator -applied to all the collections we can only move forward we can't navigate back
		System.out.println(" iterator");
		Iterator<String> iteratorGeneric=myList.iterator();
		while (iteratorGeneric.hasNext()) {
			
			System.out.println(iteratorGeneric.next());
			//if we perform two operations  we will get runTime exception-java.util.ConcurrentModificationException
			//myList.add(iteratorGeneric.next());
		}
		
		ls.add("jon");
		ls.add(0, "welcoe");
		ls.add("av");
		
		System.out.println(ls.containsAll(Arrays.asList("jo","welcoe")));
		System.out.println((ls.toArray()));
		System.out.println(ls.equals(Arrays.asList("welcoe","jon")));
	//	ls.sort(null);
		System.out.println(ls);
		
		//Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
//    for(int i=0;i<myList.size();i++) {
//    	for(int j=i+1;j<myList.size();j++) {
//    		//if(String.valueOf(myList.get(i))>String.valueOf(myList.get(j)))
//    	}
//    }
		
		ArrayList<Integer>intList=new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(7);
		intList.add(5);
		
		    for(int i=0;i<myList.size();i++) {
		    	for(int j=i+1;j<myList.size();j++) {
   		if(intList.get(j)<intList.get(i)) {
   		Integer temp=intList.get(i);
   		intList.set(i, intList.get(j));
   		intList.set(j, temp);
   		}
	    	}
	    }	
	System.out.println(intList);
	ArrayList<String>myList1=new ArrayList<>();
	myList1.add("ab");
	myList1.add("b");
	myList1.add("bf");
	myList1.add("d");
	myList1.add("c");
	
	
	for (int i = 0; i < myList1.size(); i++) {
		for (int j = i + 1; j < myList1.size(); j++) {
			if (((String) myList1.get(i)).compareTo((String) myList1.get(j)) >0) {
				String temp = myList1.get(i);
				myList1.set(i, myList1.get(j));
				myList1.set(j, temp);
			}
		}
	}
System.out.println("sort "+ myList1);

	}

}
