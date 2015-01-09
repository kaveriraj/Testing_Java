package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class Withdrawal_APITest extends TestCase {

	private Withdrawal_API withdrawal_API;

	// Constructor

		 public Withdrawal_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				withdrawal_API = new Withdrawal_API();
			} 

		public void testWithdrawal()
			{
				int actual = withdrawal_API.withdrawal("1");
				int expected = 4;
				assertEquals(expected, actual);
				
			}
			public void testWithdrawalCancel()
			{
				int actual = withdrawal_API.withdrawal(null);
				int expected = 6;
				assertEquals(expected, actual);
				
			}
			public void testWithdrawMoney()
			{
				int actual = withdrawal_API.withdrawMoney("1","3");
				int expected = 4;
				assertEquals(expected, actual);
			}
			public void testWithdrawIncorrectMoney()
			{
				int actual = withdrawal_API.withdrawMoney("1","5");
				int expected = 6;
				assertEquals(expected, actual);
			}
			

}
