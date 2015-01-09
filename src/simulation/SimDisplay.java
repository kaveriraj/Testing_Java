/*
 * ATM Example system - file SimDisplay.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */
 
package simulation;

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

/** Simulate the display portion of the customer console
 */
class SimDisplay extends Panel
{
    /** Constructor
     */
    SimDisplay()
    {
      /*  setLayout(new GridLayout(ATMPanel.DISPLAYABLE_LINES, 1));
        setBackground(new Color(0, 96, 0));  // Dark green
        setForeground(Color.white);
        
        Font lineFont = new Font("Monospaced", Font.PLAIN, 14);
        displayLine = new Label[ATMPanel.DISPLAYABLE_LINES];
        for (int i = 0; i < ATMPanel.DISPLAYABLE_LINES; i ++)
        {
            displayLine[i] = new Label(ATMPanel.BLANK_DISPLAY_LINE);
            displayLine[i].setFont(lineFont);
            add(displayLine[i]);
        }
        currentDisplayLine = 0;*/
        
    }
    
    /** Clear the display
     */
    void clearDisplay()
    { 
        for (int i = 0; i < displayLine.length; i ++)
            displayLine[i].setText("");
        currentDisplayLine = 0;
    }
      
    /** Add text to the display - may contain one or more lines delimited by \n
     *
     *  @param text the text to display
     */
    /*void display(String text)
    { 
        StringTokenizer tokenizer = new StringTokenizer(text, "\n", false);
        while (tokenizer.hasMoreTokens())
        { 
            try
            { 
                displayLine[currentDisplayLine ++].setText(tokenizer.nextToken()); 
            }
            catch (Exception e)
            { }
        }
    }
    
    /** Set echoed input on the display
     *
     *  @param echo the line to be echoed - always the entire line
     */
   /* void setEcho(String echo)
    {
        displayLine[currentDisplayLine].setText(
            ATMPanel.BLANK_DISPLAY_LINE.substring(0, 
                ATMPanel.BLANK_DISPLAY_LINE.length() / 2 - echo.length()) + echo);
    }
    
    /** Override the getInsets() method to provide additional spacing all
     *  around
     */
   /* public Insets getInsets()
    {
        Insets insets = super.getInsets();
        insets.top += 5;
        insets.bottom += 5;
        insets.left += 10;
        insets.right += 10;
        return insets;
    }*/

    /** Individual lines comprising the display
     */
    private Label [] displayLine;
    
    /** Number of the current line to write to
     */
    private int currentDisplayLine;
}                               
    
    

