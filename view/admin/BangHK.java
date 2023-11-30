/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.admin;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SoHoKhau;

/**
 *
 * @author Admin
 */
public class BangHK extends JFrame{
    JTable jt;
    JScrollPane js;
    String[] col;
    public BangHK(ArrayList<SoHoKhau> shk){
        setTitle("Bảng thông tin");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        
        col = new String[]{"Mã hộ khẩu","Tên chủ hộ","Địa chỉ"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        jt = new JTable(tableModel);
        js = new JScrollPane(jt);
        
        //tableModel.addRow(col);
        for (int i = 0; i < shk.size(); i++){
            String ma_hk = shk.get(i).getMa_hk();
            String tenchuho = shk.get(i).getTenchuho();
            String diachi = shk.get(i).getDiachi();
            
             Object[] data ={ma_hk,tenchuho,diachi};
             tableModel.addRow(data);
        }
        
        this.add(js);
        setVisible(true);
    }
}
