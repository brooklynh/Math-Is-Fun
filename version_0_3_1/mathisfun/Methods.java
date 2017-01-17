/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathisfun;

import static java.lang.Math.round;
import java.util.Random;

/**
 *
 * @author Brooklyn
 */
public class Methods {
//create variables for the answer methods
    private int one;
    private int two;
    private double oneDiv;
    private double twoDiv;
//create getters and setters for each of the above variables
    public int getOne(){
        return this.one;
    }
    public void setOne(int one){
        this.one = one;
    }
    public int getTwo(){
        return this.two;
    }
    public void setTwo(int two){
        this.two = two;
    }
    public double getOneDiv(){
        return this.oneDiv;
    }
    public void setOneDiv(double oneDiv){
        this.oneDiv = oneDiv;
    }
    public double getTwoDiv(){
        return this.twoDiv;
    }
    public void setTwoDiv(double twoDiv){
        this.twoDiv = twoDiv;
    }
// returns a message to the user depending on their score results
    public String scoreMessage(int score){
        String message = new String();
        switch(score){
            case 10: 
                message = "Perfect Score!";
                break;
            case 9:
                message = "Great job!";
                break;
            case 8:
            case 7: 
                message = "Good job!";
                break;
            case 6:
            case 5:
            case 4: 
                message = "Keep practicing!";
                break;
            case 3:
            case 2:
            case 1:
                message = "Remember to take your time!";
                break;
            case 0: 
                message = "Try an easier difficulty next time.";
                break;
        }
        return message;
    }
// returns a string to be used when presenting the problem to the user
    public String setOperator(String mode){
        switch(mode){
            case "ADDITION":
                mode = " + ";
                break;
            case "SUBTRACTION":
                mode = " - ";
                break;
            case "MULTIPLICATION":
                mode = " * ";
                break;
            case "DIVISION":
                mode = " / ";
                break;
        }
        return mode;
    }
// returns the correct answer of the math problem to the game
    public int getAddSubMultAnswer(String mode, String difficulty){
        int answer = 0;
        Random generator = new Random();
        if("EASY".equals(difficulty)){
            int first = (generator.nextInt(20) + 1);
            setOne(first);
            int second = (generator.nextInt(10) + 1);
            setTwo(second);
        }
        if("MEDIUM".equals(difficulty)){
            int first = (generator.nextInt(50) + 1);
            setOne(first);
            int second = (generator.nextInt(50) + 1);
            setTwo(second);
        }
        if("HARD".equals(difficulty)){
            int first = (generator.nextInt(100) + 1);
            setOne(first);
            int second = (generator.nextInt(100) + 1);
            setTwo(second);
        }
        switch(mode){
            case "ADDITION":
                answer = (one + two);
                break;
            case "SUBTRACTION":
                answer = (one - two);
                break;
            case "MULTIPLICATION":
                answer = (one * two);
                break;
            default: break;
        }
        return answer;
    }
// returns the correct answer of the math problem to the game (division only)
    public double getDivisionAnswer(String difficulty){
        double answer;
        Random generator = new Random();
        if("EASY".equals(difficulty)){
            int first = (generator.nextInt(21) + 20);
            setOne(first);
            int second = (generator.nextInt(20) + 1);
            setTwo(second);
        }
        if("MEDIUM".equals(difficulty)){
            int first = (generator.nextInt(51) + 50);
            setOne(first);
            int second = (generator.nextInt(50) + 1);
            setTwo(second);
        }
        if("HARD".equals(difficulty)){
            int first = (generator.nextInt(100) + 1);
            setOne(first);
            int second = (generator.nextInt(50) + 1);
            setTwo(second);
        }
        double temporary = one / two;
        temporary = (temporary * 100);
        temporary = round(temporary);
        temporary = (temporary / 100);
        answer = temporary;
        return answer;
    }
}
