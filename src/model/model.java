
package model;

import kamus.kamuss;
import kamu.kamu;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class model extends javax.swing.JFrame {
boolean cekUpdate = false;
    List<kamu> ls;
    kamu m;

    public model() {
        initComponents();
        try {
            LoadData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "program rusak gaes");
        }
    }
    void LoadData() {
        ls = new kamuss().getAll();
        String data[][] = new String[ls.size()][4];
        for (int i = 0; i < ls.size(); i++) {
            data[i][0] = ls.get(i).getindo();
            data[i][1] = ls.get(i).getinggris();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        option = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        indo = new javax.swing.JRadioButton();
        inggris = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        terjemah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add_indo = new javax.swing.JTextField();
        add_inggris = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("karen");

        option.add(indo);
        indo.setText("indonesia - inggris");
        indo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoActionPerformed(evt);
            }
        });

        option.add(inggris);
        inggris.setText("inggris-indonesia");

        jLabel2.setText("input");

        jLabel3.setText("output");

        terjemah.setText("terjemah");
        terjemah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terjemahActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        jLabel4.setText("tambah");

        jLabel5.setText("indonesia :");

        jLabel6.setText("inggris     :");

        add_indo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_indoActionPerformed(evt);
            }
        });

        add_inggris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_inggrisActionPerformed(evt);
            }
        });

        tambah.setText("tambah");
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inggris)
                            .addComponent(indo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(terjemah))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(add_indo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tambah))
                                    .addComponent(add_inggris))))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(indo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inggris)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(terjemah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(add_indo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(add_inggris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(tambah))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_indoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_indoActionPerformed
       add_indo.setText("");
    }//GEN-LAST:event_add_indoActionPerformed

    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
        m = new kamu();
        m.setindo(add_indo.getText());
        m.setinggris(add_inggris.getText());     
        ls.add(m);
        new kamuss().updatekm(ls);
        LoadData();
    }//GEN-LAST:event_tambahMouseClicked

    private void add_inggrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_inggrisActionPerformed
       add_inggris.setText("");
    }//GEN-LAST:event_add_inggrisActionPerformed

    private void terjemahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terjemahActionPerformed
        ls = new kamuss().getAll();
        String data[][] = new String[ls.size()][4];
        for (int i = 0; i < ls.size(); i++) {
            data[i][0] = ls.get(i).getindo();
            data[i][1] = ls.get(i).getinggris();
            if(indo.isSelected()){
                if(input.getText().equals(data[i][0])){
                    output.setText(data[i][1]);
                }
            }else{
                if(input.getText().equals(data[i][1])){
                    output.setText(data[i][0]);
                }
            }
            
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_terjemahActionPerformed

    private void indoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indoActionPerformed

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
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new model().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_indo;
    private javax.swing.JTextField add_inggris;
    private javax.swing.JRadioButton indo;
    private javax.swing.JRadioButton inggris;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup option;
    private javax.swing.JTextArea output;
    private javax.swing.JButton tambah;
    private javax.swing.JButton terjemah;
    // End of variables declaration//GEN-END:variables
}
