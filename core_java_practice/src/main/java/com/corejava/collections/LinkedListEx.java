package com.corejava.collections;
import java.util.*; 

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
		  ll.add("Surya");  
		  ll.add("Vijay");  
		  ll.add("Ravi");  
		  ll.add("Ajay");
          ll.add("Anuj");              
          ll.add("Virat");
          ll.add("Amit");   
		  
//		  Iterator<String> itr=ll.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  } 
          ListIterator<String> itr = ll.listIterator();  
            
          System.out.println("Traversing elements in forward  direction:");  
          while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
          
          System.out.println("Traversing elements in backward direction:");    
          while(itr.hasPrevious()){ 
            System.out.println(itr.previous());    
          }  
		  
		  //Adding an element at the specific position  
          ll.add(1, "Gaurav");  
          System.out.println("After invoking add(int index, E element) method: "+ll);  
          LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanuman");  
          //Adding second list elements to the first list  
          ll.addAll(ll2);  
          System.out.println("After invoking add all method: "+ll);
          //Adding an element at the first position 
          ll.addFirst("Lokesh");    
          //Adding an element at the last position  
          ll.addLast("Harsha");  
          System.out.println("After invoking addFirst & addLast methods: "+ll);
          ll.remove("Vijay"); 
          System.out.println("After remove: "+ll);  
          ll.remove(0);  
          System.out.println("After remove: "+ll);  
          ll.removeAll(ll2); 
          System.out.println("After remove: "+ll);  
          ll.removeFirst();  
          System.out.println("After remove: "+ll);  
          ll.removeLast();
          System.out.println("After remove: "+ll);  
          ll.removeFirstOccurrence("Gaurav");
          System.out.println("After remove: "+ll);  
          ll.removeLastOccurrence("Ajay");  
          System.out.println("After remove: "+ll);  
	}

}
