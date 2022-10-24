package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class knop_lit_sr_var {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("Выберите вариант");
        Label.setLocation(10, 10);
        Label.setSize(1250, 100);
        Label.setHorizontalAlignment(0);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);

        JButton mat = new JButton("1");
        mat.setLocation(535, 100);
        mat.setSize(200,30 );

        ActionListener actionListener = new form_lit_sloj_sr_vopr();
        mat.addActionListener(actionListener);
        totalGUI.add(mat);

        JButton rus = new JButton("2");
        rus.setLocation(535, 150);
        rus.setSize(200, 30 );
        
        ActionListener ParceListener = new formsllit();
        rus.addActionListener(ParceListener);
        totalGUI.add(rus);

        JButton ist = new JButton("3");
        ist.setLocation(535, 200);
        ist.setSize(200, 30);
        
        ActionListener CListener  = new formsllit();
        ist.addActionListener(CListener);
        totalGUI.add(ist);
        
        JButton qw = new JButton("4");
        qw.setLocation(535, 250);
        qw.setSize(200, 30);
        
        ActionListener CListener1  = new formsllit();
        qw.addActionListener(CListener1);
        totalGUI.add(qw);
        
        JButton we = new JButton("5");
        we.setLocation(535, 300);
        we.setSize(200, 30);
        
        ActionListener CListener2  = new formsllit();
        ist.addActionListener(CListener2);
        totalGUI.add(we);
        
        JButton v1 = new JButton("Назад");
        v1.setLocation(10, 10);
        v1.setSize(100,20 );
        v1.setBackground(Color.GREEN);
        ActionListener actionListener1234 = new formsllit();
        v1.addActionListener(actionListener1234);
        totalGUI.add(v1);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}