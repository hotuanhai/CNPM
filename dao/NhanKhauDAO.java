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
            
String sql="INSERT INTO NHAN_KHAU(name,birth,nghe,qh,ma_hk,namehome,sex,dantoc,que,tongiao,noilamviec,ngaycap,noicap,addresscu,cccd)"
                    + " VALUES('"+t.getTen()+"' ,'"+t.getNgaySinh()+"' ,'"+t.getNgheNghiep()+"' ,'"+t.getQuanHe()+"', '"+t.getMa_hk()+"' ,'"+t.getBiDanh()+"', "+t.getGioiTinh()+" ,'"+t.getDanToc()+"','"+t.getQueQuan()+"','"+t.getTonGiao()+"','"+t.getNoiLam()+"'  ,'"+t.getNgayCap()+"' ,'"+t.getNoiCap()+"' , '"+t.getNoiTTTruoc()+"' , '"+t.getCccd()+"' )";
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
        ArrayList<NhanKhau> kq = new ArrayList<NhanKhau>();
        try {
            
        Connection con = JDBCUtil.getConnection();
            
        
        Statement st = con.createStatement();
        String sql = "select * from NHAN_KHAU";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            int id =rs.getInt("id");
            String name = rs.getString("name");
            Date birth = rs.getDate("birth");
            String note = rs.getString("note");
            String qh = rs.getString("qh");
            String mahk = rs.getString("ma_hk");
            String bidanh = rs.getString("namehome");
            int sex = rs.getInt("sex");
            String dantoc = rs.getString("dantoc");
            String que = rs.getString("que");
            String tongiao = rs.getString("tongiao");
            String noilv = rs.getString("noilamviec");
            Date ngaycap = rs.getDate("ngaycap");
            String noicap = rs.getString("noicap");
            Date ngaychuyen = rs.getDate("ngaychuyen");
            String addresscu = rs.getString("addresscu");
            String cccd = rs.getString("cccd");
            String nghe = rs.getString("nghe");
            String address = rs.getString("address");
            
            NhanKhau NhanKhau = new NhanKhau(id, name, birth,note,qh,mahk,bidanh,sex,dantoc,que,tongiao,nghe,
                    noilv,cccd,ngaycap,noicap,addresscu,ngaychuyen,address);
            kq.add(NhanKhau);
        }
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
    
    public int moisinh(NhanKhau t) {
        int kq = 0;
        try {
               //B1 : ket noi
            Connection con = JDBCUtil.getConnection();
            // B2: SQL
            String sql = "INSERT INTO NHAN_KHAU(name,birth,addresscu,qh,ma_hk,namehome,sex,dantoc,que)"
                    + " VALUES('" + t.getTen() + "' ,'" + t.getNgaySinh() + "' ,'"+t.getNoiTTTruoc()+ "' ,'" + t.getQuanHe() + "', '" + t.getMa_hk() + "' ,'" + t.getBiDanh() + "', " + t.getGioiTinh() + " ,'" + t.getDanToc() + "','" + t.getQueQuan()  + "' )";
            PreparedStatement st = con.prepareStatement(sql);
             
            kq = st.executeUpdate();
            //B3 : ngat ket noi
            //System.out.println(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public int mat(int t) {
        int kq=0;
        try{    
            Connection con = JDBCUtil.getConnection();
         
            String sql = "UPDATE NHAN_KHAU SET note = 'mat' WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t);
            System.out.println(sql);
            kq = st.executeUpdate();
            
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public int chuyen(NhanKhau t) {
    int kq = 0;
    try {
        Connection con = JDBCUtil.getConnection();

       
        String query = "SELECT address FROM NHAN_KHAU WHERE id = ?";
        PreparedStatement selectSt = con.prepareStatement(query);
        selectSt.setInt(1, t.getId());
        ResultSet rs = selectSt.executeQuery();

        String currentAddress = "";
        if (rs.next()) {
            currentAddress = rs.getString("address");
        }

        String sql = "UPDATE NHAN_KHAU SET addresscu = ?, address = ?, ngaychuyen = ? WHERE id = ?";
        PreparedStatement updateSt = con.prepareStatement(sql);
        updateSt.setString(1, currentAddress); 
        updateSt.setString(2, t.getAddress()); 
        updateSt.setDate(3, t.getNgaychuyen());
        updateSt.setInt(4, t.getId());

        kq = updateSt.executeUpdate();

        rs.close();
        selectSt.close();
        updateSt.close();

        JDBCUtil.closeConnection(con);
    } catch (SQLException ex) {
        Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return kq;
}
    public int updateHK(int t,String ma_hkmoi) {
        int kq=0;
        try{    
            Connection con = JDBCUtil.getConnection();
         
            String query = "SELECT * FROM NHAN_KHAU WHERE id = ?";
            PreparedStatement selectSt = con.prepareStatement(query);
            selectSt.setInt(1, t);
            ResultSet rs = selectSt.executeQuery();
            
            if (rs.next()) {
                
                String sql = "UPDATE NHAN_KHAU SET ma_hk = ? WHERE id = ?";
                PreparedStatement updateSt = con.prepareStatement(sql);
                updateSt.setString(1, ma_hkmoi);
                updateSt.setInt(2, t);
                kq = updateSt.executeUpdate();
        }
            
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}
