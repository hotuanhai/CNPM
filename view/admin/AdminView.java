
package view.admin;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AdminView extends JFrame{
    private String chucVu;
    public AdminView(){
        this.setSize(500, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu_information = new JMenu("Xem thông tin");
		//Tao cac menu con
	JMenuItem jMenuItem_hokhau = new JMenuItem("Hộ khẩu");
	//jMenuItem_hokhau.addActionListener(ul);
		
	JMenuItem jMenuItem_nhankhau = new JMenuItem("Nhân khẩu");
	//jMenuItem_nhankhau.addActionListener(ul);
		
	jMenu_information.add(jMenuItem_hokhau);
	jMenu_information.addSeparator();
	jMenu_information.add(jMenuItem_nhankhau);
        
        JMenu jMenu_xingiay = new JMenu("Yêu cầu xin giấy");
	JMenuItem jMenuItem_tamtru = new JMenuItem("Tạm trú");
	//jMenuItem_tamtru.addActionListener(ul);
                
        JMenuItem jMenuItem_tamvang = new JMenuItem("Tạm vắng");
	//jMenuItem_tamvang.addActionListener(ul);
		
	jMenu_xingiay.add(jMenuItem_tamtru);
	jMenu_xingiay.addSeparator();
	jMenu_xingiay.add(jMenuItem_tamvang);
        
        JMenu jMenu_Thaydoi = new JMenu("Thay đổi nhân khẩu");
	JMenuItem jMenuItem_sinh = new JMenuItem("Mới sinh");
	//jMenuItem_tamtru.addActionListener(ul);
                
        JMenuItem jMenuItem_khaitu = new JMenuItem("Khai tử");
	//jMenuItem_tamvang.addActionListener(ul);
		
	jMenu_Thaydoi.add(jMenuItem_sinh);
	jMenu_Thaydoi.addSeparator();
	jMenu_Thaydoi.add(jMenuItem_khaitu);
        
        JMenu jMenu_Them = new JMenu("Thêm nhân khẩu");
	JMenuItem jMenuItem_file = new JMenuItem("File txt");
	//jMenuItem_tamtru.addActionListener(ul);
                
        JMenuItem jMenuItem_ttiep = new JMenuItem("Trực tiếp");
	//jMenuItem_tamvang.addActionListener(ul);
		
	jMenu_Them.add(jMenuItem_file);
	jMenu_Them.addSeparator();
	jMenu_Them.add(jMenuItem_ttiep);
        
        jMenuBar.add(jMenu_information);
	jMenuBar.add(jMenu_xingiay);
        jMenuBar.add(jMenu_Thaydoi);
        jMenuBar.add(jMenu_Them);
        this.setJMenuBar(jMenuBar);
        
        this.setVisible(true);
    }
}
