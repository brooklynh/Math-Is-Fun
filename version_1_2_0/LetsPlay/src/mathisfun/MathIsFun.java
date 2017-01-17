/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathisfun;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;
import letsPlay.LetsPlayGUI;

/**
 *
 * @author Brooklyn
 */
public class MathIsFun {
    public static Boolean startGame(String firstName){
        System.out.println("Welcome to 'Math is Fun!', "+firstName+"\n");
        System.out.println("Starting new "+difficulty+" game of "+mode+".\n");
        if(mode.equals("DIVISION")){
            setPrecision();
        }
        score = 0;
        setQuestionNumber();
        setOperator();

        for (int i = 0; i < questions; i++){
            BigDecimal answer;
            BigDecimal playerAnswer;
            
            answer = getAnswer();
            System.out.println("\nQuestion: "+(i+1)+"\n"+first+operator+second+"\n");
            playerAnswer = getPlayerAnswer();
            if(answer.equals(playerAnswer)){
                System.out.println("Correct! "+(questions-(i+1))+" left.\n");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is "+answer+".");
                System.out.println(""+(questions-(i+1))+" left.\n");
            }
        }
        System.out.println(getScoreMessage());
        String game = "MATH: "+mode+" ("+difficulty+")\tTotal questions: "+questions;
        letsPlay.LetsPlay.addGame(game);
        letsPlay.LetsPlay.addScore(percent);
        score = 0;
        System.out.println("Would you like to play again?\n'Yes'\t'No'");
        String answer = "";
        do{
            answer = LetsPlayGUI.getUserInput();
            answer = answer.toUpperCase();
        }while(!(answer.equals("NO")) && !(answer.equals("YES")));
        if(answer.equals("YES")){
            flag = true;
        }else{
            System.out.println("Good bye.");
            flag = false;
        }
        return flag;
    }
    
    private static void setQuestionNumber(){
        System.out.println("How many problems would you like?(ex. '10')\n");
        do{
            String userInput = LetsPlayGUI.getUserInput();
            try{
                questions = Integer.parseInt(userInput);
                flag = false;
            }catch(NumberFormatException e){
                System.out.println("Oops! You didn't enter a valid number. Please try again.");
                flag = true;
            }
        }while(flag);
    }
    private static void setOperator(){
        switch(mode){
                case "ADDITION":
                    operator = " + ";
                    break;
                case "SUBTRACTION":
                    operator = " - ";
                    break;
                case "MULTIPLICATION":
                    operator = " * ";
                    break;
                case "DIVISION":
                    operator = " / ";
                    break;
                default:
                    assert false;
        }
    }
    private static BigDecimal getAnswer(){
        BigDecimal answer = getBigDecimal(0);
        Random generator = new Random();
        
        switch(difficulty){
            case "EASY":
                first = generator.nextInt(20)+1;
                second = generator.nextInt(10)+1;
                break;
            case "MEDIUM":
                first = generator.nextInt(50)+51;
                second = generator.nextInt(50)+11;
                break;
            case "HARD":
                first = generator.nextInt(100)+51;
                second = generator.nextInt(100)+11;
                break;
            default:
                assert false;
        }
        
        BigDecimal firstBD = getBigDecimal(first);
        BigDecimal secondBD = getBigDecimal(second);
        
        switch(mode){
            case "ADDITION":
                answer = firstBD.add(secondBD, mc);
                break;
            case "SUBTRACTION":
                answer = firstBD.subtract(secondBD, mc);
                break;
            case "MULTIPLICATION":
                answer = firstBD.multiply(secondBD, mc);
                break;
            case "DIVISION":
                answer = firstBD.divide(secondBD, mc);
                break;
            default: 
                assert false;
        }
        return answer;
    }
    private static BigDecimal getPlayerAnswer(){
        BigDecimal playerAnswer = new BigDecimal(0);
        do{
            String userInput = LetsPlayGUI.getUserInput();
            try{
                double parsed = Double.parseDouble(userInput);
                playerAnswer = getBigDecimal(parsed);
                flag = false;
            }catch(NumberFormatException e){
                System.out.println("Invalid number, please try again.");
                flag = true;
            }
        }while(flag);
        return playerAnswer;
    }
    private static String getScoreMessage(){
        String message;
        BigDecimal tempScore = getBigDecimal(score);
        BigDecimal tempQuestions = getBigDecimal(questions);
        BigDecimal tempPercent = tempScore.divide(tempQuestions, mc);
        percent = tempPercent.multiply(new BigDecimal(100));
        if(percent.equals(100)){
            message = "Perfect Score! 100%";
        }else if((percent.compareTo(new BigDecimal(90))==1) | percent.equals(90)){
            message = "Great Job! "+percent+"%";
        }else if((percent.compareTo(new BigDecimal(75))==1) | percent.equals(75)){
            message = "Good Job! "+percent+"%";
        }else if((percent.compareTo(new BigDecimal(50))==1) | percent.equals(50)){
            message = "Remember to take your time: "+percent+"%";
        }else{
            message = "Try a lower difficulty or ask for help: "+percent+"%";
        }
        return message;
    }
    private static void setPrecision(){
        System.out.println("How many decimal places? (ex.'2')");
        do{
            int precision = 0;
            String userInput = LetsPlayGUI.getUserInput();
            try{
                precision = Integer.parseInt(userInput);
            }catch(NumberFormatException e){
                System.out.println("Invalid number. Please enter a positive whole number.");
            }
            if(precision < 1){
                System.out.println("Invalid number. Please enter a positive whole number.");
                flag = true;
            }else{
                mc = new MathContext(precision);
                flag = false;
            }
        }while(flag);
    }
    private static BigDecimal getBigDecimal(int num){
        return new BigDecimal(num, mc);
    }
    private static BigDecimal getBigDecimal(double num){
        return new BigDecimal(num, mc);
    }
    public static void setMode(String mode){
        MathIsFun.mode = mode;
    }
    public static void setDifficulty(String difficulty){
        MathIsFun.difficulty = difficulty;
    }
    
    // class variables, do not change!
    private static Boolean flag = true;
    private static String mode;
    private static String difficulty;
    private static String operator;
    private static int questions;
    private static int score;
    private static int first;
    private static int second;
    private static MathContext mc = new MathContext(0);
    private static BigDecimal percent;
    // end of class variables
}
