/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.admin.paper.XinTamVang;

/**
 *
 * @author Admin
 */
public class TamVangListener implements ActionListener{
    private XinTamVang xtv;
    public TamVangListener(XinTamVang xtv){
        this.xtv = xtv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Submit")){
            this.xtv.saveToAttributes();
        }
    }
    
}
