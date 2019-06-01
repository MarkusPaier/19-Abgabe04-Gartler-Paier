package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * The class consists of an Arraylist of Strings and an integer called maxSize.
 * It has methods to add and remove or poll elements
 */
public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/**
	 * The method sets the maximum size of the list.
	 * @param maxsize
	 */
	public StringQueue(int maxsize){

		maxSize = maxSize;
	}

	/**
	 * The method adds a new element to the list and returns true if the addition worked fine and false if it did not
	 * work.
	 * @param obj
	 * @return
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 * The method return the first element of the queue (head) and deletes it afterwards.  If the queue is empty, null
	 * is returned.
	 * @return
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() > 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * The method takes the first element of the queue, returns is and then deletes it. If the element is null a
	 * NoSuchElementException is thrown.
	 * @return
	 */
	@Override
	public String remove() {
		String element = poll();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

	/**
	 * The method return the first element of the queue but does not delete it. If the queue is empty, null is returned.
	 * @return
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 * The method return the first element of the queue, does not delete it and if the element is null, a
	 * NoSuchElementException is thrown.
	 * @return
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}