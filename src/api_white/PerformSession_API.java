package api_white;

import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;

public class PerformSession_API {

	ATM theATM  = null;
	 
	public PerformSession_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public int  insertPin(String pin)
	{
		Session session = new Session(theATM);

		try{
		theATM.switchOn();
		theATM.cardInserted();
		new Thread(theATM).start();
		CardReader card = new CardReader(theATM);
		CardReader.setCardNumber(1);
		CustomerConsole cus = new CustomerConsole();
		cus.setInput(pin);
		//cus.setMenu_input("1");
		session.performSession();
		
		
	}
		catch(Exception e)
		{
			
		}
		return session.getState();
	}
	public int shutDown()
	{
		try{
			theATM.switchOn();
			//theATM.cardInserted();
			new Thread(theATM).start();
			
			theATM.switchOff();
			theATM.performShutdown();
			
			
		}
			catch(Exception e)
			{
				
			}
		return theATM.getState();
	}
}

