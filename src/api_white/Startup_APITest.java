package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import atm.ATM;



public class Startup_APITest extends TestCase {

	private Startup_API startup;

	// Constructor

		 public Startup_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				startup = new Startup_API();
			}
			
			public void testSwitchOn()
			{
				boolean actual = startup.switchOn();
				boolean expected = true;
				assertEquals(expected, actual);
	
			}
			public void testcardInserted()
			{
				boolean actual = startup.cardInserted();
				boolean expected = true;
				assertEquals(expected, actual);
			}
			public void testgetId()
			{
				int actual = startup.getId();
				int expected = 42;
				assertEquals(expected, actual);
			}
			public void testgetPlace()
			{
				String actual = startup.getPlace();
				String expected = "Gordon College";
				assertEquals(expected, actual);
			}
			public void testgetBankName()
			{
				String actual = startup.getBankName();
				String expected = "First National Bank of Podunk";
				assertEquals(expected, actual);
				
			}
			public void testcheckConnectionToBank()
			{
				boolean result = startup.checkConnectionToBank(10);
				boolean actualResult = true;
				assertEquals(result,actualResult);
			}
			public void testInsertCard()
			{
				int actual = startup.insertCard(1);
				int expected = 2;
				assertEquals(expected, actual);
			}
			public void testInsertIncorrectCard()
			{
				int actual = startup.insertCard(-1);
				int expected = 6;
				assertEquals(expected, actual);
			}
			public void testGetEnvelopeAcceptor() throws Exception {
				ATM atm = new ATM(42, "Gordon College", "First National Bank of Podunk", null );
				assertEquals(atm.envelopeAcceptor, atm.getEnvelopeAcceptor());
			}

			public void testGetLog() throws Exception {
				ATM atm = new ATM(42, "Gordon College", "First National Bank of Podunk", null );
				assertEquals(atm.log, atm.getLog());
			}

			public void testGetNetworkToBank() throws Exception {
				ATM atm = new ATM(42, "Gordon College", "First National Bank of Podunk", null );
				assertEquals(atm.networkToBank, atm.getNetworkToBank());
			}
			
			
}
