/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsPlay;
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
    static String[] login() throws RuntimeException{
        String userName;
        String password;
        String firstName;
        flag = false;
        System.out.println("Please enter your username.");
        do{
            userName = LetsPlayGUI.getUserInput();
            Boolean isValid = verifyUserName(userName);
            if(isValid){
                System.out.println("Please enter your password.");
                Boolean valid = false;
                do{
                    password = LetsPlayGUI.getUserInput();
                    valid = verifyPassword(password);
                    if(valid == false){
                        System.out.println("Invalid password. Please try again.");
                    }
                }while(!valid);
            }else{
                System.out.println("Invalid username. Please try again.");
                flag = true;
            }
        }while(flag);
        firstName = studentInfo[0];
        System.out.println("Log in successful.\n");
        System.out.println("Welcome to Let's Play, "+firstName+"!\n");
        return studentInfo;
    }
    
    static Boolean verifyUserName(String userName){
        Boolean isValid = false;
        flag = false;
        Path registry = Paths.get("Registry.txt");
        registry = registry.toAbsolutePath();
        flag = Files.exists(registry);
        if (flag == false){
            showErrorDialog("Fatal Error: Registry.txt is missing.");
        }
        do{
            try(BufferedReader reader = Files.newBufferedReader(registry, Charset.defaultCharset());){
                String fullLine;
                String[] parts;
                while((fullLine = reader.readLine()) != null){
                    parts = fullLine.split("\\W");
                    if(parts[2].equals(userName)){
                        studentInfo = parts;
                        isValid = true;
                    }
                }
                flag = false;
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
        return isValid;
    }
    static Boolean verifyPassword(String password){
        Boolean isValid = false;
        String truePassword = studentInfo[3];
        if(truePassword.equals(password)){
            isValid = true;
        }
        return isValid;
    }
    static Path getStudentFile(String lastName, String firstName){
        Path studentFile = Paths.get("Students\\"+lastName+"_"+firstName+".txt");
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
    public static void showErrorDialog(String message) throws RuntimeException{
        JOptionPane.showConfirmDialog(null, message, "ERROR", ERROR_MESSAGE);
        throw new RuntimeException();
    }
    public static void showErrorDialog(String message, Exception e) throws RuntimeException{
        JOptionPane.showConfirmDialog(null, message, "ERROR", ERROR_MESSAGE);
        throw new RuntimeException(e);
    }
    //class variables
    private static String[] studentInfo = new String[4]; // first, last, user, pass
    private static Boolean flag;
}
