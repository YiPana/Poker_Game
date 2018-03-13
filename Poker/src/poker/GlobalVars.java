/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jonnie
 */
public interface GlobalVars {
    
    /**
     * Static table containing the cards of the game. It is necessary 
     * to distinguish which cards are used by players or not
     */
    public static String[][] CARDS = new String[13][5];
    
    ArrayList<Player> PLAYERSLIST = new ArrayList<>();
    
    /**
     * Static table to match the integer value of a card with its name
     */
    HashMap<Integer, String> TRAPOULA = new HashMap<>();
    
    /**
     * Static table to match the colour id of a card with its colour name
     */
    HashMap<Integer, String> COLOUR = new HashMap<>();
    
}
