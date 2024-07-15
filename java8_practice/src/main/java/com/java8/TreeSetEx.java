package com.java8;
import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();    
        set.add(24);    
        set.add(66); 
        set.add(98);     
        set.add(6);    
        set.add(15);    
        System.out.println("Lowest Value: "+set.pollFirst());    
        System.out.println("Highest Value: "+set.pollLast());   
        
        TreeSet<String> set2=new TreeSet<String>();  
        set2.add("Ravi");  
        set2.add("Vijay");  
        set2.add("Ajay"); 
        set2.add("Harsha");
        set2.add("Sreedhar");
        set2.add("Surya"); 		  
        set2.add("Anuj");              
        set2.add("Virat");
        set2.add("Amit");   
        set2.add("Sonoo");  
        set2.add("Hanuman");
        set2.add("Gaurav");  
        System.out.println("Traversing elements through Iterator");
        Iterator<String> itr = set2.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
        Iterator<String>  i=set2.descendingIterator();  
        System.out.println("Traversing elements through Iterator in descending order");
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        System.out.println("Initial Set: "+set2);  
        
        System.out.println("Reverse Set: "+set2.descendingSet());  
          
        System.out.println("Head Set: "+set2.headSet("Harsha", true));  
        
        System.out.println("SubSet: "+set2.subSet("Harsha", false, "Virat", true));  
        
        System.out.println("TailSet: "+set2.tailSet("Sonoo", true));  
        
        System.out.println("parallelStream: "+set2.stream());  

	}

}
