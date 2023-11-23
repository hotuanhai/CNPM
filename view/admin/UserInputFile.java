
package view.admin;

import controller.AdminListener;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInputFile extends JFrame{
    private JButton btn_file;
    public UserInputFile(){
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Demo");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        
       ActionListener ac = new AdminListener(this);
        btn_file = new JButton("Tai file txt");
        btn_file.setFocusable(false);
        btn_file.addActionListener(ac);
        this.add(btn_file);
        
        
        this.setVisible(true);
    }
}
