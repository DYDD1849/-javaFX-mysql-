package Item;

import java.sql.Connection;
import java.sql.DriverManager;

public class Change_item {
    public static void start() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con = null;
        java.sql.Statement st = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st = con.createStatement();
            st.executeUpdate("UPDATE dydd SET 学期='"+Gitem.ttt1+"',学号='"+Gitem.ttt2+"',班级='"+Gitem.ttt3+"',姓名='"+Gitem.ttt4+"',体育="+Gitem.ttt5+",高等数学="+Gitem.ttt6+",大学英语="+Gitem.ttt7+",大学计算机基础="+Gitem.ttt8+" WHERE 学号='"+Gitem.ttt+"'");
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
