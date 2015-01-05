import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class QueueTest {

	@Test
	public void testNewQueueReturnNull() {
		Queue q = new Queue();
		assertNull(q.deque());
	}
	
	@Test
	public void testEmptyQueue(){
		Queue q = new Queue();
		assertTrue(q.isEmpty());
		q.enque("");
		assertFalse(q.isEmpty());
	}
	
	
	@Test 
	public void testEnqueDequeMultipleElements(){
		Queue q = new Queue();
		q.enque("ist");
		q.enque("2nd");
		assertEquals("ist",q.deque());
		assertEquals("2nd",q.deque());
		assertEquals(null,q.deque());
	}
	@Test
	public void testSizeOfQue(){
		Queue q = new Queue();
		q.enque("ist");
		q.enque("2nd");
		assertEquals(2, q.size());
	}
	
	@Test
	public void testEquals(){
		Queue q1 = new Queue();
		q1.enque("ist");
		q1.enque("2nd");
		
		Queue q2 = new Queue();
		q2.enque("ist");
		q2.enque("2nd");
		
		Queue q3= new Queue();
		q3.enque("1");
		q3.enque("2nd");
		
		assertEquals(q1, q2);
		assertEquals(q1, q1);
		assertNotEquals(q1, q3);
		assertNotEquals(q1, null);
		assertNotEquals(new Queue(), new ArrayList<Object>());
		
		
	}
	
		
}
