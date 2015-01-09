package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import banking.Money;

public class Money_APITest extends TestCase {

	private Money_API money_API;
	public Money_APITest( String name ) {
        super(name );
    }
//run before every test
	protected void setUp() {
	
		money_API = new Money_API();
	} 

	public void testgetMoney()
	{
		Money money = new Money(50, 50);
		String actual = money_API.getMoney(money);
		String expected = "$50.50";
		assertEquals(expected, actual);
		
		
	}
	public void testtoCents()
	{
		Money money = new Money(100,00);
		long actual = money_API.toCents(money);
		long expected = 10000;
		assertEquals(expected, actual);
	}
	public void testAddMoney()
	{
		Money money = new Money(100,00);
		long actual = money_API.addMoney(money);
		long expected = 20000;
		assertEquals(expected, actual);
		
	}
	public void testSubtractMoney()
	{
		Money money = new Money(100,00);
		long actual = money_API.subtractMoney(money);
		long expected = 0;
		assertEquals(expected, actual);
		
	}
	
}
