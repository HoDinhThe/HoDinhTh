
package Service;



import Model.PGiaoHang;
import Model.SanPham;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SanPhamService {
    private ArrayList<SanPham> listGH;
    Connection conn = DBConect.getJDBCConnection();
    
    public SanPhamService(){
        this.listGH = new ArrayList<>();
    }
    public ArrayList<SanPham> getAll() {
        this.listGH = new ArrayList<>();
        try{    
            String sql = "select id, name_product, product_price, created_at, custome_id, material_id, sale_id, thickness_id, updated_at, description, status from product";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();           
            while (rs.next()) {
                 SanPham sp;
                int id = rs.getInt(1);
                int name_product = rs.getInt(2);
                Date created_at = rs.getDate(3);
                double product_price = rs.getDouble(4);
                int custome_id = rs.getInt(5); 
                int material_id = rs.getInt(6);
                int sale_id = rs.getInt(7);
                int thickness_id = rs.getInt(8);
                Date updated_at = rs.getDate(9);
                String description = rs.getString(10);
                String status = rs.getString(11);
                sp  = new SanPham(id, status, product_price, updated_at, sale_id, sale_id, id, id, updated_at, sql, status);

            this.listGH.add (sp);
            }
            return listGH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGH;

    }
}
