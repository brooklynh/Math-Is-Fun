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
public class LetsPlay {
    public static void game(String mode, String difficulty){
//create an instance of the Methods class to access its methods
        Methods obj = new Methods();
//setting up the necessary variables        
        int score = 0;
        Scanner playerInput = new Scanner(System.in);
        int playerAnswer;
        double divPlayerAnswer;
        String myOperator = obj.setOperator(mode);
//starting the game
        System.out.println("Here we go!");
        for(int i = 0; i<10; i++){
            int answer;
            double divAnswer;
//calculate the answer depending on the game's mode and difficulty
            if ("DIVISION".equals(mode)){
                divAnswer = obj.getDivisionAnswer(difficulty);
                System.out.println("What is " + obj.getOne() + myOperator + obj.getTwo() + "?");
                System.out.println("Round to the nearest hundredth (2 decimals)");
                divPlayerAnswer = playerInput.nextDouble();
                if(divPlayerAnswer == divAnswer){
                    System.out.println("Correct!");
                    score++;
                }
                else {
                    System.out.println("Sorry! The answer is " + divAnswer);
                }
            }
            else { //used for Addition, Subtraction, and Multiplication
                answer = obj.getAddSubMultAnswer(mode, difficulty);
                System.out.println("What is " + obj.getOne() + myOperator + obj.getTwo() + "?");
                playerAnswer = playerInput.nextInt();
                if(playerAnswer == answer){ 
                    System.out.println("Correct!");
                    score++;
                }
                else {
                    System.out.println("Sorry! The answer is " + answer);
                }
            }
            
        }
        String message = obj.scoreMessage(score);
        System.out.println("Your score is: " + score + ". " + message);
    }
}
