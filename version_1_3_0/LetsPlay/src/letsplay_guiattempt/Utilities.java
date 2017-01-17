/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsplay_guiattempt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTextArea;

/**
 *
 * @author Brooklyn
 */
public class Utilities {
    class CustomOutputStream extends OutputStream{
        private JTextArea textArea;
        
        public CustomOutputStream(JTextArea textArea){
            this.textArea = textArea;
        }
        
        @Override
        public void write(int b) throws IOException{
            //redirect data to the text area
            textArea.append(String.valueOf((char) b));
            //scrolls the text area to the end of data
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
    /*public class GameDoneEvent extends Event{
        //create an event that shows the PlayAgain panel
    }*/
    //create an action listener for GameDoneEvent
    static String getFirstName(){
        return firstName;
    }
    static Boolean login(){
        if(userNameIsValid && passwordIsValid){
            flag = true;
            System.out.println("Login successful.");
        }else{
            flag = false;
        }
        return flag;
    }
    
    static void verifyUserName(String userName){
        do{
            try(BufferedReader reader = Files.newBufferedReader(registry, Charset.defaultCharset());){
                String fullLine;
                String[] parts;
                do{
                    if((fullLine = reader.readLine()) != null){
                        parts = fullLine.split("\\W");
                        if((parts[2]).equals(userName)){
                            firstName = parts[0];
                            lastName = parts[1];
                            password = parts[3];
                            userNameIsValid = true;
                            flag = false;
                        }else{
                            userNameIsValid = false;
                        }
                    }
                }while(flag);
            }catch(IOException e){
                int result = showOptionDialog("Unable to read file. Do you want to try again?");
                if(result == 0){ // 0 = yes
                    flag = true;
                }
                else{
                    showErrorDialog("Fatal Error: Cannot access Registry.txt", e);
                }
            }
        }while(flag);
    }
    static Boolean findRegistry(){
        Path one = Paths.get("..//Registry.txt");
        Path two = Paths.get("Registry.txt");
        if(!Files.exists(one) && !Files.exists(two)){
            flag = false;
        } else if(Files.exists(one) && !Files.exists(two)){
            registry = one;
            flag = true;
        } else {
            registry = two;
            flag = true;
        }
        return flag;
    }
    static void verifyPassword(char[] letters){
        String userInput = "";
        for(char c : letters){
            userInput = userInput+c;
        }
        if(userInput.equals(password)){
            passwordIsValid = true;
        }else{
            passwordIsValid = false;
            System.out.println("Password: "+userInput+" is invalid.");
        }
        password = null;
    }
    static Path getStudentFile(){
        Path one = Paths.get("..\\Students");
        Path two = Paths.get("Students");
        String fileName = ""+lastName+"_"+firstName+".txt";
        Path studentFile = Paths.get("");
        if(!Files.isDirectory(one) && !Files.isDirectory(two)){
            int answer = showOptionDialog("Cannot find 'Student' folder. Create one in current directory?");
            if(answer == 0){
                do{
                    try{
                        Files.createDirectory(two);
                        studentFile = two;
                        flag = false;
                    }catch (IOException e){
                        answer = showOptionDialog("Failed to create directory. Try again?");
                        if(answer == 1){
                            showErrorDialog("Fatal Error: Cannot continue without 'Students' folder.", e);
                        } else {
                            flag = true;
                        }
                    }
                }while(flag);
            }
        } else if(Files.isDirectory(one) && !Files.isDirectory(two)){
            studentFile = one;
        } else {
            studentFile = two;
        }
        String pathName = ""+(studentFile.toString())+"\\"+fileName;
        studentFile = Paths.get(pathName);
        if(!Files.exists(studentFile)){
            do{
                try{
                    Files.createFile(studentFile);
                    flag = false;
                }catch(IOException e){
                    int response = showOptionDialog("Unable to create file. Try again?");
                        if (response == 1){// 1=no
                            showErrorDialog("Fatal error: Failed to create student file.", e);
                        }
                    flag = true;
                }
            }while(flag);
        }
        return studentFile;
    }
    public static int showOptionDialog(String message){
        int result = JOptionPane.showConfirmDialog(null, message, "ERROR", YES_NO_OPTION);
        return result; // 0 = yes, 1 = no
    }
    public static void showErrorDialog(String message){
        JOptionPane.showConfirmDialog(null, message, "ERROR", ERROR_MESSAGE);
        throw new RuntimeException();
    }
    public static void showErrorDialog(String message, Exception e){
        JOptionPane.showConfirmDialog(null, message, "ERROR", ERROR_MESSAGE);
        throw new RuntimeException(e);
    }
    //class variables
    private static Boolean flag;
    private static Path registry;
    private static Boolean userNameIsValid;
    private static Boolean passwordIsValid;
    private static String firstName;
    private static String lastName;
    private static String password;
}
