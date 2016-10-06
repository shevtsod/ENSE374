/**
* FILENAME:
*  LinkedList.java
*
* DESCRIPTION:
*	Implements a single linked list.
*
* @author
*  Daniel Shevtsov (SID: 200351253)
*/

package com.shevtsod.linkedlist;

import java.lang.reflect.Array;

public class LinkedList {
	private ListElement head, tail, le;
	private int _nElements;
	
	
	/**
	 * Construct an empty linked list.
	 */
	public LinkedList() {
		le = head = tail = null;
		_nElements = 0;
	}
	
	/**
	 * Add a new ListElement to the linked list
	 * @param le
	 *   next ListElement to be added to the list
	 */
	public void addElement(ListElement le) {
		//Create a new node and deep copy from passed-in node.
		this.le = new ListElement();
		this.le.setData(le.getData());
		
		//If no head, set this node to head and tail
		//Otherwise, set this node to the tail
		if(head == null) {
			this.head = this.tail = this.le;
		} else {
			this.tail.setNext(this.le);
			this.tail = this.le;
		}
		
		_nElements++;
	}
	
	/**
	 * Retrieve the node at a given index
	 * @param index
	 *   The index of the requested node
	 * @return ListElement
	 *   The ListElement at the index
	 *   null if ListElement does not exist
	 */
	public ListElement getElement(int index) {	
		if(index > _nElements)
			return null;
		
		//Start from the head and iterate to the requested index.
		le = head;
		
		for(int i = 0; i < index; i++) {
			le = le.getNext();
		}
		
		return le;
	}
	
	/**
	 * Delete the node at a given index
	 * @param index
	 *   The index of the requested node
	 * @return ListElement
	 *   The ListElement that is removed at the index
	 *   null if ListElement does not exist
	 */
	public ListElement deleteElement(int index) {
		if(index > _nElements)
			return null;
		
		ListElement temp;
		
		//Start from the head and iterate to the requested index.
		le = head;
		temp = null;
		
		//If node is at head, set this node to null.
		//Otherwise, iterate to the node.
		if(index == 0) {
			head = null;
		} else {	
			for(int i = 0; i < index; i++) {
				temp = le;
				le = le.getNext();
			}
		}
			
		//Remove this node, and reroute previous and next around it.
		if(temp != null)
			temp.setNext(le.getNext());
		
		_nElements--;

		return le;
	}
	
	/**
	 * Print this linked list from tail to head
	 */
	public void printLinkedListTail() {
		//Start from the head and iterate to the tail, saving
		//each value to an array.
		int[] listElementArray = new int[_nElements];
		if(head == null) {
			System.out.println("Empty list.");
			return;
		}
		
		le = head;
		for(int i = 0; i < _nElements; i++) {
			listElementArray[i] = le.getData();
			le = le.getNext();
		}
		
		//Print array backwards
		for(int i = _nElements - 1; i > 0; i--) {
			System.out.print(listElementArray[i] + " <- ");
		}
		System.out.println(listElementArray[0]);
	}
	
	/**
	 * Print this linked list from head to tail
	 */
	public void printLinkedListHead() {
		//Start from the head and iterate to the tail, printing each
		//node on the way.
		if(head == null) {
			System.out.println("Empty list.");
			return;
		}
		
		le = head;
		for(int i = 0; i < _nElements - 1; i++) {
			System.out.print(le.getData() + " -> ");
			le = le.getNext();
		}
		System.out.println(le.getData());
	}
}
