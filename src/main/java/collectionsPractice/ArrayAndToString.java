package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndToString {

	public static void main(String[] args) {
		int ar[]= {1,2,4,6};
		System.out.println("primitive dataType with toString "+ar.toString());
		System.out.println("Array. toString (primitive) "+Arrays.toString(ar));
		List<String>myLis=new ArrayList <>(Arrays.asList("1","2"));
		
				
				System.out.println("colllection with toString "
						+ ""+new ArrayList <>(Arrays.asList("1","2")));
				//System.out.println("Array. toString "+Arrays.toString(ar));
				
				System.out.println("colllection with Arrays.toString "
						+ ""+Arrays.toString(myLis.toArray()));

	}

}
