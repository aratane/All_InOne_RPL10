/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.text.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ihsan
 */
public class fHitung extends javax.swing.JFrame {

    /**
     * Creates new form fHitung
     */
    public fHitung() {
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

        txtNamaBarang = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();
        txtQTY = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtNama_Barang = new javax.swing.JTextField();
        txtHarga_Barang = new javax.swing.JTextField();
        txtQTY_Barang = new javax.swing.JTextField();
        txtTotal_Barang = new javax.swing.JTextField();
        btnBeli = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Hitung");

        txtNamaBarang.setText("Nama Barang");

        txtHarga.setText("Harga");

        txtQTY.setText("QTY");

        txtTotal.setText("Total");

        lblTotal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL :");

        txtNama_Barang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNama_Barang.setText("Tas Sekolah Siswa");

        txtHarga_Barang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHarga_Barang.setText(" 75.000");

        txtQTY_Barang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTY_Barang.setText(" 8");

        txtTotal_Barang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal_Barang.setText("100");

        btnBeli.setMnemonic('H');
        btnBeli.setText("Beli");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        btnKeluar.setMnemonic('K');
        btnKeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaBarang)
                            .addComponent(txtHarga)
                            .addComponent(txtQTY)
                            .addComponent(txtTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama_Barang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtHarga_Barang)
                            .addComponent(txtQTY_Barang)
                            .addComponent(txtTotal_Barang)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnBeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnKeluar)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBarang)
                    .addComponent(txtNama_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga)
                    .addComponent(txtHarga_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQTY)
                    .addComponent(txtQTY_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal)
                    .addComponent(txtTotal_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBeli)
                    .addComponent(btnKeluar))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
        "Terima Kasih Sudah Membeli "+textNamaBarang.getText());
        System.exit(0);
        float jumlah = Float.parseFloat(txtHarga.getText())*
        Float.parseFloat(txtQTY.getText());
        txtTotal.setText(Float.toString(jumlah));
        DecimalFormat angka = new DecimalFormat("###,###");
        lblTotal.setText("Total : Rp."+angka.format(jumlah));
    }//GEN-LAST:event_btnBeliActionPerformed

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
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fHitung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel txtHarga;
    private javax.swing.JTextField txtHarga_Barang;
    private javax.swing.JLabel txtNamaBarang;
    private javax.swing.JTextField txtNama_Barang;
    private javax.swing.JLabel txtQTY;
    private javax.swing.JTextField txtQTY_Barang;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtTotal_Barang;
    // End of variables declaration//GEN-END:variables
}