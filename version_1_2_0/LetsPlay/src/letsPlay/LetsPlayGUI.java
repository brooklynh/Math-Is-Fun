/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsPlay;

import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.swing.SwingWorker;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import mathisfun.MathIsFun;

/**
 *
 * @author Brooklyn
 */
public class LetsPlayGUI extends javax.swing.JFrame {

    /**
     * Creates new form LetsPlayGUI
     */
    public LetsPlayGUI() {
        super("Let's Play!");
        initComponents();
        setCardLayouts();
        showSplashPanel();
        (new CheckRegistry()).execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        letsPlayPanel = new javax.swing.JPanel();
        splash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        login = new javax.swing.JPanel();
        loginScrollPanel = new javax.swing.JScrollPane();
        loginOutputArea = new javax.swing.JTextArea();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userNameField = new javax.swing.JTextField();
        mathIsFun = new javax.swing.JPanel();
        mathIsFunMode = new javax.swing.JPanel();
        additionButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        mathIsFunDifficulty = new javax.swing.JPanel();
        easyButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        terminal = new javax.swing.JPanel();
        submitButton = new javax.swing.JToggleButton();
        terminalInputField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        terminalOutputField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        letsPlayPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splashImage.png"))); // NOI18N

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splashLayout = new javax.swing.GroupLayout(splash);
        splash.setLayout(splashLayout);
        splashLayout.setHorizontalGroup(
            splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(splashLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        splashLayout.setVerticalGroup(
            splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        letsPlayPanel.add(splash, "splash");

        loginOutputArea.setEditable(false);
        loginOutputArea.setColumns(20);
        loginOutputArea.setRows(5);
        loginScrollPanel.setViewportView(loginOutputArea);

        loginButton.setText("Next");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setText("jPasswordField1");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        userNameField.setText("username");
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFieldFocusGained(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(loginScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField)
                                    .addComponent(userNameField))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(loginScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        letsPlayPanel.add(login, "login");

        mainPanel.add(letsPlayPanel, "letsPlayPanel");

        mathIsFun.setLayout(new java.awt.CardLayout());

        additionButton.setText("ADDITION");
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        subtractionButton.setText("SUBTRACTION");
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("DIVISION");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setText("MULTIPLICATION");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mathIsFunModeLayout = new javax.swing.GroupLayout(mathIsFunMode);
        mathIsFunMode.setLayout(mathIsFunModeLayout);
        mathIsFunModeLayout.setHorizontalGroup(
            mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mathIsFunModeLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(additionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtractionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(divisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );
        mathIsFunModeLayout.setVerticalGroup(
            mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathIsFunModeLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(additionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(subtractionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(mathIsFunModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        mathIsFun.add(mathIsFunMode, "mode");

        easyButton.setText("EASY");
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        mediumButton.setText("MEDIUM");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        hardButton.setText("HARD");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mathIsFunDifficultyLayout = new javax.swing.GroupLayout(mathIsFunDifficulty);
        mathIsFunDifficulty.setLayout(mathIsFunDifficultyLayout);
        mathIsFunDifficultyLayout.setHorizontalGroup(
            mathIsFunDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathIsFunDifficultyLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(mathIsFunDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        mathIsFunDifficultyLayout.setVerticalGroup(
            mathIsFunDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathIsFunDifficultyLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        mathIsFun.add(mathIsFunDifficulty, "difficulty");

        mainPanel.add(mathIsFun, "mathIsFunPanel");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        terminalInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalInputFieldActionPerformed(evt);
            }
        });

        terminalOutputField.setEditable(false);
        terminalOutputField.setColumns(20);
        terminalOutputField.setRows(5);
        scrollPane.setViewportView(terminalOutputField);

        javax.swing.GroupLayout terminalLayout = new javax.swing.GroupLayout(terminal);
        terminal.setLayout(terminalLayout);
        terminalLayout.setHorizontalGroup(
            terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addComponent(terminalInputField))
                .addContainerGap())
            .addGroup(terminalLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        terminalLayout.setVerticalGroup(
            terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(terminalInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(terminal, "terminalPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        userInput = terminalInputField.getText();
        terminalInputField.setText("");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void terminalInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalInputFieldActionPerformed
        submitButtonActionPerformed(evt);
    }//GEN-LAST:event_terminalInputFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        synchronized(LOCK){
            do{
                try{
                    LOCK.wait(1000);
                }catch(InterruptedException e){
                    //do nothing
                }
            }while(flag);
        }
        if(registryAvailable == false){
            showMIFModePanel();
        }else {
            showLoginPanel();
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed
        showMIFDifficultyPanel();
        MathIsFun.setMode("ADDITION");
    }//GEN-LAST:event_additionButtonActionPerformed

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionButtonActionPerformed
        showMIFDifficultyPanel();
        MathIsFun.setMode("SUBTRACTION");
    }//GEN-LAST:event_subtractionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        showMIFDifficultyPanel();
        MathIsFun.setMode("MULTIPLICATION");
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        showMIFDifficultyPanel();
        MathIsFun.setMode("DIVISION");
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        showTerminalPanel();
        MathIsFun.setDifficulty("EASY");
        (new MathIsFunGame()).execute();
    }//GEN-LAST:event_easyButtonActionPerformed

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumButtonActionPerformed
        showTerminalPanel();
        MathIsFun.setDifficulty("MEDIUM");
        (new MathIsFunGame()).execute();
    }//GEN-LAST:event_mediumButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        showTerminalPanel();
        MathIsFun.setDifficulty("HARD");
        (new MathIsFunGame()).execute();
    }//GEN-LAST:event_hardButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        int key = evt.getKeyCode();
        if (key == java.awt.event.KeyEvent.VK_ENTER) {
           login();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void userNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusGained
        userNameField.selectAll();
    }//GEN-LAST:event_userNameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.selectAll();
    }//GEN-LAST:event_passwordFieldFocusGained
    private void login(){
        System.out.println("Verifying...");
        System.out.println(userNameField.getText());
        Utilities.verifyUserName(userNameField.getText());
        Utilities.verifyPassword(passwordField.getPassword());
        isValid = Utilities.login();
        if(isValid){
            firstName = Utilities.getFirstName();
            showMIFModePanel();
            setTerminalIO();
        }else{
            System.out.println("Incorrect username or password. Try again.");
            userNameField.setText("Username");
            passwordField.setText("password");
        }
    }
    private class CheckRegistry extends SwingWorker<Integer, String>{
        @Override
        protected Integer doInBackground(){
            flag = true;
            registryAvailable = Utilities.findRegistry();
            if(registryAvailable == false){
                int answer = Utilities.showOptionDialog("Error: Registry.txt is missing. Game information will not be saved. Continue?");
                if(answer == 1){
                    Utilities.showErrorDialog("Fatal Error: Registry.txt is missing.");
                }
            }
            setLoginIO();
            flag = false;
            return 1;
        }
    }
    private class MathIsFunGame extends SwingWorker<Integer, String>{
        @Override
        protected Integer doInBackground(){
            boolean playAgain = false;
            do{
                MathIsFun.startGame(firstName);
            }while(playAgain);
            dispose();
            saveGameData();
            return 1;
        }
    }
    
    private void setCardLayouts(){
        mainPanelLayoutManager = (CardLayout) mainPanel.getLayout();
        mathIsFunLayoutManager = (CardLayout) mathIsFun.getLayout();
        letsPlayLayoutManager = (CardLayout) letsPlayPanel.getLayout();
    }
    private void setTerminalIO(){
        printStream = new PrintStream(new Utilities().new CustomOutputStream(terminalOutputField));
        System.setOut(printStream);
        System.setErr(printStream);
    }
    private void setLoginIO(){
        printStream = new PrintStream(new Utilities().new CustomOutputStream(loginOutputArea));
        System.setOut(printStream);
        System.setErr(printStream);
        System.out.println("Please enter your username and password.");
    }
    private void saveGameData(){
        ArrayList<BigDecimal> scores = LetsPlay.getScores();
        ArrayList<String> games = LetsPlay.getGames();
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String today = dateFormat.format(date);
        today = String.format("%s%n", today);
        Path studentFile = Utilities.getStudentFile();
        try(BufferedWriter bw = Files.newBufferedWriter(studentFile, Charset.defaultCharset(), StandardOpenOption.WRITE, StandardOpenOption.APPEND)){
            bw.write(today);
            for(int i = 0; i<scores.size(); i++){
                String message = String.format("%s\t%s%%%n", games.get(i), scores.get(i));
                bw.write(message);
            }
        }catch(IOException e){
            Utilities.showErrorDialog("Fatal error: Unable to save student data to file.", e);
        }
    }
    public static String getUserInput(){
        String input;
        while(userInput == null){
            synchronized(LOCK){
                try{
                    LOCK.wait(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        input = userInput;
        userInput = null;
        return input;
    }
    private void showTerminalPanel(){
        mainPanelLayoutManager.show(mainPanel, "terminalPanel");
    }
    private void showLoginPanel(){
        mainPanelLayoutManager.show(mainPanel, "letsPlayPanel");
        letsPlayLayoutManager.show(letsPlayPanel, "login");
    }
    private void showSplashPanel(){
        mainPanelLayoutManager.show(mainPanel, "letsPlayPanel");
        letsPlayLayoutManager.show(letsPlayPanel, "splash");
    }
    private void showMIFModePanel(){
        mainPanelLayoutManager.show(mainPanel, "mathIsFunPanel");
        mathIsFunLayoutManager.show(mathIsFun, "mode");
    }
    private void showMIFDifficultyPanel(){
        mainPanelLayoutManager.show(mainPanel, "mathIsFunPanel");
        mathIsFunLayoutManager.show(mathIsFun, "difficulty");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LetsPlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetsPlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetsPlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetsPlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetsPlayGUI().setVisible(true);
            }
        });
        
    }
    
    //Class Variables
    private PrintStream printStream;
    private static String userInput;
    public static final String LOCK = "lock";
    private static String firstName;
    private Boolean registryAvailable;
    private Boolean isValid;
    private Boolean flag;
    private CardLayout mainPanelLayoutManager;
    private CardLayout mathIsFunLayoutManager;
    private CardLayout letsPlayLayoutManager;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton easyButton;
    private javax.swing.JButton hardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel letsPlayPanel;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextArea loginOutputArea;
    private javax.swing.JScrollPane loginScrollPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mathIsFun;
    private javax.swing.JPanel mathIsFunDifficulty;
    private javax.swing.JPanel mathIsFunMode;
    private javax.swing.JButton mediumButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel splash;
    private javax.swing.JButton startButton;
    private javax.swing.JToggleButton submitButton;
    private javax.swing.JButton subtractionButton;
    private javax.swing.JPanel terminal;
    private javax.swing.JTextField terminalInputField;
    private javax.swing.JTextArea terminalOutputField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
