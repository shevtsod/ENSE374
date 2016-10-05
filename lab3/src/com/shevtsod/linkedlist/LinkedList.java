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
			this.le = new ListElement();
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
		return null;
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
		
		//Start from the tail and iterate to the requested index.
		le = head;
		return null;
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}
