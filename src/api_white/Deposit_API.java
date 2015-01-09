package api_white;

import banking.Card;
import banking.Receipt;
import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;
import atm.physical.CustomerConsole.Cancelled;
import atm.physical.EnvelopeAcceptor;
import atm.transaction.Deposit;
import atm.transaction.Withdrawal;

public class Deposit_API {
	
	ATM theATM  = null;
	 
	public Deposit_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public int deposit(String menu_input)
	{
		Session session = new Session(theATM);

		try{
		theATM.switchOn();
		theATM.cardInserted();
		new Thread(theATM).start();
		theATM.getOperatorPanel().setNumberOfBills(10);
		CardReader card = new CardReader(theATM);
		CardReader.setCardNumber(1);
		CustomerConsole cus = new CustomerConsole();
		cus.setInput("42");
		cus.setMenu_input(menu_input);
		cus.setRead_input("2");
	
		session.performSession();
		
		
	}
		
		catch(Exception e)
		{
			
		}
		return session.getState();
	}
	public int depositMoney(String accNo, String amount)
	{
	
	

		try{
			theATM.switchOn();
			theATM.cardInserted();
			new Thread(theATM).start();
			Session session = new Session(theATM);
			CardReader card = new CardReader(theATM);
			CardReader.setCardNumber(1);
			CustomerConsole cus = new CustomerConsole();
			cus.setInput("42");
			cus.setMenu_input("2");
			cus.setDeposit_menu_input(accNo);
			cus.setRead_input(amount);
			session.performSession();
			
			
			
		}
			
			catch(Exception e)
			{
				
			}
			return Session.getState();
		
	}
	

}
