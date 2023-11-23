
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SoHoKhau;


public class HoKhauDAO implements DAOInterface<SoHoKhau>{
    public static HoKhauDAO getInstance() {
	return new HoKhauDAO();
	}
    @Override
    public int insert(SoHoKhau t) {
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
    public int update(SoHoKhau t) {

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
        return kq;    }

    @Override
    public int delete(SoHoKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SoHoKhau> selectAll() {

        ArrayList kq = new ArrayList();
        try {
            
        Connection con = JDBCUtil.getConnection();
            
        String sql = "";
        PreparedStatement st = con.prepareStatement(sql);
        
        JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;    }

    @Override
    public ArrayList<SoHoKhau> selectByHoKhau(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
