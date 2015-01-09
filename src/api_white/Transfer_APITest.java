package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class Transfer_APITest extends TestCase {

	private Transfer_API transfer_API;

	// Constructor

		 public Transfer_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				transfer_API = new Transfer_API();
			} 

		public void testTransfer()
			{
				int actual = transfer_API.transfer("3");
				int expected = 4;
				assertEquals(expected, actual);
				
			}
			public void testTransferCancel()
			{
				int actual = transfer_API.transfer(null);
				int expected = 6;
				assertEquals(expected, actual);
				
			}
			public void testTransferMoney()
			{
				int actual = transfer_API.transferMoney("1","2","3");
				int expected = 4;
				assertEquals(expected, actual);
			}
			public void testTransferIncorrectMoney()
			{
				int actual = transfer_API.transferMoney("1","2","5");
				int expected = 4;
				assertEquals(expected, actual);
			}
			
			
			

}
