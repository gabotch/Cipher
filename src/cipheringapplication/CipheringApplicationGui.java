/*
 * Ciphering Application 
 * An application that offers encryption and decryption of a user provided message
 * Gabrielle Otchet 
 * March 27, 2023
 * Last updated: April 03, 2023
 */
package cipheringapplication;
import java.io.*;
public class CipheringApplicationGui extends javax.swing.JFrame {

    public CipheringApplicationGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        txtShift = new javax.swing.JTextField();
        lblDisplay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caeser's Cipher Application");
        setName(""); // NOI18N

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caeser's Cipher");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Enter a message to encrypt or decrypt:");

        jLabel3.setText("Enter shift amount:");

        jLabel4.setText("If you would like to read from a file, please enter the file's name:");

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel6.setText("Click if you would like to print your message to a file:");

        jLabel5.setText("Note: Your message will be printed to a .txt file named CipherMessage");

        jLabel7.setText("Your Message:");

        jLabel8.setText("Note: A defult shift of 3 will occur if no amount is entered");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShift, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnDecrypt)
                                .addGap(39, 39, 39)
                                .addComponent(btnEncrypt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnter)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPrint)))
                                        .addGap(227, 227, 227))
                                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypt)
                    .addComponent(btnEncrypt))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisplay)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnPrint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)))
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        String message;//message inputted by user
        int shift;//the shift number the user would like to use
        char letter;//letter at the inex of the message
        int ascii;//ascii number for the letter
        String output = "";//the decrypted/encrypted message
        
        //gets message from user and sets it to lowercase
        message = txtInput.getText();
        message = message.toLowerCase();
        
        if (txtShift.getText().equals("")){
            shift = 3;//assigns a default shift of 3
        } else{
            shift = Integer.parseInt(txtShift.getText());//assigns the prefered shift of the user
        }
        
        for (int i=0; i<message.length(); i++){
            //converts the letters in the message to ascii characters
            if (message.charAt(i)!=' '){
                letter = message.charAt(i);
                ascii = (int) letter; 
                ascii = ascii - shift;//shifts the ascii character x positions to the left
                 if (ascii < 97){
                    ascii = ascii+26;
                    }
                letter = (char) ascii;//converts the ascii character to a letter
                output = output + letter;//builds the output message

            } else {
                output = output + " ";//adds any spaces
            }
        }
        lblDisplay.setText(output);//sets the encrypted or decypted message to the screen
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        String message;//message inputted by user
        int shift;//the shift number the user would like to use
        char letter;//letter at the inex of the message
        int ascii;//ascii number for the letter
        String output = "";//the decrypted/encrypted message

        //gets message from user and sets it to lowercase
        message = txtInput.getText();
        message = message.toLowerCase();
      
       if (txtShift.getText().equals("")){
            shift = 3;//assigns a default shift of 3
        } else{
            shift = Integer.parseInt(txtShift.getText());//assigns the prefered shift of the user
        }
        

        for (int i = 0; i < message.length(); i++) {
            //converts the letters in the message to ascii characters
            if (message.charAt(i) != ' ') {
                letter = message.charAt(i);
                ascii = (int) letter;
                ascii = ascii + shift;//shifts the ascii character x positions to the right
                if (ascii > 122) {
                    ascii = ascii - 26;
                }
                letter = (char)ascii;//converts the ascii character to a letter
                output = output + letter;//builds the output message
                    
                
            } else {
                output = output + " ";//adds any spaces
            }
        }
        lblDisplay.setText(output);//sets the encrypted or decypted message to the screen
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //Clears the text fields and relocates the curser
        txtInput.setText("");
        txtShift.setText("");
        lblDisplay.setText("");
        txtFileName.setText ("");
        txtFileName.grabFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);//Exits the program
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       String fileName;//stores the file name
       fileName = txtFileName.getText();//gets the file name from the user
       String line = ""; //line from the file that is being read
       
       //reads from the user's file and stores the message
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader (fr);
    
            line = br.readLine();
            br.close();
            } 
            catch(IOException e){
                System.out.println(e);
            }
        txtInput.setText(line);//sets the message to the input text area
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        //Writes the encrypted/decrypted message to a new file
        try{
            FileWriter fw = new FileWriter ("CipherMessage.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(lblDisplay.getText());
            pw.close();
        } 
           catch(IOException e){
    }
    }//GEN-LAST:event_btnPrintActionPerformed
        
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CipheringApplicationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CipheringApplicationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CipheringApplicationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CipheringApplicationGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CipheringApplicationGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtShift;
    // End of variables declaration//GEN-END:variables
}
