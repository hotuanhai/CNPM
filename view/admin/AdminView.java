
package view.admin;

import controller.AdminListener;
import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.NhanKhau;
import model.SoHoKhau;

public class AdminView extends JFrame{
    private String macb;
    public AdminView(String chuc){
        this.macb = chuc;
        System.out.println(this.macb);
        this.setSize(500, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        
        ActionListener av = new AdminListener(this);
        
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu_information = new JMenu("Xem thông tin");
		//Tao cac menu con
	JMenuItem jMenuItem_hokhau = new JMenuItem("Hộ khẩu");
	jMenuItem_hokhau.addActionListener(av);
		
	JMenuItem jMenuItem_nhankhau = new JMenuItem("Nhân khẩu");
	jMenuItem_nhankhau.addActionListener(av);
		
	jMenu_information.add(jMenuItem_hokhau);
	jMenu_information.addSeparator();
	jMenu_information.add(jMenuItem_nhankhau);
        
        JMenu jMenu_xingiay = new JMenu("Yêu cầu xin giấy");
	JMenuItem jMenuItem_tamtru = new JMenuItem("Tạm trú");
	jMenuItem_tamtru.addActionListener(av);
                
        JMenuItem jMenuItem_tamvang = new JMenuItem("Tạm vắng");
	jMenuItem_tamvang.addActionListener(av);
		
	jMenu_xingiay.add(jMenuItem_tamtru);
	jMenu_xingiay.addSeparator();
	jMenu_xingiay.add(jMenuItem_tamvang);
        
        JMenu jMenu_Thaydoi = new JMenu("Thay đổi nhân khẩu");
	JMenuItem jMenuItem_sinh = new JMenuItem("Mới sinh");
	jMenuItem_sinh.addActionListener(av);
                
        JMenuItem jMenuItem_khaitu = new JMenuItem("Khai tử");
	jMenuItem_khaitu.addActionListener(av);
        
        JMenuItem jMenuItem_chuyen = new JMenuItem("Chuyển đi");
	jMenuItem_chuyen.addActionListener(av);
		
	jMenu_Thaydoi.add(jMenuItem_sinh);
	jMenu_Thaydoi.addSeparator();
	jMenu_Thaydoi.add(jMenuItem_khaitu);
        jMenu_Thaydoi.addSeparator();
        jMenu_Thaydoi.add(jMenuItem_chuyen);
        
        JMenu jMenu_Them = new JMenu("Thêm nhân khẩu");
	JMenuItem jMenuItem_file = new JMenuItem("File txt");
	jMenuItem_file.addActionListener(av);
                
        JMenuItem jMenuItem_ttiep = new JMenuItem("Truc tiep");
	jMenuItem_ttiep.addActionListener(av);
		
	jMenu_Them.add(jMenuItem_file);
	jMenu_Them.addSeparator();
	jMenu_Them.add(jMenuItem_ttiep);
        
        JMenu jMenu_Themhk = new JMenu("Thêm hộ khẩu");
//	JMenuItem jMenuItem_filehk = new JMenuItem("file txt");
//	jMenuItem_filehk.addActionListener(av);
                
        JMenuItem jMenuItem_tructiep = new JMenuItem("truc tiep");
	jMenuItem_tructiep.addActionListener(av);
		
	//jMenu_Themhk.add(jMenuItem_filehk);
	jMenu_Themhk.addSeparator();
	jMenu_Themhk.add(jMenuItem_tructiep);
        
        
        jMenuBar.add(jMenu_information);
	jMenuBar.add(jMenu_xingiay);
        jMenuBar.add(jMenu_Thaydoi);
        jMenuBar.add(jMenu_Them);
        jMenuBar.add(jMenu_Themhk);

        this.setJMenuBar(jMenuBar);
        
        this.setVisible(true);
    }
    
    
    
    
        public void innhankhau(){
            ArrayList<NhanKhau> nhankhau=  NhanKhauDAO.getInstance().selectAll();
            for(NhanKhau nk : nhankhau){
            System.out.println(nk.toString());
            }
        }
        
        public void inhokhau(){
            ArrayList<SoHoKhau> hokhau=  HoKhauDAO.getInstance().selectAll();
            for(SoHoKhau nk : hokhau){
            System.out.println(nk.toString());
            }
        }
        
        
}
