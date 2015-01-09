package api_white;

import banking.Money;

public class Money_API {
	
	public String getMoney(Money mon)
	{
		return mon.toString();
	}
	public long toCents(Money mon)
	{
		return mon.cents;
	}
	public long addMoney(Money mon)
	{
		mon.add(mon);
		return mon.cents;
	}
	public long subtractMoney(Money mon)
	{
		mon.subtract(mon);
		return mon.cents;
	}

}
