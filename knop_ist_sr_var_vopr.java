package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class knop_ist_sr_var_vopr {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("В каком году завершился Третий раздел Речи Посполитой?");
        Label.setLocation(10, 50);
        Label.setSize(1250, 50);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);
        
        JLabel Label2 = new JLabel("В 1812 году Францию возглавлял Наполеон I, а кто же правил в России?");
        Label2.setLocation(10, 165);
        Label2.setSize(1250, 50);
        Label2.setForeground(Color.blue);
        totalGUI.add(Label2);
        
        JLabel Label3 = new JLabel("По итогам какой войны Пётр I принял титул Императора Всероссийского?");
        Label3.setLocation(10, 270);
        Label3.setSize(1250, 50);
        Label3.setForeground(Color.blue);
        totalGUI.add(Label3);
        
        JLabel Label4 = new JLabel("В каком году произошло восстание декабристов?");
        Label4.setLocation(10, 380);
        Label4.setSize(1250, 50);
        Label4.setForeground(Color.blue);
        totalGUI.add(Label4);
        
        JLabel Label5 = new JLabel("С 1721 по 1905 годы в стране была именно эта форма монархии:");
        Label5.setLocation(10, 490);
        Label5.setSize(1250, 50);
        Label5.setForeground(Color.blue);
        totalGUI.add(Label5);
        
        
        
        JButton v11 = new JButton("1784");
        v11.setLocation(450, 30);
        v11.setSize(310,20 );
        ActionListener actionListener = new knop_mat_l_var_vopr_otvet11();
        v11.addActionListener(actionListener);
        totalGUI.add(v11);

        JButton v12 = new JButton("1795");
        v12.setLocation(450, 55);
        v12.setSize(310, 20 );
        ActionListener ParceListener = new knop_mat_l_var_vopr_otvet12();
        v12.addActionListener(ParceListener);
        totalGUI.add(v12);

        JButton v13 = new JButton("1746");
        v13.setLocation(450, 80);
        v13.setSize(310, 20);
        ActionListener CListener  = new knop_mat_l_var_vopr_otvet13();
        v13.addActionListener(CListener);
        totalGUI.add(v13);
        
        JButton v14 = new JButton("1802");
        v14.setLocation(450, 105);
        v14.setSize(310, 20);
        ActionListener CListener1  = new knop_mat_l_var_vopr_otvet14();
        v14.addActionListener(CListener1);
        totalGUI.add(v14);
        
        
        
        JButton v21 = new JButton("ПавелI");
        v21.setLocation(450, 140);
        v21.setSize(310,20 );
        ActionListener actionListener1 = new knop_mat_l_var_vopr_otvet21();
        v21.addActionListener(actionListener1);
        totalGUI.add(v21);

        JButton v22 = new JButton("ЕкатеринаII");
        v22.setLocation(450, 165);
        v22.setSize(310, 20 );
        ActionListener ParceListener2 = new knop_mat_l_var_vopr_otvet22();
        v22.addActionListener(ParceListener2);
        totalGUI.add(v22);

        JButton v23 = new JButton("АлександрI");
        v23.setLocation(450, 190);
        v23.setSize(310, 20);
        ActionListener CListener3  = new knop_mat_l_var_vopr_otvet23();
        v23.addActionListener(CListener3);
        totalGUI.add(v23);
        
        JButton v24 = new JButton("АлександрII");
        v24.setLocation(450, 215);
        v24.setSize(310, 20);
        ActionListener CListener2  = new knop_mat_l_var_vopr_otvet24();
        v24.addActionListener(CListener2);
        totalGUI.add(v24);
        
        
        
        JButton v31 = new JButton("Война за польское наследство");
        v31.setLocation(450, 250);
        v31.setSize(310,20 );
        ActionListener actionListener12 = new knop_mat_l_var_vopr_otvet31();
        v31.addActionListener(actionListener12);
        totalGUI.add(v31);

        JButton v32 = new JButton("Крымская война");
        v32.setLocation(450, 275);
        v32.setSize(310, 20 );
        ActionListener ParceListener12 = new knop_mat_l_var_vopr_otvet32();
        v32.addActionListener(ParceListener12);
        totalGUI.add(v32);

        JButton v33 = new JButton("Северная война");
        v33.setLocation(450, 300);
        v33.setSize(310, 20);
        ActionListener CListener13  = new knop_mat_l_var_vopr_otvet33();
        v33.addActionListener(CListener13);
        totalGUI.add(v33);
        
        JButton v34 = new JButton("нет правильного ответа");
        v34.setLocation(450, 325);
        v34.setSize(310, 20);
        ActionListener CListener12  = new knop_mat_l_var_vopr_otvet34();
        v34.addActionListener(CListener12);
        totalGUI.add(v34);
        
        
        
        
        JButton v41 = new JButton("1825");
        v41.setLocation(450, 360);
        v41.setSize(310,20 );
        ActionListener actionListener112 = new knop_mat_l_var_vopr_otvet41();
        v41.addActionListener(actionListener112);
        totalGUI.add(v41);

        JButton v42 = new JButton("1843");
        v42.setLocation(450, 385);
        v42.setSize(310, 20 );
        ActionListener ParceListener122 = new knop_mat_l_var_vopr_otvet42();
        v42.addActionListener(ParceListener122);
        totalGUI.add(v42);

        JButton v43 = new JButton("1801");
        v43.setLocation(450, 410);
        v43.setSize(310, 20);
        ActionListener CListener113  = new knop_mat_l_var_vopr_otvet43();
        v43.addActionListener(CListener113);
        totalGUI.add(v43);
        
        JButton v44 = new JButton("1805");
        v44.setLocation(450, 435);
        v44.setSize(310, 20);
        ActionListener CListener112  = new knop_mat_l_var_vopr_otvet44();
        v44.addActionListener(CListener112);
        totalGUI.add(v44);
        
        
        
        JButton v51 = new JButton("Призидентство");
        v51.setLocation(450, 470);
        v51.setSize(310,20 );
        ActionListener actionListener1112 = new knop_mat_l_var_vopr_otvet51();
        v51.addActionListener(actionListener1112);
        totalGUI.add(v51);

        JButton v52 = new JButton("Парламентская монархия");
        v52.setLocation(450, 495);
        v52.setSize(310, 20 );
        ActionListener ParceListener1222 = new knop_mat_l_var_vopr_otvet52();
        v52.addActionListener(ParceListener1222);
        totalGUI.add(v52);

        JButton v53 = new JButton("Дуалистическая монархия");
        v53.setLocation(450, 520);
        v53.setSize(310, 20);
        ActionListener CListener1133  = new knop_mat_l_var_vopr_otvet53();
        v53.addActionListener(CListener1133);
        totalGUI.add(v53);
        
        JButton v54 = new JButton("Абсолютная монархия");
        v54.setLocation(450, 545);
        v54.setSize(310, 20);
        ActionListener CListener1122  = new knop_mat_l_var_vopr_otvet54();
        v54.addActionListener(CListener1122);
        totalGUI.add(v54);
        
        JButton v1 = new JButton("Назад");
        v1.setLocation(10, 10);
        v1.setSize(100,20 );
        v1.setBackground(Color.GREEN);
        ActionListener actionListener1234 = new form_ist_sloj_sr();
        v1.addActionListener(actionListener1234);
        totalGUI.add(v1);
           
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}