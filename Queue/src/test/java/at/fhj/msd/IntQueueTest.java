package at.fhj.msd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class IntQueueTest {

    public IntQueue q;

    /**
     * The test method sets the maximum size of the list before the testing begins.
     */
    @Before
    public void setUp() {
        q = new IntQueue(5);
    }

    /**
     * The test method tests if the method 'offer' returns true if the added element is still in the range of the maximum
     * list size.
     */
    @Test
    public void testIsOfferTrue() {
        assertTrue(q.offer(1));
    }

    /**
     * The test method tests if the method 'offer' returns false if the added element is not in the range of the maximum
     * list size anymore.
     */
    @Test
    public void testIsOfferFalse() {
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        assertFalse(q.offer(6));
    }

    /**
     * The test method checks if the method 'poll' returns null if there is no more element in the queue.
     */
    @Test
    public void testIsPollNull() {
        assertNull(q.poll());
    }

    /**
     * The method checks if the method 'poll' returns the value of the first element (head) in case there is a first
     * element.
     */
    @Test
    public void testPoll() {
        q.offer(1);
        assertEquals(1, q.poll().intValue());
    }

    /**
     * The test method checks if the method 'remove' returns the value of the element that is deleted.
     */
    @Test
    public void testRemove() {
        q.offer(1);
        assertEquals(1, q.remove().intValue());
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * The test method tests if a NoSuchElementException is thrown when there is no more element in the queue but you
     * try to remove an element.
     */
    @Test
    public void testIsRemoveNull() {
        exception.expect(NoSuchElementException.class);
        exception.expectMessage("there's no element any more");
        q.remove();
    }

    /**
     * The test method checks if the method 'peak' returns null if there is no more element in the queue.
     */
    @Test
    public void testIsPeekNull() {
        assertNull(q.peek());
    }

    /**
     * The test method checks if the method 'peak' returns the value of the element that you just added.
     */
    @Test
    public void testPeek() {
        q.offer(1);
        assertEquals(1, q.peek().intValue());
    }

    /**
     * The test method checks if the method 'element' returns the first element of the queue (after adding it).
     */
    @Test
    public void testElement() {
        q.offer(1);
        assertEquals(1, q.element().intValue());
    }

    /**
     * The test method checks if the method 'element' throws a NoSuchElementException if you ask for the value of the
     * element but there is no element anymore.
     */
    @Test
    public void testIsElementNull() {
        exception.expect(NoSuchElementException.class);
        exception.expectMessage("there's no element any more");
        q.element();
    }
}
