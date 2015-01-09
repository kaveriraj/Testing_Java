/*
 * ATM Example system - file Card.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */
 
package banking;

/** Representation for customer's ATM card
 */
public class Card
{
    /** Constructor
     *
     *  @param number the card number
     */
    public Card(int number)
    {
        this.number = number;
    }
    
    /** Accessor for number
     *
     *  @return the number of the card
     */
    public int getNumber()
    {
        return number;
    }
    
    /** Card number encoded on the card
     */
    private int number;
}
