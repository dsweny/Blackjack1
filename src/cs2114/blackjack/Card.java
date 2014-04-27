package cs2114.blackjack;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * Creates a new card object given parameters for suit and value Card class
 * Stores the necessary information for each card in a 52 card deck
 *
 * @author Duncan Sweny (dsweny)
 * @author Joe Buellesbach (joesb)
 * @author Ryan Whitcomb (rwhit94)
 * @version Apr 16, 2014 (2014.04.16)
 */

public class Card
    extends RectangleShape
{
    // ~ Fields ................................................................
    private int value;
    private int pointValue;
    private int suit;


    // ----------------------------------------------------------
    /**
     * Create a new Card object.
     */
    public Card()
    {

    }


    // ----------------------------------------------------------
    /**
     * Create a new Card object.
     *
     * @param n
     *            value of the card
     * @param s
     *            suit of the card
     */
    public Card(int n, int s)
    {

        value = n;
        suit = s;

        if (value <= 10)
        {
            pointValue = value;
        }
        else if (value > 10 && value < 14)
        {
            pointValue = 10;
        }
        else
        {
            pointValue = 11;
        }

    }


    // ----------------------------------------------------------
    /**
     * Sets the value to a card
     *
     * @param numval
     *            value to set to the card
     */
    public void setValue(int numval)
    {
        value = numval;
        if (value <= 10)
        {
            pointValue = value;
        }
        else if (value > 10 && value < 14)
        {
            pointValue = 10;
        }
        else
        {
            pointValue = 11;
        }

    }


    // ----------------------------------------------------------
    /**
     * Gets the value of a card
     *
     * @return value
     */
    public int getValue()
    {
        return value;

    }


    // ----------------------------------------------------------
    /**
     * Sets the suit to a card
     *
     * @param numSuit
     *            value to set to the card
     */
    public void setSuit(int numSuit)
    {
        suit = numSuit;

    }


    // ----------------------------------------------------------
    /**
     * Gets the suit of a card
     *
     * @return suit
     */
    public int getSuit()
    {
        return suit;

    }

}
