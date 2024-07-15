package com.java8;
import java.util.*;  

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes"); 
		  ListIterator<String> litr = al.listIterator();  
          
          System.out.println("Traversing elements in forward  direction:");  
          while(litr.hasNext()){  
		   System.out.println(litr.next());  
		  } 
          
          System.out.println("Traversing elements in backward direction:");    
          while(litr.hasPrevious()){ 
            System.out.println(litr.previous());    
          } 
          
		  //Traversing list
		  System.out.println("Traversing list: "+al);  
		  //accessing the element  
		  System.out.println("Returning element: "+al.get(1)); 
		  //it will return the 3rd element, because index starts from 0
		  //changing the element  
		  al.set(2,"Dates");  
		  //Traversing list through Iterator  
		  Iterator itr=al.iterator();//getting the Iterator  
		  while(itr.hasNext()){
			  //check if iterator has the elements 
			  //printing the element and move to next  
			  System.out.println("Traversing list through Iterator: " +itr.next());
		  }  
		  //Traversing list through for-each loop  
		  for(String fruit:al)    
		    System.out.println("Traversing list through for-each loop:  "+fruit);    
		  
		  //Sorting the list  
		  Collections.sort(al);  
		   //Traversing list through the for-each loop  
		  for(String fruit:al)  
		    System.out.println("After Sorting list: "+fruit);  
		  
		  System.out.println("Sorting numbers...");  
		  //Creating a list of numbers  
		  List<Integer> al2=new ArrayList<Integer>();  
		  al2.add(21);  
		  al2.add(11);  
		  al2.add(51);  
		  al2.add(1);  
		  //Sorting the list  
		  Collections.sort(al2);  
		   //Traversing list through the for-each loop  
		  for(Integer number:al2)  
		    System.out.println("After Sorting list: "+number);
		  
		//Adding elements to the end of the list  
		  al.add("Orange");  
          System.out.println("An initial list of elements: "+al);   
          //Removing specific element from arraylist  
          al.remove("Dates");  
          System.out.println("After remove method: "+al);   
          //Removing element on the basis of specific position  
          al.remove(0);  
          System.out.println("After Removing element from list: "+al);
          
          ArrayList<String> al3=new ArrayList<String>();    
          al3.add("Papaya");    
          al3.add("Guava");   
          al.addAll(al3);  
          System.out.println("Updated list : "+al);   
          //Removing all the new elements from arraylist    
//          Removing elements on the basis of specified condition  
          al.removeIf(str -> str.contains("Papaya"));   //Here, we are using Lambda expression   
          System.out.println("After invoking removeIf() method: "+al); 
          System.out.println("Is ArrayList Empty: "+al.isEmpty());   
          al.clear();
          System.out.println("Is ArrayList Empty: "+al.isEmpty());  

	}  
		  

}
