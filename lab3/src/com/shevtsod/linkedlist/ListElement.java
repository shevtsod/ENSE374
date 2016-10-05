/*
* FILENAME:
*  ListElement.java
*
* DESCRIPTION:
*	Implements a single linked list.
*
* AUTHOR:
*  Daniel Shevtsov (SID: 200351253)
*/

package com.shevtsod.linkedlist;

public class ListElement {
	private ListElement next;
	private int data;
	
	public ListElement() {
		this.setData(0);
		this.setNext(null);
	}

	/**
	 * Get data stored in the node.
	 * @return data
	 *   an integer stored in the node
	 */
	public int getData() {
		return data;
	}

	/**
	 * Set data stored in the node.
	 * @param data
	 *   an integer to be stored in the node
	 * @return
	 *   None
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Get the next ListElement
	 * @return next
	 *   The next ListElement in the list
	 *   null if next element does not exist
	 */
	public ListElement getNext() {
		return next;
	}

	/**
	 * Set the next ListElement
	 * @param next
	 *   The next ListElement to be added to the list
	 */
	public void setNext(ListElement next) {
		this.next = next;
	}
}