/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package firstproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;



/**
 *
 * @author ACER
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm,ss yyyy");
    
    
    ArrayDeque<String> patient = new ArrayDeque<>();
    ArrayDeque<String> report = new ArrayDeque<>();
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBtn = new javax.swing.JButton();
        nextPBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DisplayAPBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Reportbtn = new javax.swing.JButton();
        Clearallbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        Savetotxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddBtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        AddBtn.setText("Add Patient");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        nextPBtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        nextPBtn.setText("Proceed to next Patient");
        nextPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Petrov Sans Black Italic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital First come First Serve System");

        DisplayAPBtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        DisplayAPBtn.setText("Display All Patients");
        DisplayAPBtn.setActionCommand("Display all the patients");
        DisplayAPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAPBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Petrov Sans Black Italic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fair and efficient care, Real time Patient treatment");

        Reportbtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        Reportbtn.setText("Reports");
        Reportbtn.setActionCommand("Display all the patients");
        Reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportbtnActionPerformed(evt);
            }
        });

        Clearallbtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        Clearallbtn.setText("Clear All saved Data");
        Clearallbtn.setActionCommand("Display all the patients");
        Clearallbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearallbtnActionPerformed(evt);
            }
        });

        Exitbtn.setFont(new java.awt.Font("Petrov Sans Black", 0, 12)); // NOI18N
        Exitbtn.setText("Exit Program.");
        Exitbtn.setActionCommand("Display all the patients");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        Savetotxt.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Church ppt\\Save img\\Netbeans Icon\\pngwing.com (1).png")); // NOI18N
        Savetotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavetotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clearallbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DisplayAPBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nextPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Reportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Savetotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DisplayAPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Reportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Savetotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clearallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        AddBtn.getAccessibleContext().setAccessibleName("AddButton");
        nextPBtn.getAccessibleContext().setAccessibleName("RemovePatient");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
       
         LocalDateTime now = LocalDateTime.now();
        String time = now.format(formatter);
        
        String n = JOptionPane.showInputDialog("Enter the patient's name");
          if(n == null || n.isEmpty()){
            JOptionPane.showMessageDialog(null,"No Input! Procedure cancelled!");
            return;
        }
        for(String patientCheck: patient){
        if(patientCheck.contains(n) ){
            JOptionPane.showMessageDialog(null, "Patient Already in the List");
            return;
        }
        } 
        
      
        
        patient.add(n+", Time Arrival : "+time);
        JOptionPane.showMessageDialog(null, "Patient: " +n+ " has been added to the List! Time Arrived : "+time+" and under treatment!");
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void nextPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPBtnActionPerformed
        // TODO add your handling code here:
         LocalDateTime now = LocalDateTime.now();
        String time = now.format(formatter);
        
        if(patient.isEmpty()){
            JOptionPane.showMessageDialog(null, " No Patient is added to the list! ");
            return;
        } {
        String firstName = patient.peekFirst();
        int choice = JOptionPane.showConfirmDialog(
    null, 
    "Patient: " + firstName+ " is the current patient. Proceed to the next patient?", 
    "Patient Removal Confirmation", 
    JOptionPane.YES_NO_CANCEL_OPTION
);      
        if(choice == JOptionPane.YES_OPTION){
            String n = patient.poll();
            report.add(n+" Time of Removal: "+ time);
            JOptionPane.showMessageDialog(null,n+" is Remove!");
            if(patient.isEmpty()){
                JOptionPane.showMessageDialog(null, "The list is now empty and no patient pending!");
                return;
            }
            JOptionPane.showMessageDialog(null, patient.getFirst()+" is now the current patient!");
        } else if(choice == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, " Patient unsuccessfully remove to the list and currently treating");
        } else {
            JOptionPane.showMessageDialog(null, " Proceeding cancelled!");
        }
    } 
    }//GEN-LAST:event_nextPBtnActionPerformed

    private void DisplayAPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAPBtnActionPerformed
        // TODO add your handling code here:
       if (patient.isEmpty()) {
    JOptionPane.showMessageDialog(null, "The List is Empty");
} else {
    String formattedList = "";
    int count = 1;
    for (String p : patient) {
        formattedList += count + ". "+" Patient: " + p + "\n";
        count++;
    }
    JOptionPane.showMessageDialog(null, formattedList, "Patient List", JOptionPane.INFORMATION_MESSAGE);
}
            
        
    }//GEN-LAST:event_DisplayAPBtnActionPerformed

    private void ReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportbtnActionPerformed
        // TODO add your handling code here:
             if (report.isEmpty()) {
    JOptionPane.showMessageDialog(null, "The Report List is Empty!");
} else {
    String formattedList = "";
    int count = 1;
    for (String p : report) {
        formattedList += count + ". "+" Patient: " + p + "\n";
        count++;
    }
    JOptionPane.showMessageDialog(null, formattedList, "Report List", JOptionPane.INFORMATION_MESSAGE);
}
       
        
    }//GEN-LAST:event_ReportbtnActionPerformed

    private void ClearallbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearallbtnActionPerformed
        // TODO add your handling code here:
        if(patient.isEmpty() && report.isEmpty()){
        JOptionPane.showMessageDialog(null, "The Patient List is empty");
    } else {
            JOptionPane.showMessageDialog(null, "NOTE! Please save your Report Data before clearing all of your Data!");
            int c = JOptionPane.showConfirmDialog(null,"Clearing All Data?" , "Clearing All Data", JOptionPane.YES_NO_CANCEL_OPTION);
            if(c==JOptionPane.YES_OPTION){
        patient.clear();
        report.clear();
        JOptionPane.showMessageDialog(null," Data cleared Successfully! Patient & report List is empty!");
        }
            if(c==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null," All the data is Unsuccessfully reset!");
            }   
        }
    }//GEN-LAST:event_ClearallbtnActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        // TODO add your handling code here:
        int q =JOptionPane.showConfirmDialog(null,"Save your Data before exit", "Warning! Data may Lost Permanently!", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(q == JOptionPane.YES_OPTION){
             
             return;
       
        } else if(q == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Thank you for using the Program! :)");
             dispose();
        } else JOptionPane.showMessageDialog(null, "Exit Cancelled!");
        return;
        
        
        
       
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void SavetotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavetotxtActionPerformed
        // TODO add your handling code here:
        if(report.isEmpty()){
            JOptionPane.showMessageDialog(null, "The Report List is Empty!");
            return;
        }
          JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Reports Data");

       
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            
            File selectedFile = fileChooser.getSelectedFile();

            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                
                for (String item : report) {
                    writer.write(item);       
                    writer.newLine();         
                } 
                JOptionPane.showMessageDialog(null, "Reports saved successfully to " + selectedFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();         
            }
        } else {
            JOptionPane.showMessageDialog(null, "Save operation was canceled.");
        }
    }//GEN-LAST:event_SavetotxtActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton Clearallbtn;
    private javax.swing.JButton DisplayAPBtn;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton Reportbtn;
    private javax.swing.JButton Savetotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextPBtn;
    // End of variables declaration//GEN-END:variables
}
