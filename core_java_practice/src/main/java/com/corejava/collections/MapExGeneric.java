package com.corejava.collections;
import java.util.*;

public class MapExGeneric {
	public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  Map<Integer, String> map2 = new HashMap<Integer, String>();
		  map2.put(105, "Sandesh");
		  map2.put(106, "Satya");
		  map2.put(107, "Manoj");
		  map2.put(108, "Sravan");
		  map2.put(109, "Santosh");
		  for(Map.Entry m2: map2.entrySet()) {
			  System.out.println(m2.getKey()+", "+m2.getValue());
		  }
		  System.out.println("Ex for comparingByKey()/ comparingByValue()");  
//		  map2.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
//	      .stream()  
	      //Sorted according to the provided Comparator  
	      //.sorted(Map.Entry.comparingByKey())  
	      //.sorted(Map.Entry.comparingByValue())  
	      //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
//	      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
//	      .forEach(System.out::println); 
		  
		  
		  
		 }  

}
