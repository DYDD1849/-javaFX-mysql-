package Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class find_item {
    static int size=0;
   
    public static ArrayList<grades> start() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con = null;
        java.sql.Statement st = null;
        ArrayList<grades> list2=new ArrayList<>();
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st = con.createStatement();
        ResultSet rs2 = st.executeQuery("SELECT * FROM dydd WHERE 学期='1'");
       
        while(rs2.next()){
            grades gds=new grades();
            gds.setschollnum(rs2.getString("学号"));
            gds.setname(rs2.getString("姓名"));
            gds.setpe(rs2.getInt("体育"));
            gds.setmath(rs2.getInt("高等数学"));
            gds.setenglish(rs2.getInt("大学英语"));
            gds.setcomputer(rs2.getInt("大学计算机基础"));
            list2.add(gds);
       }
       rs2.close();
       st.close();
       con.close();
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list2;
    }

    public static ArrayList<grades> find(String a, String b) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con = null;
        java.sql.Statement st = null;
        ArrayList<grades> list=new ArrayList<>();
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM dydd WHERE " + a + "='" + b+"'");
            while(rs.next()){
                grades gds=new grades();
                gds.setschollnum(rs.getString("学号"));
                gds.setname(rs.getString("姓名"));
                gds.setpe(rs.getInt("体育"));
                gds.setmath(rs.getInt("高等数学"));
                gds.setenglish(rs.getInt("大学英语"));
                gds.setcomputer(rs.getInt("大学计算机基础"));
                list.add(gds);
           }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}