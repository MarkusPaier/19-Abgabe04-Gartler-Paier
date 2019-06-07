package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
public class IntQueue implements Queue {

	private List<Integer> elements = new ArrayList<Integer>();
	private int maxSize;
	private static final Logger logger = LogManager.getLogger(IntQueue.class);

	/**
	 * The constructor sets the maximum size of the list.
	 * @param maxSize
	 */
	public IntQueue(int maxSize){
		logger.info("constructor with maxSize " + maxSize);
		this.maxSize = maxSize;
	}

	/**
	 * The method adds a new element to the list and returns true if the addition worked fine and false if it did not
	 * work.
	 * @param obj
	 * @return
	 */
	@Override
	public boolean offer(Object obj) {
		logger.info("offer " + obj);
		if(elements.size()!= maxSize)
			elements.add((Integer) obj);
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
	public Integer poll() {
		logger.info("poll");
		Integer element = peek();

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
	public Integer remove() {
		logger.info("remove");
		Integer element = poll();
		if(element == null){
			logger.error("throw NoSuchElementtException");
			throw new NoSuchElementException("there's no element any more");}

		return element;
	}

	/**
	 * The method return the first element of the queue but does not delete it. If the queue is empty, null is returned.
	 * @return
	 */
	@Override
	public Integer peek() {
		logger.info("peek");
		Integer element;
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
	public Integer element() {
		logger.info("element");
		Integer element = peek();
		if(element == null) {
			logger.error("throw NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		return element;
	}
}