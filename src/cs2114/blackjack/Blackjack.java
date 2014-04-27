package cs2114.blackjack;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * Blackjack class for creating a blackjack board object Sets up a board object
 * that is able to take the specified coordinates of its bounds as parameter
 * values.
 *
 * @author Duncan Sweny (dsweny)
 * @author Joe Buellesbach (joesb)
 * @author Ryan Whitcomb (rwhit94)
 * @version Apr 16, 2014 (2014.04.16)
 */
public class Blackjack
    extends RectangleShape
{

    // ----------------------------------------------------------
    /**
     * Create a new Blackjack object.
     *
     * @param left
     *            left boundary
     * @param top
     *            top boundary
     * @param right
     *            right boundary
     * @param bottom
     *            bottom boundary
     */
    public Blackjack(float left, float top, float right, float bottom)
    {
        super(left, top, right, bottom);
        setImage("blackjack");

    }

}
