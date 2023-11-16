package Service;

import Model.PGiaoHang;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PGiaoHangService {
    private ArrayList<PGiaoHang> listGH;
    Connection conn = DBConect.getJDBCConnection();
    
    public PGiaoHangService(){
        this.listGH = new ArrayList<>();
    }
    public ArrayList<PGiaoHang> getAll() {
        this.listGH = new ArrayList<>();
        try{    
            String sql = "select id, user_id, address_id, into_money, total_cost, created_at, updated_at, delivery_date, voucher_id, status from bill";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 PGiaoHang ph;
                int id = rs.getInt(1);
                int user = rs.getInt(2);
                int address_id = rs.getInt(3);
                double into_money = rs.getDouble(4); 
                double total_cost = rs.getDouble(5);
                Date created_at = rs.getDate(6);
                Date update_at = rs.getDate(7);
                Date delivery_at = rs.getDate(8);
                int voucher = rs.getInt(9);
                String status = rs.getString(10);
                ph  = new PGiaoHang(id, user, into_money, total_cost, voucher, update_at, update_at, update_at, voucher, status);

            this.listGH.add (ph);
            }
            return listGH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGH;

    }
}
