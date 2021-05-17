import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VeriTabani implements IVeriTabani{




    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cihaz",
                    "postgres", "1234");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }





    public boolean kullaniciDogrula(String isim, String sifre) {

        String sql= "SELECT \"isim\",\"sifre\" FROM \"kullanici\" WHERE \"isim\"="+"'"+isim+"'"+"AND \"sifre\"="+"'"+sifre+"'";
        Connection conn=this.baglan();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();
            if(!rs.next()){
                return false;
            }
            else{
                System.out.println("Kullanıcı doğrulama işlemi başarılı..!");
                return true;
            }
        }

        catch (Exception e){
            e.printStackTrace();
            return false;
        }


    }


}
