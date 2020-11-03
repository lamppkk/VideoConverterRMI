/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainController;
import Model.Client;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu Minh Duc
 */
public class MainView extends javax.swing.JFrame implements Runnable {
    private MainController control;
    private JFileChooser chooseFile;
    private JFileChooser chooseFolder;
    private Client client;
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        control=new MainController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Video Converter");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select file", "Select link Youtube" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Start convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jButton2.setText("Select Folder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int choose = jComboBox1.getSelectedIndex();
//        System.out.println("Da chon " + choose);
        switch (choose) {
            case 0:
                chooseFile = new JFileChooser();
                chooseFile.setMultiSelectionEnabled(false);
                chooseFile.setDialogTitle("Choose file to convert");
                chooseFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooseFile.setSize(500, 500);
                chooseFile.showOpenDialog(new JFrame());
                control.ShowSelectedFile(chooseFile, jTextField1);
                break;
            case 1:

                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        File source=chooseFile.getSelectedFile();
        File target=chooseFolder.getSelectedFile();
        try {   
            System.out.println(source.getAbsolutePath());
//            String fileServer= client.convertStub.ConvertFromFile(source.getAbsolutePath());           
//            client.fileStub.SendFile(fileServer);
//            byte[] data=client.fileStub.DownloadFile(fileServer);
//            client.fileStub.SaveToFile(data, target.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        chooseFolder = new JFileChooser();
        chooseFolder.setMultiSelectionEnabled(false);
        chooseFolder.setDialogTitle("Choose folder to save");
        chooseFolder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooseFolder.setSize(500, 500);
        chooseFolder.showSaveDialog(new JFrame());
        control.ShowSelectedFile(chooseFolder, jTextField2);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    public JButton getjButton1() {
        return jButton1;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setControl(MainController control) {
        this.control = control;
    }

    public void setChooseFile(JFileChooser chooseFile) {
        this.chooseFile = chooseFile;
    }

    public void setChooseFolder(JFileChooser chooseFolder) {
        this.chooseFolder = chooseFolder;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        new MainView().setVisible(true);
    }
}
