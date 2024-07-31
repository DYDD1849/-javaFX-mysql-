package Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class input_item{
    public static void start() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con=null;
        Statement st=null;//不可写在try（）的括号里面，这会给这些定义添加finally前缀，因此变为无法修改只可使用的值
        try {
            int all=Gitem.tf5+Gitem.tf6+Gitem.tf7+Gitem.tf8;
            int aver=all/4;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st=con.createStatement();
            st.execute("INSERT INTO dydd VALUES('"+Gitem.tf1+
            "','"+Gitem.tf2+"','"+Gitem.tf3+"','"+Gitem.tf4+"',"+Gitem.tf5+","+Gitem.tf6+","
            +Gitem.tf7+","+Gitem.tf8+","+all+","+aver+")");
            st.close();
            con.close();//关闭的顺序是Result第一然后satement最后是connection
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
