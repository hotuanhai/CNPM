/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.admin;

import controller.AdminListener;
import dao.NhanKhauDAO;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class KhaiTu extends JFrame{
    private JTextField id;
    public KhaiTu(){
        setTitle("Khai tử");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        ActionListener ac = new AdminListener(this);
        
        id= new JTextField(20);
        
        JButton submit = new JButton("Xác nhận khai tử");
        setLayout(new GridLayout(2, 2));
        
        add(new JLabel("ID:"));
        add(id);
        
        add(new JLabel());
        add(submit);
        submit.addActionListener(ac);
        setVisible(true);
    }
    
    public void saveToAttributes(){
        int t = 0;
        try {
             t = Integer.parseInt(id.getText());
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        System.out.println(t);
         NhanKhauDAO.getInstance().mat(t);
    }

    
}
