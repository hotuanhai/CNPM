/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import database.JDBCUtil;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanKhau;

/**
 *
 * @author Admin
 */
public class NhanKhauDAO implements DAOInterface<NhanKhau>{

    public static NhanKhauDAO getInstance() {
		return new NhanKhauDAO();
	}
    @Override
    public int insert(NhanKhau t) {
        int kq=0;
        try {
            
            Connection con = JDBCUtil.getConnection();
            
String sql="INSERT INTO NHAN_KHAU(name,birth,nghe,qh,ma_hk,namehome,sex,dantoc,que,tongiao,noilamviec,ngaycap,noicap,ngaychuyen,addresscu,cccd)"
                    + " VALUES('"+t.getTen()+"' ,"+t.getNgaySinh()+" ,'"+t.getNgheNghiep()+"' ,'"+t.getQuanHe()+"', '"+t.getMa_hk()+"' ,'"+t.getBiDanh()+"', "+t.getGioiTinh()+" ,'"+t.getDanToc()+"','"+t.getQueQuan()+"','"+t.getTonGiao()+"','"+t.getNoiLam()+"'  ,"+t.getNgayCap()+" ,'"+t.getNoiCap()+"' ,"+t.getNgaychuyen()+" , '"+t.getNoiTTTruoc()+"' , '"+t.getCccd()+"' )";
            PreparedStatement st = con.prepareStatement(sql);
            
            kq = st.executeUpdate();
            
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public int update(NhanKhau t) {
           int kq=0;
        try {
            
            Connection con = JDBCUtil.getConnection();
            String sql ="";
            PreparedStatement st = con.prepareStatement(sql);
            
            kq = st.executeUpdate();
            
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public int delete(NhanKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanKhau> selectAll() {
        ArrayList kq = new ArrayList();
        try {
            
        Connection con = JDBCUtil.getConnection();
            
        String sql = "";
        PreparedStatement st = con.prepareStatement(sql);
        
        JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public ArrayList<NhanKhau> selectByHoKhau(String condition) {
        ArrayList kq = new ArrayList();
        try {
            
        Connection con = JDBCUtil.getConnection();
            
        String sql = "SELECT * FROM NHAN_KHAU where ma_hk=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,condition);
        
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            int id =rs.getInt("id");
            String name = rs.getString("name");
            Date birth = rs.getDate("birth");
            int sex = rs.getInt("sex");
            String cccd = rs.getString("cccd");
            
            NhanKhau NhanKhau = new NhanKhau(id, name, birth,sex,cccd);
            kq.add(NhanKhau);
        }
        JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
}
