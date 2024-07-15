package com.corejava.collections;
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet <String> hs = new HashSet <String>();
		hs.add("Vijay");
		hs.add("Ajay");
		hs.add("Harsha");
		hs.add("Sreedhar");
		hs.add("Harsha");//ignoring duplicate elements
		
		Iterator <String> itr = hs.iterator();
		System.out.println("Hash Set values are: ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Removing specific element from HashSet  
//        hs.remove("Sreedhar"); 
//        System.out.println("Updated List: "+hs);
//        hs.removeIf(str->str.contains("Vijay")); 
//        System.out.println("Updated List: "+hs);
//        HashSet<String> set1=new HashSet<String>();  
//        set1.add("Vinay");  
//        set1.add("Gaurav");  
//        hs.addAll(set1);  
//        System.out.println("Updated List: "+hs);
//        //Removing all the new elements from HashSet  
//        hs.removeAll(set1);  
//        System.out.println("Updated List: "+hs);
	}

}
