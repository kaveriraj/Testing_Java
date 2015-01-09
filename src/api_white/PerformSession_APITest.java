package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class PerformSession_APITest extends TestCase {

	private PerformSession_API performSession;

	// Constructor

		 public PerformSession_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				performSession = new PerformSession_API();
			} 

	

	public void testInsertPin()
	{
		int actual = performSession.insertPin("42");
		int expected = 3;
		assertEquals(expected, actual);
		
	}
	public void testInsertIncorrectPin()
	{
		int actual = performSession.insertPin("12");
		int expected = 6;
		assertEquals(expected, actual);
		
	}
	public void testShutdown()
	{
		int actual = performSession.shutDown();
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
}
