package api_white;

import banking.Money;

import simulation.Simulation;
import atm.ATM;
import atm.Session;
import atm.physical.CardReader;
import atm.physical.CustomerConsole;
import atm.physical.CustomerConsole.Cancelled;
import atm.transaction.Withdrawal;

public class Startup_API {

	
	ATM theATM  = null;
	 
	public Startup_API()
	{

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null );	
	}
	public boolean switchOn()
	{
		theATM.switchOn();
		return theATM.switchOn;
	}
	public boolean cardInserted()
	{
		theATM.cardInserted();
		return theATM.cardInserted;
	}

	public int getId()
	{
		
		return theATM.getID();
	}
	public String getPlace()
	{
		
		return theATM.getPlace();
	}
	public String getBankName()
	{
		return theATM.getBankName();
	}
	public boolean checkConnectionToBank(int billNum)
	{
		new Thread(theATM).start();
		theATM.getOperatorPanel().numberOfBills = billNum;
		boolean conn =theATM.performStartup();
		return conn;
	}
	public int insertCard(int cardNumber)
	{
		try{
		theATM.switchOn();
		theATM.cardInserted();
		theATM.getOperatorPanel().setNumberOfBills(10);
		new Thread(theATM).start();
		CardReader card = new CardReader(theATM);
		CardReader.setCardNumber(cardNumber);
		Session session = new Session(theATM);
		session.performSession();
		
		
	}
		catch(Exception e)
		{
			
		}
		return Session.getState();
	
}
	
}