/*
 * ATM Example system - file CustomerConsole.java   
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */
 
package atm.physical;

import banking.Money;
import banking.Status;

import simulation.Simulation;

/** Manager for the ATM's customer console.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device (actually two separate
 *  devices - the display and the keyboard.)
 */
 
public class CustomerConsole
{
    /** Constructor
     */
    public CustomerConsole()
    {
    }
    
    /** Display a message to the customer
     *
     *  @param message the message to display
     */
    public void display(String message)
    {
       // Simulation.getInstance().clearDisplay();
        //Simulation.getInstance().display(message);
    }
    
    /** Read a PIN entered by the customer (echoed as asterisks)
     *
     *  @param prompt the message to display prompting the customer to enter PIN
     *  @return the PIN that was entered
     *  @exception Cancelled if customer presses the CANCEL key before pressing ENTER
     */
    public static String input;
    

	public static void setInput(String input) {
		CustomerConsole.input = input;
	}

	public int readPIN(String prompt) throws Cancelled
    {
    	
      //  Simulation.getInstance().clearDisplay();
       // Simulation.getInstance().display(prompt);
        //Simulation.getInstance().display("");
        
       // String input = Simulation.getInstance().readInput(Simulation.PIN_MODE, 0);
        
      // Simulation.getInstance().clearDisplay();
        
        if (input == null)
            throw new Cancelled();
        else
            return Integer.parseInt(input);
    }
    
    /** Display a menu of options and return choice made by customer
     *
     *  @param prompt message to display before the list of options
     *  @param menu the options
     *  @return the number of the option chosen (0 .. # of options - 1)
     *  Note: the options are numbered 1 .. # of options when displayed for the
     *  customer - but the menu array indices and the final result returned are in
     *  the range 0 .. # of options - 1
     *
     *  @exception Cancelled if customer presses the CANCEL key before choosing option
     */
    public static String menu_input ;
    

	public static void setMenu_input(String menu_input) {
		CustomerConsole.menu_input = menu_input;
	}

	public synchronized int readMenuChoice(String prompt, String[] menu) throws Cancelled
    {
    	
       // Simulation.getInstance().clearDisplay();
        //Simulation.getInstance().display(prompt);
        /*for (int i = 0; i < menu.length; i ++)
            Simulation.getInstance().display((i+1) + ") " + menu[i]);*/

       // String input = 
           // Simulation.getInstance().readInput(Simulation.MENU_MODE, menu.length);
            
     // Simulation.getInstance().clearDisplay();
        
        if (menu_input == null)
            throw new Cancelled();
        else
            return Integer.parseInt(menu_input) - 1;
    }
	public static String withdrawal_menu_input ;
    
	

	public static void setWithdrawal_menu_input(String withdrawal_menu_input) {
		CustomerConsole.withdrawal_menu_input = withdrawal_menu_input;
	}

	public synchronized int readWithdrawalMenuChoice(String prompt, String[] menu) throws Cancelled
    {
    	
       // Simulation.getInstance().clearDisplay();
        //Simulation.getInstance().display(prompt);
        /*for (int i = 0; readWithdrawalMenuChoicei < menu.length; i ++)
            Simulation.getInstance().display((i+1) + ") " + menu[i]);*/

       // String input = 
           // Simulation.getInstance().readInput(Simulation.MENU_MODE, menu.length);
            
    //  Simulation.getInstance().clearDisplay();
        
        if (menu_input == null)
            throw new Cancelled();
        else
            return Integer.parseInt(menu_input) - 1;
    }
public static String deposit_menu_input ;
    
	



public static void setDeposit_menu_input(String deposit_menu_input) {
	CustomerConsole.deposit_menu_input = deposit_menu_input;
}

	public synchronized int readDepositMenuChoice(String prompt, String[] menu) throws Cancelled
    {
    	
       // Simulation.getInstance().clearDisplay();
        //Simulation.getInstance().display(prompt);
        /*for (int i = 0; i < menu.length; i ++)
            Simulation.getInstance().display((i+1) + ") " + menu[i]);*/

       // String input = 
           // Simulation.getInstance().readInput(Simulation.MENU_MODE, menu.length);
            
    //  Simulation.getInstance().clearDisplay();
        
        if (menu_input == null)
            throw new Cancelled();
        else
            return Integer.parseInt(menu_input) - 1;
    }
public static String withdrawal_amount_menu_input ;
    
	

	

public static void setWithdrawal_amount_menu_input(
		String withdrawal_amount_menu_input) {
	CustomerConsole.withdrawal_amount_menu_input = withdrawal_amount_menu_input;
}

	public synchronized int readWithdrawalAmountMenuChoice(String prompt, String[] menu) throws Cancelled
    {
    	
       // Simulation.getInstance().clearDisplay();
        //Simulation.getInstance().display(prompt);
        /*for (int i = 0; i < menu.length; i ++)
            Simulation.getInstance().display((i+1) + ") " + menu[i]);*/

       // String input = 
           // Simulation.getInstance().readInput(Simulation.MENU_MODE, menu.length);
            
     // Simulation.getInstance().clearDisplay();
        
        if (menu_input == null)
            throw new Cancelled();
        else
            return Integer.parseInt(menu_input) - 1;
    }
    
    /** Read a money amount entered by the customer
     *
     *  @param prompt the message to display prompting the customer to enter amount
     *  @return the amount entered by the customer
     *  @exception Cancelled if customer presses the CANCEL key before pressing ENTER
     */
    
    public static String read_input;
   

	public static void setRead_input(String read_input) {
		CustomerConsole.read_input = read_input;
	}

	public synchronized Money readAmount(String prompt) throws Cancelled
    {
        /*Simulation.getInstance().clearDisplay();
        Simulation.getInstance().display(prompt);
        Simulation.getInstance().display("");*/
        
       // String input = Simulation.getInstance().readInput(Simulation.AMOUNT_MODE, 0);
        
     //   Simulation.getInstance().clearDisplay();
        
        if (read_input == null)
            throw new Cancelled();
        else
        {
            int dollars = Integer.parseInt(read_input) / 100;
            int cents = Integer.parseInt(read_input) % 100;
            return new Money(dollars, cents);
        }
    }
    
    /** Exception thrown when the user presses the cancel key while the ATM is
     *  waiting for some action
     */
    public static class Cancelled extends Exception
    {
        /** Constructor
         */
        public Cancelled()
        {
            super("Cancelled by customer");
        }
    }
}

