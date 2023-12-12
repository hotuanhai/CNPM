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
import java.util.ArrayList;
import model.TamVang;

/**
 *
 * @author Admin
 */
public class TamVangDAO implements DAOInterface<TamVang>{
    public static TamVangDAO getInstance() {
		return new TamVangDAO();
	}
    @Override
    public int insert(TamVang t) {
        int kq=0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql="insert into TAM_VANG(noitamtru,datefrom,dateto,id) Values (?, ?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
           // st.setInt(1, t.getMa_tamvang());
             st.setString(1, t.getNoitamtru());
            st.setDate(2, (java.sql.Date) t.getDatefrom());
              st.setDate(3, (java.sql.Date) t.getDateto());
            
             st.setInt(4, t.getId());

            kq = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
            
        return kq;
    }

    @Override
    public int update(TamVang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TamVang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamVang> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamVang> selectByHoKhau(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
