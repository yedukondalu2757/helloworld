package com.corejava.collections;

import java.util.*;

public class HashMapInternalWorkingEx {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Naveen", 100);
		map.put("Tom", 200);
		map.put("Lisa", 300);
		map.put("Peter", 400);
		map.put("Robby", 600);
		
		map.put(null, 500);	
		
//		System.out.println(map.get("Robby"));
		
		System.out.println("List of elements in Hash Map: ");  
		for(Map.Entry m : map.entrySet()) {			
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		
	    
	}

}
