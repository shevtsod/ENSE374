package test;
/**
* FILENAME:
*  ListElement.java
*
* DESCRIPTION:
*	Program to test linked list implementation.
*
* @author
*  Daniel Shevtsov (SID: 200351253)
*/

import com.shevtsod.linkedlist.*;

public class ListProgram {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ListElement le = new ListElement();
		
		//Populate the ListElement
		le.setData(322);
		
		//Add a node
		ll.addElement(le);
		
		//Retrieve a node
		System.out.println("Retrieving node 0 from list, expecting 322");
		System.out.println(ll.getElement(0).getData());
		
		//Delete a node
		System.out.println("Deleting node 0 from list, expecting 322");
		System.out.println(ll.deleteElement(0).getData());
		
		//Retrieve node from empty list
		System.out.println("Retrieving node from empty list, expecting null");
		if(ll.getElement(0) == null) {
			System.out.println("null");
		} else {
			System.out.println("not null");
		}
		
		System.out.println("Populating list with values 1 to 9");
		for(int i = 1; i < 10; i++) {
			le.setData(i);
			ll.addElement(le);
		}
		
		//Print linked list from the head
		System.out.println("Printing list from head:");
		ll.printLinkedListHead();
		
		//Print linked list from the tail
		System.out.println("Printing list from tail:");
		ll.printLinkedListTail();
		
		System.out.println("Program completed successfully");
	}

}
