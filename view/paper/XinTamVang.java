package Paper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XinTamVang extends JFrame {
	private JTextField fullName, from, to, sex, ma_hk, reason;
    private Person person;

    public XinTamVang() {
    	
        // Set up the frame
        setTitle("Đơn xin tạm vắng");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 150);
        setLocationRelativeTo(null);
        //setLayout(new GridLayout(5, 5));

        // Create components
        fullName = new JTextField(20);
        from = new JTextField(10);
        to = new JTextField(10);
        sex = new JTextField(5);
        ma_hk = new JTextField(20);
        reason = new JTextField(100);

        JButton submit = new JButton("Submit");

        // Set up layout
        setLayout(new GridLayout(7, 2));

        // Add components to the frame
        add(new JLabel("Họ và tên:"));
        add(fullName);
        //add(new JLabel());
        
        add(new JLabel("Giới tính:"));
        add(sex);
        
        add(new JLabel("Hộ khẩu thường trú:"));
        add(ma_hk);
        
        add(new JLabel("Từ ngày: "));
        add(from);
        
        add(new JLabel("Đến ngày: "));
        add(to);
        
        add(new JLabel("Lý do: "));
        add(reason);
        
        add(new JLabel());
        
        add(submit);
        
        this.setVisible(true);
    
        submit.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		saveToAttributes();
        	}
        });
    }
    
    private void saveToAttributes() {
    	try {
            // Get the values from the form fields
            String fullName = this.fullName.getText();
            String from = this.from.getText();
            String to = this.to.getText();
            String reason = this.reason.getText();
            String ma_hk = this.ma_hk.getText();
            //int age = Integer.parseInt(ageField.getText());

            // Create a Person object with the entered data
            person = new Person(fullName, from, to, reason, ma_hk);

            JOptionPane.showMessageDialog(this, "Data saved to attributes." );
            
            //Save to database
            
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to attributes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
