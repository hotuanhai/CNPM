package view.admin.paper;

import controller.AdminListener;
import controller.TamVangListener;
import dao.TamVangDAO;
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
import model.TamVang;
import view.admin.InputNhanKhau;


public class XinTamVang extends JFrame{
    private JTextField noi_tamtru, from, to, id;
    private TamVang person;
    public XinTamVang() {
        setTitle("Đơn tạm vắng");
        setSize(1000, 300);
        setLocationRelativeTo(null);
        
        ActionListener ac = new TamVangListener(this);
        
      // Create components
        noi_tamtru = new JTextField(20);
        from = new JTextField(10);
        to = new JTextField(10);
        id = new JTextField(5);
        
        

        JButton submit = new JButton("Submit");

        // Set up layout
        setLayout(new GridLayout(5, 2));

        // Add components to the frame
        
        //add(new JLabel());
        
        add(new JLabel("ID:"));
        add(id);
        
        
        
        add(new JLabel("Từ ngày: "));
        add(from);
        
        add(new JLabel("Đến ngày: "));
        add(to);
        
       add(new JLabel("Nơi tạm trú:"));
        add(noi_tamtru);
        
        add(new JLabel());
        
        add(submit);    
        submit.addActionListener(ac);
        this.setVisible(true);
    }
    
    
    public void saveToAttributes(){
        System.out.println("hi");
        this.person = new TamVang();
        
        
        try {
            int idt = Integer.parseInt(id.getText());
            this.person.setId(idt);
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid integer
            nfe.printStackTrace();
        }
        
        String datefrom = from.getText();
        // Parse the text into a java.util.Date      
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(datefrom);
        } catch (ParseException ex) {
            Logger.getLogger(InputNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        this.person.setDatefrom(sqlDate);
        
       String dateto = to.getText();
        // Parse the text into a java.util.Date      
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        utilDate = null;
        try {
            utilDate = dateFormat.parse(dateto);
        } catch (ParseException ex) {
            Logger.getLogger(InputNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convert java.util.Date to java.sql.Date
        sqlDate = new java.sql.Date(utilDate.getTime());

        this.person.setDateto(sqlDate); 
        
        this.person.setNoitamtru(noi_tamtru.getText());
        System.out.println(person);
        TamVangDAO.getInstance().insert(person);
    }
}
