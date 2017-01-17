/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsPlay;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 *
 * @author Brooklyn
 */
public class LetsPlay{
    public static void selectGame(String firstName){
        Boolean flag = false;
        String answer;
        String game = "MATH";
        
        /*
        If more games are added to this program, add code to change the variable
        "game" to the name of the game the user wants to play. Add the string 
        name of the new game to the switch statment on line 25.
        */
        
        do{
            switch(game){
                case "MATH":
                    System.out.println("Staring game 'Math is Fun!'.\n");
                    mathisfun.MathIsFun.startGame(firstName);
                    //Math Is Fun adds game data to SCORES and GAMES
                default:
                    assert false;
            }
            System.out.println("Would you like to play a new game? \nYes \tNo");
            answer = getAnswer();
            if(answer.equals("YES")){
                System.out.println("Great! Starting new game.");
                flag = true;
            }else{
                System.out.println("Goodbye.");
                synchronized(LOCK){
                    try{
                        LOCK.wait(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                flag = false;
            }
        }while(flag);
    }
    private static String getAnswer(){
        String answer;
        Boolean flag = false;
        do{
            answer = LetsPlayGUI.getUserInput();
            answer = answer.toUpperCase();
            if(!answer.equals("YES")&&!answer.equals("NO")){
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                flag = true;
            }
        }while(flag);
        return answer;
    }
    public static ArrayList<BigDecimal> getScores(){
        return SCORES;
    }
    public static void addScore(BigDecimal percent){
        SCORES.add(percent);
    }
    public static ArrayList<String> getGames(){
        return GAMES;
    }
    public static void addGame(String game){
        GAMES.add(game);
    }
    
    //class variables
    private static final ArrayList<BigDecimal> SCORES = new ArrayList<>();
    private static final ArrayList<String> GAMES = new ArrayList<>();
    private static final String LOCK = "lock";
}
