package Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
public class sta_item{
    static int[] sum=new int[3];
    static int aver1=0;
    static int aver2=0;
    static int aver3=0;
    static int sum1=0;
    static int sum2=0;
    static int sum3=0;
    public static void getsum(){
      
    }
    public static void start() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败");
        }
        Connection con=null;
        java.sql.Statement st=null;
        try {
            sum1=0;
            sum2=0;
            sum3=0;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8", "root", "root");
            st=con.createStatement();
            ArrayList<Integer> list01=new ArrayList<>();
            ArrayList<Integer> list02=new ArrayList<>();
            ArrayList<Integer> list03=new ArrayList<>();
            
            ResultSet rs1=st.executeQuery("SELECT 总分 FROM dydd WHERE 班级=801");
            while (rs1.next()) {
                list01.add(rs1.getInt("总分"));
              }
              for(int i=0;i<list01.size();i++)sum1=list01.get(i)+sum1;
            aver1=sum1/(list01.size());
             rs1.close();
            ResultSet rs2=st.executeQuery("SELECT 总分 FROM dydd WHERE 班级=802");
            while (rs2.next()) {
                list02.add(rs2.getInt("总分"));
                }
                  for(int i=0;i<list02.size();i++)sum2=list02.get(i)+sum2;
                  rs2.close();
            aver2=sum2/(list02.size());
            ResultSet rs3=st.executeQuery("SELECT 总分 FROM dydd WHERE 班级=803");
              while (rs3.next()) {
            list03.add(rs3.getInt("总分"));
            }
              for(int i=0;i<list03.size();i++)sum3=list03.get(i)+sum3;
            aver3=sum3/(list03.size());
            rs3.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   }}