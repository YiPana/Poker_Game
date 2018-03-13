/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author jonnie
 */
public class Player implements GlobalVars {

    public Card card1, card2;
    public String playerName;
    public double coins;
    private int id;
    private boolean bActive;

    /**
     * Create a new player having as input his default name
     *
     * @param name
     */
    public Player(String name, int id) {
        this.id = id;
        bActive = true;
        playerName = name;
        coins = 1000;
        card1 = new Card();
        card2 = new Card();
        System.out.println("------------- " + playerName + "'s cards -------------");
        System.out.println("Card value " + card1.getValue() + " ,colour " + card1.getColour());
        System.out.println("Card value " + card2.getValue() + " ,colour " + card2.getColour());
    }

    /**
     * Set a name for the player
     *
     * @param name
     */
    public void setPlayerName(String name) {
        playerName = name;
    }

    public int getPlayerID() {
        return id;
    }
    
}
