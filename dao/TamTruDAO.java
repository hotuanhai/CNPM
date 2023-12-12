
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TamTru;


public class TamTruDAO implements DAOInterface<TamTru>{
    public static TamTruDAO getInstance(){
        return new TamTruDAO();
    }
    @Override
    public int insert(TamTru t) {
        int kq=0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql="insert into TAM_TRU(lydo,noitamtru,thoigian,id) Values (?, ?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            // st.setInt(1, t.getMa_tamvang());
            st.setString(1, t.getLydo());
            st.setString(2, t.getNoitamtru());
            st.setInt(3, t.getThoigian());
            st.setInt(4, t.getId());
            
            kq = st.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(TamTruDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;        
    }

    @Override
    public int update(TamTru t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TamTru t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamTru> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamTru> selectByHoKhau(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
