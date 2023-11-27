
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import view.admin.AdminView;
import view.admin.InputNhanKhau;
import view.admin.KhaiSinh;
import view.admin.UserInputFile;
import view.admin.paper.XinTamTru;
import view.admin.paper.XinTamVang;

/**
 *
 * @author Admin
 */
public class AdminListener implements ActionListener{
    private InputNhanKhau ink;
    private UserInputFile uif;
    private AdminView av;
    private KhaiSinh ks;
//    private XinTamVang xtv;
//    
//    public AdminListener(XinTamVang xtv){
//        this.xtv = xtv;
//    }
    public AdminListener(KhaiSinh ks){
        this.ks = ks;
    }
    
    public AdminListener(UserInputFile uif){
        this.uif = uif;
    }
    public AdminListener(InputNhanKhau ink){
        this.ink = ink;
    }
    public AdminListener(AdminView av){
        this.av = av;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Tai file txt")){
            try {
                this.uif.taifile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(src.equals("File txt")){
            new UserInputFile();
        }
        else if(src.equals("Truc tiep")){
            new InputNhanKhau();
        }
        else if(src.equals("Them")){
            this.ink.them();
        }
        else if(src.equals("Nhân khẩu")){
            //System.out.println("hi");
            this.av.innhankhau();
        }
        else if(src.equals("Hộ khẩu")){
            //System.out.println("hi");
            this.av.inhokhau();
        }
        else if(src.equals("Mới sinh")){
            System.out.println("aaa");
        }
        else if(src.equals("Tạm vắng")){
            new XinTamVang();
        }
        else if(src.equals("Tạm trú")){
            new XinTamTru();
        }
        else if(src.equals("Nộp khai sinh")){
            this.ks.saveToAttributes();
        }
    }
    
}
