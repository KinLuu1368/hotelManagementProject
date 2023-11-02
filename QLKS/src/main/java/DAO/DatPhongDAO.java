/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Library.JDBCHelper;
import Model.DatPhong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kien Luu
 */
public class DatPhongDAO {
     public List<DatPhong> select(String sql, Object...args) {
        List<DatPhong> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(sql, args);
            while(rs.next()) {
                DatPhong model = readFromResultSet(rs);
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
     
    public DatPhong readFromResultSet(ResultSet rs) throws SQLException {
        String maDatPhong = rs.getString("MaDat");
        String maNV = rs.getString("MaNV");
        int SDTKhach = rs.getInt("SDTKhach");
        Date ngayDen = rs.getDate("ngayDen");
        Date ngayDi = rs.getDate("ngayDi");
        
        DatPhong model = new DatPhong(maDatPhong, maNV, SDTKhach, ngayDen, ngayDi, maDatPhong);
        return model;
    }
    
    public List<DatPhong> select() {
        String sql = "Select * From DatPhong";
        return select(sql);
    }
}
