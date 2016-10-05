package com.shevtsod.linkedlist;

public class LinkedList {
	private ListElement head, tail, le;
	private int _nElements;
	
	
	/**
	 * Construct an empty linked list.
	 */
	public LinkedList() {
		le = head = tail = null;
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
		if(head == null) {
			this.head = this.tail = le;
		} else {
			this.le = new ListElement();
			this.tail = le;
		}
			
	}
	
	/**
	 * Retrieve the node at a given index
	 * @param index
	 *   The index of the requested node
	 * @return ListElement
	 *   The ListElement at the index
	 */
	public ListElement getElement(int index) {
		
		return null;
	}
	
	/**
	 * Delete the node at a given index
	 * @param index
	 *   The index of the requested node
	 * @return ListElement
	 *   The ListElement that is removed at the index
	 */
	public ListElement deleteElement(int index) {
		
		return null;
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}
