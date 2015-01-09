package api_white;

import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;

public class Transfer_API {
	ATM theATM  = null;
	 
	public Transfer_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public int transfer(String menu_input)
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
		cus.setRead_input("3");
	
		session.performSession();
		
		
	}
		
		catch(Exception e)
		{
			
		}
		return session.getState();
	}
	public int transferMoney(String accNo, String accNo2, String amount)
	{
	
	

		try{
			theATM.switchOn();
			theATM.cardInserted();
			new Thread(theATM).start();
			
			CardReader card = new CardReader(theATM);
			CardReader.setCardNumber(1);
			Session session = new Session(theATM);
			CustomerConsole cus = new CustomerConsole();
			cus.setInput("42");
			cus.setMenu_input("2");
			cus.setWithdrawal_amount_menu_input(accNo);
			cus.setDeposit_menu_input(accNo2);
			cus.setRead_input(amount);
			session.performSession();
			
			
			
		}
			
			catch(Exception e)
			{
				
			}
			return Session.getState();
		
	}

}
