package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import banking.Receipt;

public class Deposit_APITest extends TestCase {

	private Deposit_API deposit_API;

	// Constructor

		 public Deposit_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				deposit_API = new Deposit_API();
			} 

		public void testDeposit()
			{
				int actual = deposit_API.deposit("2");
				int expected = 4;
				assertEquals(expected, actual);
				
			}
			public void testDepositCancel()
			{
				int actual = deposit_API.deposit(null);
				int expected = 6;
				assertEquals(expected, actual);
				
			}
			public void testDepositMoney()
			{
				int actual = deposit_API.depositMoney("1","3");
				int expected = 4;
				assertEquals(expected, actual);
			}
			public void testDepositIncorrectMoney()
			{
				int actual = deposit_API.depositMoney("1","5");
				int expected = 4;
				assertEquals(expected, actual);
			}
			
			

}
