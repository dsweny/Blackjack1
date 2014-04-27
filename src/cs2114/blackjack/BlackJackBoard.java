package cs2114.blackjack;

import sofia.app.ShapeScreen;
import sofia.app.Screen;
import android.widget.TextView;
import sofia.graphics.RectangleShape;
import sofia.graphics.Color;

// -------------------------------------------------------------------------
/**
 * Blackjack board set up Implements the game on the screen Allows for button
 * widget interaction to control aspect of black jack such as hit, bet,
 * insurance, double down, split, and surrender.
 *
 * @author Duncan Sweny (dsweny)
 * @author Joe Buellesbach (joesb)
 * @author Ryan Whitcomb (rwhit94)
 * @version Apr 16, 2014 (2014.04.16)
 */

public class BlackJackBoard
    extends ShapeScreen
{
    private int buttonType;
    private int hit        = 1;
    private int bet        = 2;
    private int insurance  = 3;
    private int split      = 4;
    private int doubleDown = 5;
    private int surrender  = 6;


    // ~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Initialize the black jack board
     */
    public void initialize()
    {
        Blackjack board = new Blackjack(0, 0, getWidth(), getHeight());
        add(board);
    }


    // ----------------------------------------------------------
    /**
     * Method for when the hit button is clicked
     */
    public void hitClicked()
    {
        buttonType = hit;
    }


    // ----------------------------------------------------------
    /**
     * Method for when the bet button is clicked
     */
    public void betClicked()
    {
        buttonType = bet;
    }


    // ----------------------------------------------------------
    /**
     * Method for when the insurance button is clicked
     */
    public void insuranceClicked()
    {
        buttonType = insurance;
    }


    // ----------------------------------------------------------
    /**
     * Method for when the split button is clicked
     */
    public void splitClicked()
    {
        buttonType = split;
    }


    // ----------------------------------------------------------
    /**
     * Method for when the double down button is clicked
     */
    public void doubleDownClicked()
    {
        buttonType = doubleDown;
    }


    // ----------------------------------------------------------
    /**
     * Method for when the surrender button is clicked
     */
    public void surrender()
    {
        buttonType = surrender;
    }

}
