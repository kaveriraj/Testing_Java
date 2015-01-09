package api_white;

import static org.junit.Assert.*;

import org.junit.Test;

import banking.Card;
import banking.Message;
import banking.Money;
import junit.framework.Assert;
import junit.framework.TestCase;

public class MessageTest extends TestCase{
	Message message;
	public void setUp() throws Exception{
		message = new Message(3,new Card(12),42, 12, 2,1,new Money(50));
	}
	public void tearDown() throws Exception{
		//
	}

	
	public void testSetPIN() throws Exception{
		message.setPIN(42);
		Assert.assertEquals(42,message.getPIN());
	}
	public void testGetMessageCode() throws Exception{
		Assert.assertEquals(3, message.getMessageCode());
	}
	public void testGetCard() throws Exception{
		Assert.assertEquals(12, message.getCard().getNumber());
	}
	public void testGetSerialNumber() throws Exception{
		Assert.assertEquals(123, message.getSerialNumber());
	}
	public void testGetFromAccount() throws Exception{
		Assert.assertEquals(1, message.getFromAccount()	);
	}
	public void testGetToAccount() throws Exception{
		Assert.assertEquals(2, message.getToAccount()	);
	}
	public void testGetAmount()throws Exception{
		Assert.assertEquals("$5.00", message.getAmount().toString());
	}
	
	public void testWithdrawal() throws Exception{
		message = new Message(0,new Card(12),12, 12, 1,2,new Money(20));
		Assert.assertEquals("WITHDRAW CARD# 12 TRANS# 122 FROM  1 TO  2 $20.00", message.toString());
	}
	public void testDeposit() throws Exception{
		message = new Message(0,new Card(12),12, 12, 1,2,new Money(20));
		Assert.assertEquals("INIT_DEP CARD# 12 TRANS# 122 FROM  1 TO  2 $20.00", message.toString());
	}
	public void testComplete() throws Exception{
		message = new Message(0,new Card(12),12, 12, 1,2,new Money(20));
		Assert.assertEquals("COMP_DEP  CARD# 12 TRANS# 122 FROM  1 TO  2 $20.00", message.toString());
	}
	public void testTransfer() throws Exception{
		message = new Message(0,new Card(12),12, 12, 1,2,new Money(20));
		Assert.assertEquals("TRANSFER CARD# 12 TRANS# 122 FROM  1 TO  2 $20.00", message.toString());
	}
	public void testInquiry() throws Exception{
		message = new Message(0,new Card(12),12, 12, 1,2,new Money(20));
		Assert.assertEquals("INQUIRY  CARD# 12 TRANS# 122 FROM  1 TO  2 $20.00", message.toString());
	}
	
	
	
}


