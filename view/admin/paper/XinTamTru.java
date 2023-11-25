
package view.admin.paper;

import controller.TamTruListener;
import dao.TamTruDAO;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.TamTru;

public class XinTamTru extends JFrame{
    private JTextField noi_tamtru, lydo, thoigian, id;
    private TamTru person;
    
    public XinTamTru(){
        setTitle("Đơn tạm trú");
        setSize(1000, 300);
        setLocationRelativeTo(null);
        
        ActionListener ac = new TamTruListener(this);
        
        noi_tamtru = new JTextField(20);
        lydo = new JTextField(10);
        thoigian = new JTextField(10);
        id = new JTextField(5);
        
        JButton submit = new JButton("Submit");

        // Set up layout
        setLayout(new GridLayout(5, 2));
        
        add(new JLabel("ID:"));
        add(id);
        
        add(new JLabel("Nơi tạm trú:"));
        add(noi_tamtru);
        
        add(new JLabel("Thời gian (tháng): "));
        add(thoigian);
        
        add(new JLabel("Lý do:"));
        add(lydo);
        
        add(new JLabel());        
        add(submit);
        submit.addActionListener(ac);
        
        
        this.setVisible(true);
    }
    
    public void saveToAttributes(){
        System.out.println("fff");
        this.person = new TamTru();
        
        this.person.setNoitamtru(noi_tamtru.getText());
        this.person.setLydo(lydo.getText());
        
        try {
            int idt = Integer.parseInt(id.getText());
            this.person.setId(idt);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        
        try {
            int thoigiant = Integer.parseInt(thoigian.getText());
            this.person.setThoigian(thoigiant);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        
        System.out.println(person);
        TamTruDAO.getInstance().insert(person);
    }
    
    
    
    
    
    
}
