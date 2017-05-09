/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pack.dao.daoToko;
import pack.dao.implementToko;
import pack.model.m_Toko;
import pack.view.home;
import pack.model.TableModelToko;

/**
 *
 * @author Smktelkom
 */
public class ControllerToko {
    home hm;
    implementToko impToko;
    List<m_Toko> lt;
    
    public ControllerToko(home hm){
    this.hm = hm;
    impToko = new daoToko();
    lt = impToko.getAll();
    }
    
    //mengkosongkan isian field

    public void Reset(){
    hm.getTxtKode().setText("");
    hm.getTxtNama().setText("");
    hm.getTxtHarga().setText("");
    hm.getCbKategori().setSelectedItem(null);
    hm.getCbJenis().setSelectedItem(null);
    }



//menghapus data yang dipilih

    public void Hapus(){
     int confirm = JOptionPane.showConfirmDialog(hm, "Anda yakin Menghapus Data!","",JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            if (hm.getTxtKode().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(hm, "Masukkan kode barang");
        } else {
            String kode = (hm.getTxtKode().getText());
            impToko.HapusData(kode);
            JOptionPane.showMessageDialog(hm, "Data berhasil dihapus");
        }
          
        }
          
    
}

//menyimpan data

    public void SimpanData(){
    m_Toko toko = new m_Toko();
    if (hm.getTxtKode().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(hm, "Data Belum Diisi");
    }else{
    toko.setkode(hm.getTxtKode().getText());
    toko.setnama(hm.getTxtNama().getText());
    toko.setharga(hm.getTxtHarga().getText());
    toko.setkategori(hm.getCbKategori().getSelectedItem().toString());
    toko.setjenis(hm.getCbJenis().getSelectedItem().toString());
    impToko.SimpanData(toko);

        }
}

//mengubah data

    public void Ubah(){
        m_Toko toko = new m_Toko();
        toko.setkode(hm.getTxtKode().getText());
        toko.setnama(hm.getTxtNama().getText());
        toko.setkategori(hm.getCbKategori().getSelectedItem().toString());
        toko.setjenis(hm.getCbJenis().getSelectedItem().toString());
        toko.setharga(hm.getTxtHarga().getText());
        impToko.UbahData(toko);

}

    public void isiTable() {
    lt =impToko.getAll();
    TableModelToko tmt = new TableModelToko(lt);
    hm.getTableData().setModel(tmt);
    }
    
    public void isiField(int row){
    hm.getTxtKode().setText(lt.get(row).getkode().toString());
    hm.getTxtNama().setText(lt.get(row).getnama().toString());
    hm.getCbKategori().setSelectedItem(lt.get(row).getkategori().toString());
    hm.getCbJenis().setSelectedItem(lt.get(row).getjenis().toString());
    hm.getTxtHarga().setText(lt.get(row).getharga().toString());
}

    public void CariKategori(){
    if
    (!hm.getCbCariKategori().getSelectedItem().toString().isEmpty()){
    impToko.getCariKategori((String)hm.getCbCariKategori().getSelectedItem());
    isiTableCariKategori();
     if (hm.getCbCariKategori().getSelectedIndex()==0) {
            isiTable();
        }
    }else{
    JOptionPane.showMessageDialog(hm, "Silahkan PilihKategori");

}

}

    private void isiTableCariKategori() {
    String item = hm.getCbCariKategori().getSelectedItem().toString();
    lt =impToko.getCariKategori(item);
    TableModelToko tmt = new TableModelToko(lt);
    hm.getTableData().setModel(tmt);

    }
}
