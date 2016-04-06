package com.hash.iteratorclass;
//This program has been written to display the elements of hash set using iterator.
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDisplay {
	
	public static void main(String[] args) {
		
		HashSet<String> objHashSet = new HashSet<String>();				//Creating an object for Hashset.
		
		objHashSet.add("Ganesh");										//Adding values to Hashset.
		objHashSet.add("Deepak");
		objHashSet.add("Banergee");
		objHashSet.add("Chandru");
		objHashSet.add("Raghuram");
		
		Iterator<String> objIterator = objHashSet.iterator();			//Creating an object of Iterator.
		while(objIterator.hasNext())									//Using while loop to display the elements of hash set.
		{
			
			System.out.print(objIterator.next());						//Printing the elements of hashset.
			System.out.print(", ");										//Printing the seperator.
			
		}
		
		
		
	}
	
}
