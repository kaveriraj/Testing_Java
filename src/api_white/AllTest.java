package api_white;




import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite that runs all the extension tests
 */
public class AllTest  {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
        
        
        
    }

    public static Test suite() { // Collect tests manually because we have to test class collection code
        TestSuite suite = new TestSuite("Framework Tests");
        suite.addTestSuite(Balance_APITest.class);
        suite.addTestSuite(Deposit_APITest.class);
       suite.addTestSuite(Inquiry_APITest.class);
        suite.addTestSuite(MessageTest.class);
    suite.addTestSuite(Startup_APITest.class);
    suite.addTestSuite(PerformSession_APITest.class);
   suite.addTestSuite(Withdrawal_APITest.class);
   suite.addTestSuite(Transfer_APITest.class);
   suite.addTestSuite(Money_APITest.class);
        return suite;
    }
    }
