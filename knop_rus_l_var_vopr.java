package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class knop_rus_l_var_vopr {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("Согласный звук [ч]-...");
        Label.setLocation(10, 50);
        Label.setSize(1250, 50);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);
        
        JLabel Label2 = new JLabel("Какая буква не пишется после буквы Ш?");
        Label2.setLocation(10, 165);
        Label2.setSize(1250, 50);
        Label2.setForeground(Color.blue);
        totalGUI.add(Label2);
        
        JLabel Label3 = new JLabel("Укажите слово, в котором пишется буква Ы?");
        Label3.setLocation(10, 270);
        Label3.setSize(1250, 50);
        Label3.setForeground(Color.blue);
        totalGUI.add(Label3);
        
        JLabel Label4 = new JLabel("После какой буквы может быть написана Ы?");
        Label4.setLocation(10, 380);
        Label4.setSize(1250, 50);
        Label4.setForeground(Color.blue);
        totalGUI.add(Label4);
        
        JLabel Label5 = new JLabel("В каком слове вместо пропуска надо вставить Ь?");
        Label5.setLocation(10, 490);
        Label5.setSize(1250, 50);
        Label5.setForeground(Color.blue);
        totalGUI.add(Label5);
        
        
        
        JButton v11 = new JButton("мягкий, звонкий");
        v11.setLocation(300, 30);
        v11.setSize(200,20 );
        ActionListener actionListener = new knop_mat_l_var_vopr_otvet11();
        v11.addActionListener(actionListener);
        totalGUI.add(v11);

        JButton v12 = new JButton("мягкий, глухой");
        v12.setLocation(300, 55);
        v12.setSize(200, 20 );
        ActionListener ParceListener = new knop_mat_l_var_vopr_otvet12();
        v12.addActionListener(ParceListener);
        totalGUI.add(v12);

        JButton v13 = new JButton("твердый, глухой");
        v13.setLocation(300, 80);
        v13.setSize(200, 20);
        ActionListener CListener  = new knop_mat_l_var_vopr_otvet13();
        v13.addActionListener(CListener);
        totalGUI.add(v13);
        
        JButton v14 = new JButton("твердый, звонкий");
        v14.setLocation(300, 105);
        v14.setSize(200, 20);
        ActionListener CListener1  = new knop_mat_l_var_vopr_otvet14();
        v14.addActionListener(CListener1);
        totalGUI.add(v14);
        
        
        
        JButton v21 = new JButton("и");
        v21.setLocation(300, 140);
        v21.setSize(200,20 );
        ActionListener actionListener1 = new knop_mat_l_var_vopr_otvet21();
        v21.addActionListener(actionListener1);
        totalGUI.add(v21);

        JButton v22 = new JButton("а");
        v22.setLocation(300, 165);
        v22.setSize(200, 20 );
        ActionListener ParceListener2 = new knop_mat_l_var_vopr_otvet22();
        v22.addActionListener(ParceListener2);
        totalGUI.add(v22);

        JButton v23 = new JButton("ы");
        v23.setLocation(300, 190);
        v23.setSize(200, 20);
        ActionListener CListener3  = new knop_mat_l_var_vopr_otvet23();
        v23.addActionListener(CListener3);
        totalGUI.add(v23);
        
        JButton v24 = new JButton("о");
        v24.setLocation(300, 215);
        v24.setSize(200, 20);
        ActionListener CListener2  = new knop_mat_l_var_vopr_otvet24();
        v24.addActionListener(CListener2);
        totalGUI.add(v24);
        
        
        
        JButton v31 = new JButton("ш..рокий");
        v31.setLocation(300, 250);
        v31.setSize(200,20 );
        ActionListener actionListener12 = new knop_mat_l_var_vopr_otvet31();
        v31.addActionListener(actionListener12);
        totalGUI.add(v31);

        JButton v32 = new JButton("пруж..на");
        v32.setLocation(300, 275);
        v32.setSize(200, 20 );
        ActionListener ParceListener12 = new knop_mat_l_var_vopr_otvet32();
        v32.addActionListener(ParceListener12);
        totalGUI.add(v32);

        JButton v33 = new JButton("л..жник");
        v33.setLocation(300, 300);
        v33.setSize(200, 20);
        ActionListener CListener13  = new knop_mat_l_var_vopr_otvet33();
        v33.addActionListener(CListener13);
        totalGUI.add(v33);
        
        JButton v34 = new JButton("ш..ны");
        v34.setLocation(300, 325);
        v34.setSize(200, 20);
        ActionListener CListener12  = new knop_mat_l_var_vopr_otvet34();
        v34.addActionListener(CListener12);
        totalGUI.add(v34);
        
        
        
        
        JButton v41 = new JButton("п");
        v41.setLocation(300, 360);
        v41.setSize(200,20 );
        ActionListener actionListener112 = new knop_mat_l_var_vopr_otvet41();
        v41.addActionListener(actionListener112);
        totalGUI.add(v41);

        JButton v42 = new JButton("ш");
        v42.setLocation(300, 385);
        v42.setSize(200, 20 );
        ActionListener ParceListener122 = new knop_mat_l_var_vopr_otvet42();
        v42.addActionListener(ParceListener122);
        totalGUI.add(v42);

        JButton v43 = new JButton("ж");
        v43.setLocation(300, 410);
        v43.setSize(200, 20);
        ActionListener CListener113  = new knop_mat_l_var_vopr_otvet43();
        v43.addActionListener(CListener113);
        totalGUI.add(v43);
        
        JButton v44 = new JButton("нет такой буквы");
        v44.setLocation(300, 435);
        v44.setSize(200, 20);
        ActionListener CListener112  = new knop_mat_l_var_vopr_otvet44();
        v44.addActionListener(CListener112);
        totalGUI.add(v44);
        
        
        
        JButton v51 = new JButton("щ..авель");
        v51.setLocation(300, 470);
        v51.setSize(200,20 );
        ActionListener actionListener1112 = new knop_mat_l_var_vopr_otvet51();
        v51.addActionListener(actionListener1112);
        totalGUI.add(v51);

        JButton v52 = new JButton("ч..ёрт");
        v52.setLocation(300, 495);
        v52.setSize(200, 20 );
        ActionListener ParceListener1222 = new knop_mat_l_var_vopr_otvet52();
        v52.addActionListener(ParceListener1222);
        totalGUI.add(v52);

        JButton v53 = new JButton("девоч..ка");
        v53.setLocation(300, 520);
        v53.setSize(200, 20);
        ActionListener CListener1133  = new knop_mat_l_var_vopr_otvet53();
        v53.addActionListener(CListener1133);
        totalGUI.add(v53);
        
        JButton v54 = new JButton("мал..чик");
        v54.setLocation(300, 545);
        v54.setSize(200, 20);
        ActionListener CListener1122  = new knop_mat_l_var_vopr_otvet54();
        v54.addActionListener(CListener1122);
        totalGUI.add(v54);
        
        JButton v1 = new JButton("Назад");
        v1.setLocation(10, 10);
        v1.setSize(100,20 );
        v1.setBackground(Color.GREEN);
        ActionListener actionListener1234 = new form_rus_sloj_l();
        v1.addActionListener(actionListener1234);
        totalGUI.add(v1);
           
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}