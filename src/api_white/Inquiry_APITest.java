package api_white;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class Inquiry_APITest extends TestCase {

	private Inquiry_API Inquiry_API;

	// Constructor

		 public Inquiry_APITest( String name ) {
		        super(name );
		    }
		//run before every test
			protected void setUp() {
			
				Inquiry_API = new Inquiry_API();
			} 

		public void testInquiry()
			{
				int actual = Inquiry_API.inquiry("4");
				int expected = 4;
				assertEquals(expected, actual);
				
			}
			public void testInquiryCancel()
			{
				int actual = Inquiry_API.inquiry(null);
				int expected = 6;
				assertEquals(expected, actual);
				
			}
			public void testInquireAccount()
			{
				int actual = Inquiry_API.inquireAccount("1");
				int expected = 4;
				assertEquals(expected, actual);
			}

}
