package api_white;

import banking.Balances;
import banking.Money;

public class Balance_API {

	
	public String getTotal(Money total, Money avail)
	{
		Balances balance = new Balances();
		balance.setBalances(total, avail);
		return balance.getTotal().toString();
		
	}
	public String getAvaliable(Money total, Money avail)
	{
		Balances balance = new Balances();
		balance.setBalances(total, avail);
		return balance.getAvailable().toString();
		
	}
}
