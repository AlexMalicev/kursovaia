package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class knop_rus_sl_var_vopr {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("В каком ряду оба слова пишутся через дефис?");
        Label.setLocation(10, 50);
        Label.setSize(1250, 50);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);
        
        JLabel Label2 = new JLabel("Укажите пример с ошибкой в образовании формы слова");
        Label2.setLocation(10, 165);
        Label2.setSize(1250, 50);
        Label2.setForeground(Color.blue);
        totalGUI.add(Label2);
        
        JLabel Label3 = new JLabel("В каком ряду оба слова с НЕ пишутся слитно?");
        Label3.setLocation(10, 270);
        Label3.setSize(1250, 50);
        Label3.setForeground(Color.blue);
        totalGUI.add(Label3);
        
        JLabel Label4 = new JLabel("В каком слове верно выделена буква, обозначающая ударный гласный звук?");
        Label4.setLocation(10, 380);
        Label4.setSize(1250, 50);
        Label4.setForeground(Color.blue);
        totalGUI.add(Label4);
        
        JLabel Label5 = new JLabel("В каком слове произносится звук [й] ([j])?");
        Label5.setLocation(10, 490);
        Label5.setSize(1250, 50);
        Label5.setForeground(Color.blue);
        totalGUI.add(Label5);
        
        
        
        JButton v11 = new JButton("(зоо)магазин, литературно(художественный)");
        v11.setLocation(480, 30);
        v11.setSize(400,20 );
        ActionListener actionListener = new knop_mat_l_var_vopr_otvet11();
        v11.addActionListener(actionListener);
        totalGUI.add(v11);

        JButton v12 = new JButton("(пол)лимона, северо(западный)");
        v12.setLocation(480, 55);
        v12.setSize(400, 20 );
        ActionListener ParceListener = new knop_mat_l_var_vopr_otvet12();
        v12.addActionListener(ParceListener);
        totalGUI.add(v12);

        JButton v13 = new JButton("выпукло(вогнутый), (полу)остров	");
        v13.setLocation(480, 80);
        v13.setSize(400, 20);
        ActionListener CListener  = new knop_mat_l_var_vopr_otvet13();
        v13.addActionListener(CListener);
        totalGUI.add(v13);
        
        JButton v14 = new JButton("нет верного ответа");
        v14.setLocation(480, 105);
        v14.setSize(400, 20);
        ActionListener CListener1  = new knop_mat_l_var_vopr_otvet14();
        v14.addActionListener(CListener1);
        totalGUI.add(v14);
        
        
        
        JButton v21 = new JButton("пара туфель");
        v21.setLocation(480, 140);
        v21.setSize(400,20 );
        ActionListener actionListener1 = new knop_mat_l_var_vopr_otvet21();
        v21.addActionListener(actionListener1);
        totalGUI.add(v21);

        JButton v22 = new JButton("несколько полотенец");
        v22.setLocation(480, 165);
        v22.setSize(400, 20 );
        ActionListener ParceListener2 = new knop_mat_l_var_vopr_otvet22();
        v22.addActionListener(ParceListener2);
        totalGUI.add(v22);

        JButton v23 = new JButton("около пятиста километров");
        v23.setLocation(480, 190);
        v23.setSize(400, 20);
        ActionListener CListener3  = new knop_mat_l_var_vopr_otvet23();
        v23.addActionListener(CListener3);
        totalGUI.add(v23);
        
        JButton v24 = new JButton("нет верного ответа");
        v24.setLocation(480, 215);
        v24.setSize(400, 20);
        ActionListener CListener2  = new knop_mat_l_var_vopr_otvet24();
        v24.addActionListener(CListener2);
        totalGUI.add(v24);
        
        
        
        JButton v31 = new JButton("(не)более дюжины, ещё (не)распустившаяся сирень");
        v31.setLocation(480, 250);
        v31.setSize(400,20 );
        ActionListener actionListener12 = new knop_mat_l_var_vopr_otvet31();
        v31.addActionListener(actionListener12);
        totalGUI.add(v31);

        JButton v32 = new JButton("(не)вежда, (не)подумал");
        v32.setLocation(480, 275);
        v32.setSize(400, 20 );
        ActionListener ParceListener12 = new knop_mat_l_var_vopr_otvet32();
        v32.addActionListener(ParceListener12);
        totalGUI.add(v32);

        JButton v33 = new JButton("совершенно (не)интересный фильм, (не)исследованные пути");
        v33.setLocation(480, 300);
        v33.setSize(400, 20);
        ActionListener CListener13  = new knop_mat_l_var_vopr_otvet33();
        v33.addActionListener(CListener13);
        totalGUI.add(v33);
        
        JButton v34 = new JButton("нет верного ответа");
        v34.setLocation(480, 325);
        v34.setSize(400, 20);
        ActionListener CListener12  = new knop_mat_l_var_vopr_otvet34();
        v34.addActionListener(CListener12);
        totalGUI.add(v34);
        
        
        
        
        JButton v41 = new JButton("клялАсь");
        v41.setLocation(480, 360);
        v41.setSize(400,20 );
        ActionListener actionListener112 = new knop_mat_l_var_vopr_otvet41();
        v41.addActionListener(actionListener112);
        totalGUI.add(v41);

        JButton v42 = new JButton("сОзыв");
        v42.setLocation(480, 385);
        v42.setSize(400, 20 );
        ActionListener ParceListener122 = new knop_mat_l_var_vopr_otvet42();
        v42.addActionListener(ParceListener122);
        totalGUI.add(v42);

        JButton v43 = new JButton("красивЕе");
        v43.setLocation(480, 410);
        v43.setSize(400, 20);
        ActionListener CListener113  = new knop_mat_l_var_vopr_otvet43();
        v43.addActionListener(CListener113);
        totalGUI.add(v43);
        
        JButton v44 = new JButton("нет верного ответа");
        v44.setLocation(480, 435);
        v44.setSize(400, 20);
        ActionListener CListener112  = new knop_mat_l_var_vopr_otvet44();
        v44.addActionListener(CListener112);
        totalGUI.add(v44);
        
        
        
        JButton v51 = new JButton("ель");
        v51.setLocation(480, 470);
        v51.setSize(400,20 );
        ActionListener actionListener1112 = new knop_mat_l_var_vopr_otvet51();
        v51.addActionListener(actionListener1112);
        totalGUI.add(v51);

        JButton v52 = new JButton("метёлка");
        v52.setLocation(480, 495);
        v52.setSize(400, 20 );
        ActionListener ParceListener1222 = new knop_mat_l_var_vopr_otvet52();
        v52.addActionListener(ParceListener1222);
        totalGUI.add(v52);

        JButton v53 = new JButton("море");
        v53.setLocation(480, 520);
        v53.setSize(400, 20);
        ActionListener CListener1133  = new knop_mat_l_var_vopr_otvet53();
        v53.addActionListener(CListener1133);
        totalGUI.add(v53);
        
        JButton v54 = new JButton("люди");
        v54.setLocation(480, 545);
        v54.setSize(400, 20);
        ActionListener CListener1122  = new knop_mat_l_var_vopr_otvet54();
        v54.addActionListener(CListener1122);
        totalGUI.add(v54);
        
        JButton v1 = new JButton("Назад");
        v1.setLocation(10, 10);
        v1.setSize(100, 20 );
        v1.setBackground(Color.GREEN);
        ActionListener actionListener1234 = new form_rus_sloj_sl();
        v1.addActionListener(actionListener1234);
        totalGUI.add(v1);
           
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}