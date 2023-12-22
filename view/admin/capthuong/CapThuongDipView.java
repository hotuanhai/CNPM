/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.admin.capthuong;

import controller.CapThuongListener;
import dao.NhanKhauDAO;
import dao.TenCapThuongDipDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.CapThuongDip;
import model.NhanKhau;

/**
 *
 * @author Admin
 */
public class CapThuongDipView extends JFrame{
    private JTextField field_mahk;
     private JTextField tenma_thuong,tendip,sotien,tenqua;
     private JLabel jl_soqua,jl_sotien;
    JTable jt;
    JScrollPane js;
    String[] col;
    DefaultTableModel tableModel;
     public CapThuongDipView(){
        setTitle("Cấp thưởng theo dịp");
        setSize(800, 600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener ac = new CapThuongListener(this);
        field_mahk = new JTextField(20);
        tenqua = new JTextField(20);
        tenma_thuong = new JTextField(20);
        tendip = new JTextField(20);
        sotien = new JTextField(20);
        
        jl_soqua = new JLabel();
        jl_sotien = new JLabel();
        
        JButton btn_themthuong = new JButton("Thêm phần thưởng");
        btn_themthuong.addActionListener(ac);
        JButton btn_timquatheoho = new JButton("Tìm theo hộ");
        btn_timquatheoho.addActionListener(ac);
        JButton btn_xemTenQua = new JButton("Xem phần thưởng");
        btn_xemTenQua.addActionListener(ac);
        
        this.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(7, 5));
        
        inputPanel.add(new JLabel("Thêm phần thưởng:"));  
        inputPanel.add(new JLabel());
        
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel("Tìm kiếm:"));  
        inputPanel.add(new JLabel());
        
        inputPanel.add(new JLabel("Mã thưởng:"));          
        inputPanel.add(tenma_thuong);
        
        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel("Mã hộ khẩu"));
        inputPanel.add(field_mahk);         
        
        inputPanel.add(new JLabel("Dịp:"));          
        inputPanel.add(tendip);
        
        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel());
        inputPanel.add(btn_timquatheoho);  
     
        inputPanel.add(new JLabel("Số tiền:"));          
        inputPanel.add(sotien);

        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel()); 
        
        inputPanel.add(new JLabel("Tên quà:"));
        inputPanel.add(tenqua);
        
        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel()); 
        
        inputPanel.add(btn_xemTenQua);
        inputPanel.add(btn_themthuong);
        
        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel()); 
        
        inputPanel.add(jl_soqua); 
        inputPanel.add(jl_sotien);
        
        inputPanel.add(new JLabel()); 
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());
        
        col = new String[]{"ID", "Tên", "Mã hộ khẩu","Mã thưởng"};
        tableModel = new DefaultTableModel(col, 0);
        jt = new JTable(tableModel);
        js = new JScrollPane(jt);
        phatPT();
        
        this.add(js, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.NORTH); 
         setVisible(true);
     }
     
    public void themPT(){
        CapThuongDip ctd = new CapThuongDip();
        ctd.setMa_thuong(tenma_thuong.getText());
        ctd.setDip(tendip.getText());
        ctd.setTen_qua(tenqua.getText());
        try {
            int tien = Integer.parseInt(sotien.getText());
            ctd.setSotien(tien);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        TenCapThuongDipDAO.getInstance().insert(ctd);
        tableModel.setRowCount(0);
        phatPT();
    }
    
    public void phatPT(){
       tableModel.setRowCount(0); // Clear existing data
        ArrayList<NhanKhau> nk = NhanKhauDAO.getInstance().selectByage018();
        ArrayList<String> ten_ma = TenCapThuongDipDAO.getInstance().selectTenCT();
        for(NhanKhau i: nk){
            for(String j : ten_ma){
                String ma_ct = j;
                String mahk = i.getMa_hk();
                int id = i.getId();
                String ten = i.getTen();
                Object[] data = {id,ten, mahk, ma_ct};
                tableModel.addRow(data);
            }
        }
        soQuaTien(jt.getRowCount());
    }
    
    public void xemPT(){
         //ArrayList<CapThuongDip> kq = TenCapThuongDipDAO.getInstance().selectAll();
         new BangCTDip();
    }
    
    public void timTheoHo(){
        tableModel.setRowCount(0); // Clear existing data
        ArrayList<NhanKhau> nk = NhanKhauDAO.getInstance().selectByage018();
        ArrayList<String> ten_ma = TenCapThuongDipDAO.getInstance().selectTenCT();
        for(NhanKhau i: nk){
            for(String j : ten_ma){
                String mahk = i.getMa_hk();
                if(mahk.equals(field_mahk.getText())){
                    String ma_ct = j;
                    int id = i.getId();
                    String ten = i.getTen();
                    Object[] data = {id,ten, mahk, ma_ct};
                    tableModel.addRow(data);
                }
            }
        }
        soQuaTien(jt.getRowCount());
    }
    
    public void soQuaTien(int tongsoqua){
        jl_soqua.setText("Tổng số quà: "+ tongsoqua);
        int sotienqua = TenCapThuongDipDAO.getInstance().tiensoqua();
        int soqua = TenCapThuongDipDAO.getInstance().soqua();
        int songuoi = tongsoqua / soqua;
        int tien = sotienqua * songuoi;
        jl_sotien.setText("Tổng số tiền: "+ tien);
    }
}
