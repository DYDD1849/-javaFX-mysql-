package Item;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gitem extends Application {
    static String tf1;
    static String tf2;
    static String tf3;
    static String tf4;
    static int tf5;
    static int tf6;
    static int tf7;
    static int tf8;
    static String ttt;
    static String ttt1;
    static String ttt2;
    static String ttt3;
    static String ttt4;
    static int ttt5;
    static int ttt6;
    static int ttt7;
    static int ttt8;

    @Override
    public void start(Stage primaryStage) {

        GridPane gp = new GridPane();
        gp.setVgap(10);
        gp.setAlignment(Pos.TOP_CENTER);
        // 标题
        Text tx01 = new Text("学生成绩管理系统");
        tx01.setFont(Font.font("STKaiti", FontWeight.NORMAL, 18));
        gp.add(tx01, 1, 0);
        // 按钮
        Button bt01 = new Button("录入数据");
        gp.add(bt01, 1, 2);
        Button bt02 = new Button("修改数据");
        gp.add(bt02, 1, 3);
        Button bt03 = new Button("查找数据");
        gp.add(bt03, 1, 4);
        Button bt04 = new Button("输出数据");
        gp.add(bt04, 1, 5);
        Scene se = new Scene(gp, 500, 200);
        gp.setStyle("-fx-background-color:transparent;");
        se.setFill(Color.LIGHTBLUE);

        // 录入功能
        bt01.setOnAction(e -> {
            Stage st01 = new Stage();
            GridPane p = new GridPane();
            p.setVgap(5);
            p.setHgap(25);
            TextField tf01 = new TextField();
            TextField tf02 = new TextField();
            TextField tf03 = new TextField();
            TextField tf04 = new TextField();
            TextField tf05 = new TextField();
            TextField tf06 = new TextField();
            TextField tf07 = new TextField();
            TextField tf08 = new TextField();
            Button btl_01 = new Button("  录入  ");
            btl_01.setStyle("-fx-font-size:20px;-fx-font-family:SimSum;");
            p.add(new Label("学期"), 0, 0);
            p.add(new Label("学号"), 1, 0);
            p.add(new Label("班级"), 2, 0);
            p.add(new Label("姓名"), 3, 0);
            p.add(tf01, 0, 3);
            p.add(tf02, 1, 3);
            p.add(tf03, 2, 3);
            p.add(tf04, 3, 3);
            p.add(new Label("体育"), 0, 6);
            p.add(new Label("高等数学"), 1, 6);
            p.add(new Label("大学英语"), 2, 6);
            p.add(new Label("计算机基础  "), 3, 6);
            p.add(tf05, 0, 9);
            p.add(tf06, 1, 9);
            p.add(tf07, 2, 9);
            p.add(tf08, 3, 9);
            p.add(btl_01, 3, 10);
            Scene sc_01 = new Scene(p, 439, 200);
            st01.setScene(sc_01);
            st01.setTitle("录入数据");
            st01.show();
            btl_01.setOnAction(a -> {
                tf1 = tf01.getText();
                tf2 = tf02.getText();
                tf3 = tf03.getText();
                tf4 = tf04.getText();
                tf5 = Integer.parseInt(tf05.getText());
                tf6 = Integer.parseInt(tf06.getText());
                tf7 = Integer.parseInt(tf07.getText());
                tf8 = Integer.parseInt(tf08.getText());
                System.out.println(tf1);
                input_item.start();
            });
        });

        //修改功能
        bt02.setOnAction(event -> {

            Stage stage04 = new Stage();
            BorderPane bp02 = new BorderPane();
            GridPane gp01 = new GridPane();
            GridPane gp02 = new GridPane();
            bp02.setRight(gp01);
            bp02.setLeft(gp02);
            gp01.setHgap(30);
            TextField txf = new TextField();
            Button bt = new Button("选择");
            
            ArrayList<grades> list = find_item.start();
            System.out.println(list.size());
            gp01.add(new Text("学号"), 0, 0);
            gp01.add(new Text("姓名"), 1, 0);
            gp01.add(new Text("体育"), 2, 0);
            gp01.add(new Text("高等数学"), 3, 0);
            gp01.add(new Text("大学英语"), 4, 0);
            gp01.add(new Text("大学计算机基础    "), 5, 0);
            Text[] tx = new Text[list.size() * 6];
            for (int i = 0; i < list.size(); i++) {
                tx[i * 6 + 0] = new Text();
                tx[i * 6 + 1] = new Text();
                tx[i * 6 + 2] = new Text();
                tx[i * 6 + 3] = new Text();
                tx[i * 6 + 4] = new Text();
                tx[i * 6 + 5] = new Text();
                gp01.add(tx[i * 6 + 0], 0, i + 1);
                gp01.add(tx[i * 6 + 1], 1, i + 1);
                gp01.add(tx[i * 6 + 2], 2, i + 1);
                gp01.add(tx[i * 6 + 3], 3, i + 1);
                gp01.add(tx[i * 6 + 4], 4, i + 1);
                gp01.add(tx[i * 6 + 5], 5, i + 1);
            }
            for (int i = 0; i < list.size(); i++) {
                tx[i * 6 + 0].setText(list.get(i).schollnum);
                tx[i * 6 + 1].setText(list.get(i).name);
                tx[i * 6 + 2].setText(list.get(i).pe + "");
                tx[i * 6 + 3].setText(list.get(i).math + "");
                tx[i * 6 + 4].setText(list.get(i).engish + "");
                tx[i * 6 + 5].setText(list.get(i).computer + "    ");
            }
            gp02.add(new Text("请选择想修改学生的学号："), 0, 0);
            gp02.add(txf, 1, 0);
            gp02.add(bt, 1, 1);
            stage04.setTitle("修改");
            stage04.setScene(new Scene(bp02, 900, 500));
            stage04.show();
            bt.setOnAction(ev -> {
                
                ttt=txf.getText();
                Stage stage05 = new Stage();
                GridPane p = new GridPane();
                p.setVgap(5);
                p.setHgap(25);
                TextField tf01 = new TextField();
                TextField tf02 = new TextField();
                TextField tf03 = new TextField();
                TextField tf04 = new TextField();
                TextField tf05 = new TextField();
                TextField tf06 = new TextField();
                TextField tf07 = new TextField();
                TextField tf08 = new TextField();
                Button btl_01 = new Button("  修改  ");
                btl_01.setStyle("-fx-font-size:20px;-fx-font-family:SimSum;");
                p.add(new Label("学期"), 0, 0);
                p.add(new Label("学号"), 1, 0);
                p.add(new Label("班级"), 2, 0);
                p.add(new Label("姓名"), 3, 0);
                p.add(tf01, 0, 3);
                p.add(tf02, 1, 3);
                p.add(tf03, 2, 3);
                p.add(tf04, 3, 3);
                p.add(new Label("体育"), 0, 6);
                p.add(new Label("高等数学"), 1, 6);
                p.add(new Label("大学英语"), 2, 6);
                p.add(new Label("计算机基础  "), 3, 6);
                p.add(tf05, 0, 9);
                p.add(tf06, 1, 9);
                p.add(tf07, 2, 9);
                p.add(tf08, 3, 9);
                p.add(btl_01, 3, 10);
            btl_01.setOnAction(e->{
                ttt1 = tf01.getText();
                ttt2 = tf02.getText();
                ttt3 = tf03.getText();
                ttt4 = tf04.getText();
                ttt5 = Integer.parseInt(tf05.getText());
                ttt6 = Integer.parseInt(tf06.getText());
                ttt7 = Integer.parseInt(tf07.getText());
                ttt8 = Integer.parseInt(tf08.getText());
                Change_item.start();
            });

                stage05.setTitle("修改数据");
                stage05.setScene(new Scene(p, 439, 200));
                stage05.show();
            });
        });

        // 查询功能
        bt03.setOnAction(bte -> {
            Stage stage03 = new Stage();
            BorderPane bp2 = new BorderPane();
            GridPane gp1 = new GridPane();
            GridPane gp2 = new GridPane();
            bp2.setLeft(gp2);
            bp2.setRight(gp1);
            gp2.setHgap(5);
            gp2.setVgap(5);
            ComboBox<String> comboBox = new ComboBox<>();
            comboBox.getItems().addAll("学期", "学号", "姓名", "班级");
            comboBox.setOnAction(event -> {
                comboBox.show();
            });

            Button bt6 = new Button("开始查询");
            TextField txf = new TextField();
            gp2.add(comboBox, 2, 0);
            gp2.add(new Text("查询:"), 0, 0);
            gp2.add(txf, 4, 0);
            gp2.add(bt6, 0, 1, 4, 1);
            gp1.setVgap(5);
            gp1.setHgap(50);
            bt6.setOnAction(e -> {
                gp1.getChildren().removeAll(gp1.getChildren());
                ArrayList<grades> list = find_item.find(comboBox.getValue(), txf.getText());
                Text[] tx = new Text[find_item.find(comboBox.getValue(), txf.getText()).size() * 6];
                gp1.add(new Text("学号"), 0, 0);
                gp1.add(new Text("姓名"), 1, 0);
                gp1.add(new Text("体育"), 2, 0);
                gp1.add(new Text("高等数学"), 3, 0);
                gp1.add(new Text("大学英语"), 4, 0);
                gp1.add(new Text("大学计算机基础    "), 5, 0);
                for (int i = 0; i < list.size(); i++) {
                    tx[i * 6 + 0] = new Text();
                    tx[i * 6 + 1] = new Text();
                    tx[i * 6 + 2] = new Text();
                    tx[i * 6 + 3] = new Text();
                    tx[i * 6 + 4] = new Text();
                    tx[i * 6 + 5] = new Text();
                    gp1.add(tx[i * 6 + 0], 0, i + 1);
                    gp1.add(tx[i * 6 + 1], 1, i + 1);
                    gp1.add(tx[i * 6 + 2], 2, i + 1);
                    gp1.add(tx[i * 6 + 3], 3, i + 1);
                    gp1.add(tx[i * 6 + 4], 4, i + 1);
                    gp1.add(tx[i * 6 + 5], 5, i + 1);
                }
                for (int i = 0; i < list.size(); i++) {
                    tx[i * 6 + 0].setText(" ");
                    tx[i * 6 + 1].setText(" ");
                    tx[i * 6 + 2].setText(" ");
                    tx[i * 6 + 3].setText(" ");
                    tx[i * 6 + 4].setText(" ");
                    tx[i * 6 + 5].setText(" ");
                }
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).pe < 60) {
                        tx[i * 6 + 2].setFill(Color.RED);
                    }
                    if (list.get(i).math < 60) {
                        tx[i * 6 + 3].setFill(Color.RED);
                    }
                    if (list.get(i).engish < 60) {
                        tx[i * 6 + 4].setFill(Color.RED);
                    }
                    if (list.get(i).computer < 60) {
                        tx[i * 6 + 5].setFill(Color.RED);
                    }
                    tx[i * 6 + 0].setText(list.get(i).schollnum);
                    tx[i * 6 + 1].setText(list.get(i).name);
                    tx[i * 6 + 2].setText(list.get(i).pe + "");
                    tx[i * 6 + 3].setText(list.get(i).math + "");
                    tx[i * 6 + 4].setText(list.get(i).engish + "");
                    tx[i * 6 + 5].setText(list.get(i).computer + "    ");
                }
            });
            stage03.setTitle("查询");
            stage03.setScene(new Scene(bp2, 900, 500));
            stage03.show();
        });

        // 统计输出功能
        bt04.setOnAction(bte -> {
            sta_item.start();
            output_item.start();
            Stage st02 = new Stage();
            BorderPane bp1 = new BorderPane();
            VBox vb = new VBox();
            VBox vb2 = new VBox();
            ToggleGroup toggleGroup = new ToggleGroup();
            RadioButton rb1 = new RadioButton("一班");
            RadioButton rb2 = new RadioButton("二班");
            RadioButton rb3 = new RadioButton("三班");
            rb1.setToggleGroup(toggleGroup);
            rb2.setToggleGroup(toggleGroup);
            rb3.setToggleGroup(toggleGroup);
            vb.getChildren().addAll(rb1, rb2, rb3);
            Text tx02 = new Text();
            vb.getChildren().addAll(tx02);
            vb2.getChildren().addAll(
                    new Label("学号         姓名         体育         高等数学     大学英语     大学计算机基础    总分         平均分       "));
            Text[] txt = new Text[output_item.listsize];
            for (int i = 0; i < output_item.listsize; i++) {
                txt[i] = new Text();
                vb2.getChildren().add(txt[i]);
            }
            toggleGroup.selectedToggleProperty().addListener((t, g, s) -> {
                if (s == rb1) {
                    tx02.setText("班级总分为:" + sta_item.sum1 + "\n" + "班级平均分为:" + sta_item.aver1);
                    for (int i = 0; i < output_item.listsize; i++) {
                        txt[i].setText(" ");
                    }
                    for (int i = 0; i < output_item.list1.size(); i++) {
                        txt[i].setText(output_item.list1.get(i).schollnum +
                                "\t\t" + output_item.list1.get(i).name + "\t\t" + output_item.list1.get(i).pe +
                                "\t\t" + output_item.list1.get(i).math + "\t\t\t" + output_item.list1.get(i).engish +
                                "\t\t" + output_item.list1.get(i).computer + "\t\t\t" + output_item.list1.get(i).all
                                + "\t\t" + output_item.list1.get(i).aver);
                    }
                }
                if (s == rb2) {
                    tx02.setText("班级总分为:" + sta_item.sum2 + "\n" + "班级平均分为:" + sta_item.aver2);
                    for (int i = 0; i < output_item.listsize; i++) {
                        txt[i].setText(" ");
                    }
                    for (int i = 0; i < output_item.list2.size(); i++) {
                        txt[i].setText(output_item.list2.get(i).schollnum +
                                "\t\t" + output_item.list2.get(i).name + "\t\t" + output_item.list2.get(i).pe +
                                "\t\t" + output_item.list2.get(i).math + "\t\t\t" + output_item.list2.get(i).engish +
                                "\t\t" + output_item.list2.get(i).computer + "\t\t\t" + output_item.list2.get(i).all
                                + "\t\t" + output_item.list2.get(i).aver);
                    }
                }
                if (s == rb3) {
                    tx02.setText("班级总分为:" + sta_item.sum3 + "\n" + "班级平均分为:" + sta_item.aver3);
                    for (int i = 0; i < output_item.listsize; i++) {
                        txt[i].setText(" ");
                    }
                    for (int i = 0; i < output_item.list3.size(); i++) {
                        txt[i].setText(output_item.list3.get(i).schollnum +
                                "\t\t" + output_item.list3.get(i).name + "\t\t" + output_item.list3.get(i).pe +
                                "\t\t" + output_item.list3.get(i).math + "\t\t\t" + output_item.list3.get(i).engish +
                                "\t\t" + output_item.list3.get(i).computer + "\t\t\t" + output_item.list3.get(i).all
                                + "\t\t" + output_item.list3.get(i).aver);
                    }
                }
            });
            gp.setHgap(3);
            vb.setSpacing(20);
            bp1.setLeft(vb);
            bp1.setRight(vb2);
            Scene sc02 = new Scene(bp1, 700, 500);
            st02.setTitle("学生成绩表 ");
            st02.setScene(sc02);
            st02.show();
        });
        
        primaryStage.setTitle("学生管理系统");
        primaryStage.setScene(se);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
