
package view.admin;

import controller.AdminListener;
import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.SoHoKhau;


public class TachHoKhau extends JFrame{
    private JTextField id,ma_hkcu,ma_hkmoi,tenchuhomoi,diachimoi;
    private SoHoKhau hkmoi;
     public TachHoKhau(){
        setTitle("Tách hộ khẩu");
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        ActionListener ac = new AdminListener(this);
        
        id= new JTextField(20);
        ma_hkcu= new JTextField(20);
        ma_hkmoi= new JTextField(20);
        tenchuhomoi= new JTextField(20);
        diachimoi= new JTextField(20);
        JButton submit = new JButton("Nộp tách hộ khẩu");
        submit.addActionListener(ac);
        
        setLayout(new GridLayout(6, 2));
        
        add(new JLabel("Mã hộ khẩu cũ:"));
        add(ma_hkcu);
        
        add(new JLabel("ID nhân khẩu tách ra:" + '\n' + "(vd: 1,2,4)"));
        add(id);
        
        add(new JLabel("Mã hộ khẩu mới"));
        add(ma_hkmoi);
        
        add(new JLabel("Tên chủ hộ mới"));
        add(tenchuhomoi);
        
        add(new JLabel("Địa chỉ mới"));
        add(diachimoi);
        
        add(new JLabel());
        add(submit);
         setVisible(true);
     }
     public void saveToAttributes(){
         //tao hk moi
        hkmoi= new SoHoKhau();
        this.hkmoi.setDiachi(diachimoi.getText());
        this.hkmoi.setMa_hk(ma_hkmoi.getText());
        this.hkmoi.setTenchuho(tenchuhomoi.getText());
         
        //chon nhan khau
        ArrayList<Integer> arr= new ArrayList<Integer>();
        Scanner input = new Scanner(id.getText());
        input.useDelimiter(",");
        while(input.hasNext()){
            try {
                int gtt = Integer.parseInt(input.next());
                arr.add(gtt);
            } catch (NumberFormatException nfe) {
                // Handle the case where the input is not a valid integer
                nfe.printStackTrace();
            }
        }
        HoKhauDAO.getInstance().insert(hkmoi);
        
        for(Integer i: arr){
            //System.out.println(i);
            NhanKhauDAO.getInstance().updateHK(i,this.hkmoi.getMa_hk());
            //NhanKhauDAO.getInstance().updateHK(i,this.hkmoi.getMa_hk());
        }
     }
}
