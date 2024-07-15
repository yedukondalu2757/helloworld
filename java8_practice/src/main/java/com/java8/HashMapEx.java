package com.java8;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(103, "Rakesh");
		map.put(104, "Ashok");
		map.put(105, "Rajesh");
		map.put(106, "Naveen");
		map.put(107, "Hari");
		System.out.println("Initial list of elements in Hash Map: ");  
		for(Map.Entry m : map.entrySet()) {			
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		//You cannot store duplicate keys in HashMap. 
		//However, if you try to store duplicate key with another value, it will replace the value.
		//trying duplicate key
		map.put(107, "Manoj");		
		
		System.out.println("After trying duplicate key in Hash Map: ");
		
		for(Map.Entry m : map.entrySet()) {			
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}		
		
		map.putIfAbsent(102, "Hari");  
	    System.out.println("After invoking putIfAbsent() method in Hash Map: ");  
	    for(Map.Entry m:map.entrySet()){    
	    	System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
	    }
	    map.put(101,"Sravan");  
	    map.put(108,"Ravi");  
	    map.putAll(map);  
	    System.out.println("After invoking putAll() method in Hash Map: "); 
	    for(Map.Entry m:map.entrySet()){    
	    	System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
	    }
	    //different ways to remove elements below
	    
	    //key-based removal  
	    map.remove(108);  
	    System.out.println("Updated list of elements: "+map); 
	    
	    //key-value pair based removal  
	    map.remove(107, "Manoj");  
	    System.out.println("Updated list of elements: "+map);  
	    
	    //different ways to replace elements below.
	    map.replace(104, "Manoj"); 
	    System.out.println("Updated list of elements: "+map); 
	    map.replace(103, "Rakesh", "Ajay");
	    System.out.println("Updated list of elements: "+map); 
	    map.replaceAll((k,v) -> "Jai Sri Ram"); 
	    System.out.println("Updated list of elements: "+map); 
	    
	}

}

