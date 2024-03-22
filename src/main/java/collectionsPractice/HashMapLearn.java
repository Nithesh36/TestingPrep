package collectionsPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String>map=new HashMap<>();
   
   map.put(1, "1");
   map.put(2, "9");
   
    System.out.println(map.entrySet());
     for (Entry<Integer, String> entry : map.entrySet()) {
		int key = entry.getKey();
		String val = entry.getValue();
		System.out.println(val);
	}
       for(Entry<Integer,String>mb:map.entrySet()) {
    	   System.out.println(mb.getValue());
    	   System.out.println(mb.getKey());
       }
	System.out.println(map.values());
	System.out.println(map.keySet());
	System.out.println(map.get(2));
	map.remove(1);
	
	System.out.println(map +" map");

	}

}
