
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


public class KhaiSinh extends JFrame{
     private JTextField ma_hk, quanhe, ngaySinh, ten, gioitinh,que, dantoc;
     private NhanKhau moisinh;
     public KhaiSinh(){
        setTitle("Khai Sinh");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        ActionListener ac = new AdminListener(this);
        
        ma_hk= new JTextField(20);
        quanhe=new JTextField(20);
        ngaySinh= new JTextField(20);
        ten=new JTextField(20);
        gioitinh=new JTextField(20);
        que=new JTextField(20);
        dantoc=new JTextField(20);
        
        JButton submit = new JButton("Nộp khai sinh");
        
        setLayout(new GridLayout(8, 2));
        
        add(new JLabel("Mã hộ khẩu:"));
        add(ma_hk);
        
         add(new JLabel("Quan hệ:"));
        add(quanhe);
        
        add(new JLabel("Ngày sinh:"));
        add(ngaySinh);
        
        add(new JLabel("Tên:"));
        add(ten);
        
        add(new JLabel("Quê :"));
        add(que);
        
        add(new JLabel("Dân tộc :"));
        add(dantoc);
        
        add(new JLabel("Giới tính :"));
        add(gioitinh);
        
        add(new JLabel());
        add(submit);
        submit.addActionListener(ac);
         setVisible(true);
         
     }
     
     public void saveToAttributes(){
         System.out.println("aj");
         moisinh = new NhanKhau();
         moisinh.setMa_hk(ma_hk.getText());
         moisinh.setDanToc(dantoc.getText());
         moisinh.setQuanHe(quanhe.getText());
         moisinh.setQueQuan(que.getText());
         moisinh.setTen(ten.getText());
         
         try {
            int gtt = Integer.parseInt(gioitinh.getText());
            this.moisinh.setGioiTinh(gtt);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
         
          String ngaySinhText = ngaySinh.getText();
        // Parse the text into a java.util.Date      
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(ngaySinhText);
        } catch (ParseException ex) {
            Logger.getLogger(KhaiSinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        this.moisinh.setNgaySinh(sqlDate);
        
        moisinh.setNoiTTTruoc("moi sinh");
         System.out.println(moisinh);
        NhanKhauDAO.getInstance().moisinh(moisinh);
     }
     
     
     
}
