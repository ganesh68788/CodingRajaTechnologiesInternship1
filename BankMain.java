/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ganesh
 */
public class BankMain extends javax.swing.JFrame {

    /**
     * Creates new form BankMain
     */
    public BankMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("GANESH ONLINE BANK");

        jButton1.setText("Create Account");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setFont(new Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel1.setText("WELCOME TO GANESH ONLINE BANK!");

        jButton2.setText("Deposit");
        jButton2.setMaximumSize(new Dimension(107, 23));
        jButton2.setMinimumSize(new Dimension(107, 23));
        jButton2.setPreferredSize(new Dimension(107, 23));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Withdraw");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Check Balance");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton6.setText("About");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setText("EXIT");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jMenu1.setText("New");

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Account..");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");

        jMenuItem5.setText("Deposit Amount..");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Withdraw Amount..");
        jMenuItem6.addActionListener(this::jMenuItem6ActionPerformed);
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        jMenuItem7.setText("Check Account Balance..");
        jMenuItem7.addActionListener(this::jMenuItem7ActionPerformed);
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static Account acc;
    
    private void jMenuItem6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By ganeshganesh68788@gmail.com\n", "About", 1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By ganeshganesh68788@gmail.com\n", "About", 1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 4) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BankMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}