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
public class StartGame implements GlobalVars {

    /**
     * Initializes a new game having as input the number of players.
     *
     * @param count
     */
    public StartGame(int count) {

        for (int i = 0; i < CARDS.length; i++) {
            /* 
               Column 0 : Card value
               Column 1 : Clubs cards
               Column 2 : Diamonds cards
               Column 3 : Hearts cards
               Column 4 : Spades cards
             */
            //Cell -> Card : 0 -> 2 , 1 -> 3 , 2 -> 4 ... 12 -> 14
            CARDS[i][0] = HashMapsClass.TRAPOULA.get(i + 2);
            CARDS[i][1] = CARDS[i][2] = CARDS[i][3] = CARDS[i][4] = "0";
            System.out.println("card is " + CARDS[i][0]);
        }

        //Create player objects according to number of players in the game
        if (count >= 2) {
            Player Player1 = new Player("Player1");
            Player Player2 = new Player("Player2");
            if (count >= 3) {
                Player Player3 = new Player("Player3");
                if (count >= 4) {
                    Player Player4 = new Player("Player4");
                    if (count >= 5) {
                        Player Player5 = new Player("Player5");
                        if (count > 6) {
                            Player Player6 = new Player("Player6");
                            if (count >= 7) {
                                Player Player7 = new Player("Player7");
                                if (count >= 8) {
                                    Player Player8 = new Player("Player8");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
