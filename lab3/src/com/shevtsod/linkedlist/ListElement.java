/**
* FILENAME:
*  ListElement.java
*
* DESCRIPTION:
*	Implements a list element to be used in a linked list.
*
* @author
*  Daniel Shevtsov (SID: 200351253)
*/

package com.shevtsod.linkedlist;

public class ListElement {
	private ListElement next, prev;
	private int data;
	
	public ListElement() {
		this.setData(0);
		this.setNext(null);
		this.setPrev(null);
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
	
	/**
	 * Get the previous ListElement
	 * @return prev
	 *   The previous ListElement in the list
	 *   null if previous element does not exist
	 */
	public ListElement getPrev() {
		return prev;
	}

	/**
	 * Set the previous ListElement
	 * @param prev
	 *   The previous ListElement to be added to the list
	 */
	public void setPrev(ListElement prev) {
		this.prev = prev;
	}
}