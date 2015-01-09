package api_white;

import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;

public class Inquiry_API {
	ATM theATM  = null;
	 
	public Inquiry_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public int inquiry(String menu_input)
	{
		Session session = new Session(theATM);

		try{
		theATM.switchOn();
		theATM.cardInserted();
		new Thread(theATM).start();
		theATM.getOperatorPanel().setNumberOfBills(10);;
		
		CardReader card = new CardReader(theATM);
		CardReader.setCardNumber(1);
		CustomerConsole cus = new CustomerConsole();
		cus.setInput("42");
		cus.setMenu_input(menu_input);
		session.performSession();
		
		
	}
		
		catch(Exception e)
		{
			
		}
		return session.getState(); 
	}	
	
	public int inquireAccount(String accNo)
		{
		
		
	
			try{
				theATM.switchOn();
				theATM.cardInserted();
				new Thread(theATM).start();
				theATM.getOperatorPanel().numberOfBills = 10;
				Session session = new Session(theATM);
				CardReader card = new CardReader(theATM);
				CardReader.setCardNumber(1);
				CustomerConsole cus = new CustomerConsole();
				cus.setInput("42");
				cus.setMenu_input("4");
				cus.setWithdrawal_menu_input(accNo);
				
				session.performSession();
				
			}
				
				catch(Exception e)
				{
					
				}
				return Session.getState();
			
		}
	
}
