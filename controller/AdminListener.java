
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import view.admin.UserInputFile;

/**
 *
 * @author Admin
 */
public class AdminListener implements ActionListener{
    private UserInputFile uif;
    public AdminListener(UserInputFile uif){
        this.uif = uif;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Tai file txt")){
            JFileChooser file_upload = new JFileChooser(); 
            //file_upload. showOpenDialog(null);
            //int res = file_upload.showOpenDialog(null); 
            int res_2 = file_upload.showSaveDialog(null);
            if(res_2 == JFileChooser.APPROVE_OPTION) {
                File file_path = new File(file_upload.getSelectedFile().getAbsolutePath()); 
                System.out.println(file_path);
                if (file_path.length() == 3) {
                    
                } else if (file_path.length() > 3) {
                    String str = file_path.getName().toString().substring(file_path.getName().toString().length() - 3); 
                    if (str != "txt"){
                        System.out.println("not a txt file");
                    } else {
                        
                    }
                } else {
                  throw new IllegalArgumentException("word has fewer than 3 characters!");
                }
            }
        }
        else if(src.equals("Them")){
            
        }
    }
    
}
