package Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class output_item {
   static  ArrayList<grades> list1=null;
   static  ArrayList<grades> list2=null;
   static  ArrayList<grades> list3=null;
   static int listsize=0;
    public static void start(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con=null;
        java.sql.Statement st=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st=con.createStatement();
           ResultSet rs1= st.executeQuery("SELECT * FROM dydd WHERE 班级=801");
           list1=new ArrayList<grades>();
            while(rs1.next()){
                 grades a=new grades();
                 a.setschollnum(rs1.getString("学号"));
                 a.setname(rs1.getString("姓名"));
                 a.setpe(rs1.getInt("体育"));
                 a.setmath(rs1.getInt("高等数学"));
                 a.setenglish(rs1.getInt("大学英语"));
                 a.setcomputer(rs1.getInt("大学计算机基础"));
                 a.start();
                 list1.add(a);
            }
            rs1.close();
            ResultSet rs2= st.executeQuery("SELECT * FROM dydd WHERE 班级=802");
           list2=new ArrayList<grades>();
            while(rs2.next()){
                 grades a=new grades();
                 a.setschollnum(rs2.getString("学号"));
                 a.setname(rs2.getString("姓名"));
                 a.setpe(rs2.getInt("体育"));
                 a.setmath(rs2.getInt("高等数学"));
                 a.setenglish(rs2.getInt("大学英语"));
                 a.setcomputer(rs2.getInt("大学计算机基础"));
                 a.start();
                 list2.add(a);
            }
            rs2.close();
            ResultSet rs3= st.executeQuery("SELECT * FROM dydd WHERE 班级=803");
           list3=new ArrayList<grades>();
            while(rs3.next()){
                 grades a=new grades();
                 a.setschollnum(rs3.getString("学号"));
                 a.setname(rs3.getString("姓名"));
                 a.setpe(rs3.getInt("体育"));
                 a.setmath(rs3.getInt("高等数学"));
                 a.setenglish(rs3.getInt("大学英语"));
                 a.setcomputer(rs3.getInt("大学计算机基础"));
                 a.start();
                 list3.add(a);
            }
            rs3.close();
        int b=Math.max(list1.size(),list2.size());
        listsize =Math.max(b, list3.size());
        System.out.println(listsize);


            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
