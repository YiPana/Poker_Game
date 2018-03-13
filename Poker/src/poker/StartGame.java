/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;

/**
 *
 * @author jonnie
 */
public class StartGame implements GlobalVars {

    public Card tableCard1, tableCard2, tableCard3, tableCard4, tableCard5;
    public int noOfPlayers;

    /**
     * Initializes a new game having as input the number of players.
     *
     * @param count
     */
    public StartGame(int count) {

        HashMapsClass hM = new HashMapsClass();
        noOfPlayers = count;

        for (int i = 0; i < CARDS.length; i++) {
            /* 
               Column 0 : Card value
               Column 1 : Clubs cards
               Column 2 : Diamonds cards
               Column 3 : Hearts cards
               Column 4 : Spades cards
             */
            //Cell -> Card : 0 -> 2 , 1 -> 3 , 2 -> 4 ... 12 -> 14
            CARDS[i][0] = hM.TRAPOULA.get(i + 2);
            CARDS[i][1] = CARDS[i][2] = CARDS[i][3] = CARDS[i][4] = "0";
//            System.out.println("card is " + CARDS[i][0]);
        }

        //Create player objects according to number of players in the game
        if (count >= 2) {
            Player Player1 = new Player("Player1", 1);
            Player Player2 = new Player("Player2", 2);
            PLAYERSLIST.add(Player1);
            PLAYERSLIST.add(Player2);
            if (count >= 3) {
                Player Player3 = new Player("Player3", 3);
                PLAYERSLIST.add(Player3);
                if (count >= 4) {
                    Player Player4 = new Player("Player4", 4);
                    PLAYERSLIST.add(Player4);
                    if (count >= 5) {
                        Player Player5 = new Player("Player5", 5);
                        PLAYERSLIST.add(Player5);
                        if (count > 6) {
                            Player Player6 = new Player("Player6", 6);
                            PLAYERSLIST.add(Player6);
                            if (count >= 7) {
                                Player Player7 = new Player("Player7", 7);
                                PLAYERSLIST.add(Player7);
                                if (count >= 8) {
                                    Player Player8 = new Player("Player8", 8);
                                    PLAYERSLIST.add(Player8);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    /**
     * Throw first three cards
     */
    public void Flop() {
        tableCard1 = new Card();
        tableCard2 = new Card();
        tableCard3 = new Card();
        System.out.println("\n----------------- FLOP -----------------");
        System.out.println("Card value " + tableCard1.getValue() + " ,colour " + tableCard1.getColour());
        System.out.println("Card value " + tableCard2.getValue() + " ,colour " + tableCard2.getColour());
        System.out.println("Card value " + tableCard3.getValue() + " ,colour " + tableCard3.getColour());
    }

    /**
     * Throw fourth card
     */
    public void Turn() {
        tableCard4 = new Card();
        System.out.println("\n----------------- TURN -----------------");
        System.out.println("Card value " + tableCard4.getValue() + " ,colour " + tableCard4.getColour());
    }

    /**
     * Throw fifth card
     */
    public void River() {
        tableCard4 = new Card();
        System.out.println("\n----------------- RIVER -----------------");
        System.out.println("Card value " + tableCard5.getValue() + " ,colour " + tableCard5.getColour());
    }

}
