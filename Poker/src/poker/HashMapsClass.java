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
public class HashMapsClass implements GlobalVars{
    /**
     * Initialize static tables
     */
    public HashMapsClass() {
        TRAPOULA.put(2, "2");
        TRAPOULA.put(3, "3");
        TRAPOULA.put(4, "4");
        TRAPOULA.put(5, "5");
        TRAPOULA.put(6, "6");
        TRAPOULA.put(7, "7");
        TRAPOULA.put(8, "8");
        TRAPOULA.put(9, "9");
        TRAPOULA.put(10, "10");
        TRAPOULA.put(11, "JACK");
        TRAPOULA.put(12, "QUEEN");
        TRAPOULA.put(13, "KING");
        TRAPOULA.put(14, "ACE");
        
        COLOUR.put(1, "Clubs");
        COLOUR.put(2, "Diamonds");
        COLOUR.put(3, "Hearts");
        COLOUR.put(4, "Spades");
    }

}
