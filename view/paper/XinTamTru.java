package Paper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XinTamTru extends JFrame {
	private JTextField fullName, from, to, sex, address, reason;
    private JLabel jLabel;

    public XinTamTru() {
        // Set up the frame
        setTitle("Đơn xin tạm vắng");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 150);
        setLocationRelativeTo(null);
        //setLayout(new GridLayout(5, 5));

        // Create components
        fullName = new JTextField(20);
        from = new JTextField(10);
        to = new JTextField(10);
        sex = new JTextField(5);
        address = new JTextField(20);
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
        
        add(new JLabel("Nơi ở hiện tại:"));
        add(address);
        
        add(new JLabel("Từ ngày: "));
        add(from);
        
        add(new JLabel("Đến ngày: "));
        add(to);
        
        add(new JLabel("Lý do: "));
        add(reason);
        
        add(new JLabel()); // Empty label for spacing
        add(submit);
        
        this.setVisible(true);
    }
}
