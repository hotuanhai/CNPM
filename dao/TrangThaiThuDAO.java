/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TrangThaiThu;

/**
 *
 * @author Admin
 */
public class TrangThaiThuDAO implements DAOInterface<TrangThaiThu>{
    public static TrangThaiThuDAO getInstance() {
		return new TrangThaiThuDAO();
	}
    @Override
    public int insert(TrangThaiThu t) {
        int kq=0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql ="INSERT INTO TRANGTHAI_THU(ma_hk,ma_thu,trangthai)"+ " VALUES(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getMa_hk());
            st.setString(2,t.getMa_thu());
            st.setInt(3, t.getTrangthai());
            kq = st.executeUpdate();
            //System.out.println(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public int update(TrangThaiThu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TrangThaiThu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TrangThaiThu> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TrangThaiThu> selectByHoKhau(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
