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
    //end of class variables
}
