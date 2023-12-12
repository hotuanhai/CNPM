/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.admin;

import controller.AdminListener;
import dao.NhanKhauDAO;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.NhanKhau;

/**
 *
 * @author Admin
 */
public class ChuyenDi extends JFrame{
    private JTextField id,ngaychuyen,address,note;
    private NhanKhau nk;
    public ChuyenDi(){
        setTitle("Chuyển đi");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        ActionListener ac = new AdminListener(this);
        
        id= new JTextField(20);
        ngaychuyen= new JTextField(20);
        address= new JTextField(20);
        note= new JTextField(20);
        
        JButton submit = new JButton("Nộp chuyển đi");
        setLayout(new GridLayout(5, 2));
        
        add(new JLabel("ID:"));
        add(id);
        
        add(new JLabel("Ngày chuyển:"));
        add(ngaychuyen);
        
        add(new JLabel("Nơi chuyển:"));
        add(address);
        
        add(new JLabel("Ghi chú:"));
        add(note);
        
        add(new JLabel());
        add(submit);
        submit.addActionListener(ac);
        setVisible(true);
    }
    
    public void saveToAttributes(){
        nk = new NhanKhau();
        
        try {
            int gtt = Integer.parseInt(id.getText());
            this.nk.setId(gtt);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        
        this.nk.setAddress(address.getText());
        this.nk.setNote(note.getText());
        
        String ngayChuyenText = ngaychuyen.getText();
        // Parse the text into a java.util.Date      
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(ngayChuyenText);
        } catch (ParseException ex) {
            Logger.getLogger(ChuyenDi.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        this.nk.setNgaychuyen(sqlDate);
        System.out.println(nk);
        NhanKhauDAO.getInstance().chuyen(nk);
    }
}
