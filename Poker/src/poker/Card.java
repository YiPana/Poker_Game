/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;

/**
 *
 * @author jonnie
 */
public class Card implements GlobalVars {

    private final int value;
    private final int colour;
    private final String sValue;
    private final String sColour;
    Random generateCard;
    private int tmpIntValue, tmpIntColour;

    /**
     * Generate a new card taking into account the available the used cards.
     */
    public Card() {
        generateCard = new Random();
        //Check if the card already belongs to another player
        do {
            tmpIntValue = generateCard.nextInt(13);
            tmpIntColour = generateCard.nextInt(4) + 1;
            //If the generated card already exists print the message
            if ("1".equals(CARDS[tmpIntValue][tmpIntColour])) {
                System.out.println("The card " + HashMapsClass.TRAPOULA.get(tmpIntValue + 2) + " with colour " + HashMapsClass.COLOUR.get(tmpIntColour) + " is already in use");
            }
        } while ("1".equals(CARDS[tmpIntValue][tmpIntColour]));

        //Apply true value at the specific cell if the card is in use
        CARDS[tmpIntValue][tmpIntColour] = "1";

        //Apply real card value
        value = tmpIntValue + 2;
        colour = tmpIntColour;
        System.out.println(value + " or else " + HashMapsClass.TRAPOULA.get(value) + " and colour " + HashMapsClass.COLOUR.get(colour));

        sValue = HashMapsClass.TRAPOULA.get(value);
        sColour = HashMapsClass.COLOUR.get(colour);
    }

    /**
     * Get the name of the card
     *
     * @return
     */
    protected String getValue() {
        return sValue;
    }

    /**
     * Get the colour of the card
     *
     * @return
     */
    protected String getColour() {
        return sColour;
    }

}
