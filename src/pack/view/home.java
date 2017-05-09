/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import pack.control.ControllerToko;
import pack.model.m_Toko;

/**
 *
 * @author Smktelkom
 */
public class home extends javax.swing.JFrame {
    ControllerToko cToko;
    List<m_Toko>listdata=new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        cToko = new ControllerToko (this);
        cToko.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Toko :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(22, 20, 100, 30);

        txtadmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtadmin.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.add(txtadmin);
        txtadmin.setBounds(110, 20, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("DATA BARANG TOKO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 40, 380, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 70);

        jPanel3.setBackground(new java.awt.Color(204, 0, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("Harga");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 180, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("Kode Barang");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(31, 19, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Nama Barang");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 60, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("Kategori Barang");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 100, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("Jenis packaging");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 140, 120, 20);
        jPanel3.add(txtharga);
        txtharga.setBounds(160, 180, 210, 30);
        jPanel3.add(txtkode);
        txtkode.setBounds(160, 20, 210, 30);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel3.add(txtnama);
        txtnama.setBounds(160, 60, 210, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pack", "biji" }));
        jPanel3.add(cbjenis);
        cbjenis.setBounds(160, 140, 210, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Alat Mandi", "Alat Tulis" }));
        cbKategoriBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategoriBrgActionPerformed(evt);
            }
        });
        jPanel3.add(cbKategoriBrg);
        cbKategoriBrg.setBounds(160, 100, 210, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 70, 530, 250);

        jPanel4.setBackground(new java.awt.Color(204, 0, 255));
        jPanel4.setLayout(null);

        Btn_Keluar.setText("EXIT");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Keluar);
        Btn_Keluar.setBounds(60, 170, 100, 30);

        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Simpan);
        Btn_Simpan.setBounds(60, 10, 100, 30);

        Btn_Ubah.setText("UBAH");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Ubah);
        Btn_Ubah.setBounds(60, 50, 100, 30);

        Btn_Bersih.setText("CLEAR");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Bersih);
        Btn_Bersih.setBounds(60, 90, 100, 30);

        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Hapus);
        Btn_Hapus.setBounds(60, 130, 100, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(570, 70, 210, 250);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Pencarian berdasarkan Kategori ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 340, 230, 20);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Makanan", "Alat tulis", "Alat mandi", "Minuman" }));
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(310, 340, 150, 30);

        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 340, 80, 30);

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));
        jPanel5.setLayout(null);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 510, 200);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(20, 390, 530, 230);

        jPanel6.setBackground(new java.awt.Color(204, 0, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(570, 390, 210, 230);

        setBounds(0, 0, 816, 658);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        cToko.SimpanData();
        cToko.isiTable();
    // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        cToko.Ubah();
        cToko.isiTable();
            // TODO add your handling code here:
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        
        cToko.Reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        cToko.Hapus();
        cToko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cToko.CariKategori();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = login.user;
        txtadmin.setText(user1);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void cbKategoriBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKategoriBrgActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
      int baris = Tabel1.getSelectedRow();
      cToko.isiField(baris);
       
    }//GEN-LAST:event_Tabel1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
public JTextField getTxtKode(){ 
        return txtkode;
    }
  
public JTextField getTxtNama(){

return txtnama;

}

public JTextField getTxtHarga(){

return txtharga;

}

public JComboBox getCbKategori(){

return cbKategoriBrg;

}

public JComboBox getCbJenis(){

return cbjenis;

}

public JComboBox getCbCariKategori(){

return CbCariKategori;

}

public JButton getButtonHapus(){

return Btn_Hapus;

}



public JButton getButtonBersih(){

return Btn_Bersih;

}

public JButton getButtonSimpan(){

return Btn_Simpan;

}

public JButton getButtonUbah(){

return Btn_Ubah;

}

public JButton getButtonKeluar(){

return Btn_Keluar;

}

public JTable getTableData(){

return Tabel1;

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}