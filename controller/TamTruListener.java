/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.admin.paper.XinTamTru;

/**
 *
 * @author Admin
 */
public class TamTruListener implements ActionListener{
    private XinTamTru xtt;
    public TamTruListener(XinTamTru xtt ){
        this.xtt = xtt;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Submit")){
            this.xtt.saveToAttributes();
        }
    }
    
}
