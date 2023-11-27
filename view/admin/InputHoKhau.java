package view.admin;

import controller.AdminListener;
import dao.HoKhauDAO;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.SoHoKhau;


public class InputHoKhau extends JFrame {
    private JTextField ma_hk, tenchuho,dchi;
    private SoHoKhau shk;
    
    public InputHoKhau(){
        setTitle("Thêm hộ khẩu");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        ActionListener ac = new AdminListener(this);
        
        ma_hk= new JTextField(20);
        tenchuho=new JTextField(20);
        dchi= new JTextField(20);
        
        JButton submit = new JButton("Thêm hộ khẩu");
        
        setLayout(new GridLayout(4, 2));
        
        add(new JLabel("Mã hộ khẩu:"));
        add(ma_hk);
        add(new JLabel("Tên chủ hộ:"));
        add(tenchuho);
        add(new JLabel("Địa chỉ:"));
        add(dchi);
        
        add(new JLabel());
        add(submit);
        submit.addActionListener(ac);
        setVisible(true);
    }
    
    
    public void saveToAttributes(){
        shk = new SoHoKhau();
        this.shk.setMa_hk(ma_hk.getText());
        this.shk.setDiachi(dchi.getText());
        this.shk.setTenchuho(tenchuho.getText());
        System.out.println(shk);
        HoKhauDAO.getInstance().insert(shk);
    }
}
