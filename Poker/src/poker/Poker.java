/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jonnie
 */
public class Poker {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        //Get the number of players as input
        System.out.println("enter the number of players among 2 and 8");
        int noOfPlayers = 0;
        boolean b = false;
        Scanner keyboard;
        do {
            try {
                keyboard = new Scanner(System.in);
                noOfPlayers = keyboard.nextInt();
                if (noOfPlayers > 1 && noOfPlayers <= 8) {
                    b = true;
                } else {
                    System.out.println("Give a valid number of players!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Give an integer!");
            };
            //a = keyboard.hasNextInt();
            //System.out.println("a = " + a);
        } while (b == false);

        System.out.println(noOfPlayers + " players will take part in this Game");

        //Initialize game
        StartGame st = new StartGame(noOfPlayers);

    }

}
