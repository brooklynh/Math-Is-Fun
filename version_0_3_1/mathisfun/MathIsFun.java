/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathisfun;
import java.util.Scanner;

/**
 *
 * @author Brooklyn
 */
public class MathIsFun {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//set up necessary variables
        Scanner getText = new Scanner(System.in);
        String mode = new String();
        String difficulty = new String();
//start to set up the game
        System.out.println("Welcome to Math Is Fun!");
        System.out.println("What would you like to work on?");
        System.out.println("Addition \tSubtraction \tMultiplication \tDivision");
//get the game mode from user
        mode = getText.nextLine();
        mode = mode.toUpperCase();
        while(!("ADDITION".equals(mode)) & !("SUBTRACTION".equals(mode)) & !("MULTIPLICATION".equals(mode)) & !("DIVISION".equals(mode))){
            System.out.println("Oops! Looks like you didn't enter a valid game mode! Please try again.");
            System.out.println("What would you like to work on?");
            System.out.println("Addition \tSubtraction \tMultiplication \tDivision");
            mode = getText.nextLine();
            mode = mode.toUpperCase();
        }
        System.out.println("Excellent! What difficulty would you like?");
//get the game difficulty from user
        System.out.println("Easy \tMedium \tHard");
        difficulty = getText.nextLine();
        difficulty = difficulty.toUpperCase();
        while(!("EASY".equals(difficulty)) & !("MEDIUM".equals(difficulty)) & !("HARD".equals(difficulty))){
            System.out.println("Oops! Looks like you didn't enter a valid difficulty! Please try again.");
            System.out.println("What difficulty would you like?");
            System.out.println("Easy \tMedium \tHard");
            difficulty = getText.nextLine();
            difficulty = difficulty.toUpperCase();
        }
        System.out.println("Starting a new " + difficulty + " game of " + mode);
 //begin the game
        LetsPlay.game(mode, difficulty);
    }
}
