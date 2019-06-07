/*
 * interface: Queue
 * description: The interface has some methods heads such as peek, poll, remove etc. that can be inherited
 * last change: 7.6.2019
 */

package at.fhj.msd;

/**
 * The interfacee consists of method heads like peek, poll or remove that can be inherited
 *
 * @author Markus Paier
 * @author Ulrike Gartler
 * @version 1.0
 */
public interface Queue {
	
	/**
	 *  Adds the element obj to the queue. 
	 *  If the addition is successful, the method returns true else false.
	 *
	 * @param obj parameter to add a new element
	 * @return if added correctly returns true
	 */
	public abstract boolean offer(Object obj);

	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 *
	 * @return returns the head element of the queue
	 */
	public abstract Object poll();
	
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return returns the head element of the queue
	 */
	public abstract Object remove();
	
	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty.
	 *
	 * @return returns the head element of the queue
	 */
	public abstract Object peek();
	
	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 *
	 * @return returns the head element of the queue
	 */
	public abstract Object element();
	
}

