
package view.admin;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.NhanKhau;


public class InputNhanKhau extends JFrame{
    private NhanKhau nk;
    private JTextField jTextField_ten;
    private JTextField jTextField_ngaysinh;
    private JTextField jTextField_note;
    private JTextField jTextField_qh;
    private JTextField jTextField_mahk;
    private JTextField jTextField_bidanh;
    private JTextField jTextField_gioitinh;
    private JTextField jTextField_dt;
    private JTextField jTextField_que;
    private JTextField jTextField_tongiao;
    private JTextField jTextField_nghe;
    private JTextField jTextField_noilam;
    private JTextField jTextField_cccd;
    private JTextField jTextField_ngaycap;
    private JTextField jTextField_noicap;
    private JTextField jTextField_ttt;
    private JTextField jTextField_ngaychuyen;
    public InputNhanKhau(){
        this.setSize(700, 700);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.BOLD, 20);
        
        JLabel jLabel_ten = new JLabel("Ten");
	jLabel_ten.setFont(font);		
	JLabel jLabel_ngaysinh = new JLabel("Ngay sinh");
	jLabel_ngaysinh.setFont(font);
	JLabel jLabel_note = new JLabel("Ghi chu");
	jLabel_note.setFont(font);
        JLabel jLabel_qh = new JLabel("Quan he");
	jLabel_qh.setFont(font);
        JLabel jLabel_mahk = new JLabel("Ma ho khau");
	jLabel_mahk.setFont(font);
        JLabel jLabel_bidanh = new JLabel("Bi danh");
	jLabel_bidanh.setFont(font);
        JLabel jLabel_gioitinh = new JLabel("Gioi tinh");
	jLabel_gioitinh.setFont(font);
        JLabel jLabel_dt = new JLabel("Dan toc");
	jLabel_dt.setFont(font);
        JLabel jLabel_que = new JLabel("Que quan");
	jLabel_que.setFont(font);
        JLabel jLabel_tongiao = new JLabel("Ton giao");
	jLabel_tongiao.setFont(font);
        JLabel jLabel_nghe = new JLabel("Nghe nghiep");
	jLabel_nghe.setFont(font);
        JLabel jLabel_noilam = new JLabel("Noi lam");
	jLabel_noilam.setFont(font);
        JLabel jLabel_cccd = new JLabel("CCCD");
	jLabel_cccd.setFont(font);
        JLabel jLabel_ngaycap = new JLabel("Ngay cap");
	jLabel_ngaycap.setFont(font);
        JLabel jLabel_noicap = new JLabel("Noi cap");
	jLabel_noicap.setFont(font);
        JLabel jLabel_ttt = new JLabel("Noi thuong tru truoc");
	jLabel_ttt.setFont(font);
        JLabel jLabel_ngaychuyen = new JLabel("Ngay chuyen");
	jLabel_ngaychuyen.setFont(font);
        
        jTextField_ten = new JTextField(50);
	jTextField_ten.setFont(font);
	jTextField_ngaysinh = new JTextField(50);
	jTextField_ngaysinh.setFont(font);
	jTextField_note = new JTextField(50);
	jTextField_note.setFont(font);        
        jTextField_qh = new JTextField(50);
	jTextField_qh.setFont(font);
	jTextField_mahk = new JTextField(50);
	jTextField_mahk.setFont(font);
	jTextField_bidanh = new JTextField(50);
	jTextField_bidanh.setFont(font); 
        jTextField_gioitinh = new JTextField(50);
	jTextField_gioitinh.setFont(font);
	jTextField_dt = new JTextField(50);
	jTextField_dt.setFont(font);
	jTextField_que = new JTextField(50);
	jTextField_que.setFont(font);        
        jTextField_tongiao = new JTextField(50);
	jTextField_tongiao.setFont(font);
	jTextField_nghe = new JTextField(50);
	jTextField_nghe.setFont(font);
	jTextField_noilam = new JTextField(50);
	jTextField_noilam.setFont(font);
        jTextField_cccd = new JTextField(50);
	jTextField_cccd.setFont(font);
	jTextField_ngaycap = new JTextField(50);
	jTextField_ngaycap.setFont(font);
	jTextField_noicap = new JTextField(50);
	jTextField_noicap.setFont(font);
        jTextField_ttt = new JTextField(50);
	jTextField_ttt.setFont(font);
	jTextField_ngaychuyen = new JTextField(50);
	jTextField_ngaychuyen.setFont(font);
		
        JPanel jPanelIO = new JPanel();
	jPanelIO.setLayout(new GridLayout(17, 2, 2, 10));
        jPanelIO.add(jLabel_ten); jPanelIO.add(jTextField_ten);
        jPanelIO.add(jLabel_ngaysinh); jPanelIO.add(jTextField_ngaysinh);
        jPanelIO.add(jLabel_note); jPanelIO.add(jTextField_note);
        jPanelIO.add(jLabel_qh); jPanelIO.add(jTextField_qh);
        jPanelIO.add(jLabel_mahk); jPanelIO.add(jTextField_mahk);
        jPanelIO.add(jLabel_bidanh); jPanelIO.add(jTextField_bidanh);
        jPanelIO.add(jLabel_gioitinh); jPanelIO.add(jTextField_gioitinh);
        jPanelIO.add(jLabel_dt); jPanelIO.add(jTextField_dt);
        jPanelIO.add(jLabel_que); jPanelIO.add(jTextField_que);
        jPanelIO.add(jLabel_tongiao); jPanelIO.add(jTextField_tongiao);
        jPanelIO.add(jLabel_nghe); jPanelIO.add(jTextField_nghe);
        jPanelIO.add(jLabel_noilam); jPanelIO.add(jTextField_noilam);
        jPanelIO.add(jLabel_cccd); jPanelIO.add(jTextField_cccd);
        jPanelIO.add(jLabel_ngaycap); jPanelIO.add(jTextField_ngaycap);
        jPanelIO.add(jLabel_noicap); jPanelIO.add(jTextField_noicap);
        jPanelIO.add(jLabel_ttt); jPanelIO.add(jTextField_ttt);
        jPanelIO.add(jLabel_ngaychuyen); jPanelIO.add(jTextField_ngaychuyen);
        
        //JScrollPane js = new JScrollPane(jPanelIO, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JButton jb = new JButton("Them");
        jb.setFont(font);
        this.setLayout(new BorderLayout(10, 10));
	this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jb,BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
}
