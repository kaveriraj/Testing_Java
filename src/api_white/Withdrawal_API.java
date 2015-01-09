package api_white;


import banking.Card;
import banking.Money;
import banking.Receipt;
import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;
import atm.transaction.Transaction;
import atm.transaction.Withdrawal;

public class Withdrawal_API {

	ATM theATM  = null;
	 
	public Withdrawal_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public int withdrawal(String menu_input)
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
	
	public int withdrawMoney(String accNo, String amount)
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
				cus.setMenu_input("1");
				cus.setWithdrawal_menu_input(accNo);
				cus.setWithdrawal_amount_menu_input(amount);
				session.performSession();
				
			}
				
				catch(Exception e)
				{
					
				}
				return Session.getState();
			
		}
	
			
	}



