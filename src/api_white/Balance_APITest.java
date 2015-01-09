package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import banking.Money;

public class Balance_APITest extends TestCase {

	private Balance_API balance_API;
	public Balance_APITest( String name ) {
        super(name );
    }
//run before every test
	protected void setUp() {
	
		balance_API= new Balance_API();
	} 
	public void testGetTotal()
	{
		Money total = new Money(100);
		Money avail = new Money(50);
		String actual = balance_API.getTotal(total, avail);
		String expected = "$100.00";
		assertEquals(expected, actual);
		
	}
	public void testGetAvailable()
	{
		Money total = new Money(100);
		Money avail = new Money(50);
		String actual = balance_API.getAvaliable(total, avail);
		String expected = "$50.00";
		assertEquals(expected, actual);
		
	}
	
}
