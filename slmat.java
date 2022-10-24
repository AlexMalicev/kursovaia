package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slmat {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("Выберите сложность");
        Label.setLocation(10, 10);
        Label.setSize(1250, 100);
        Label.setHorizontalAlignment(0);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);

        JButton mat = new JButton("Легкая");
        mat.setLocation(535, 100);
        mat.setSize(200,30 );
        
        ActionListener actionListener = new form_mat_sloj_l();
        mat.addActionListener(actionListener);
        totalGUI.add(mat);

        JButton rus = new JButton("Средняя");
        rus.setLocation(535, 150);
        rus.setSize(200, 30 );
        
        ActionListener ParceListener = new form_mat_sloj_sr();
        rus.addActionListener(ParceListener);
        totalGUI.add(rus);

        JButton ist = new JButton("Сложная");
        ist.setLocation(535, 200);
        ist.setSize(200, 30);
        
        ActionListener CListener  = new form_mat_sloj_sl();
        ist.addActionListener(CListener);
        totalGUI.add(ist);
        
        JButton v1 = new JButton("Русский язык");
        v1.setLocation(10, 10);
        v1.setSize(150,20 );
        v1.setBackground(Color.RED);
        ActionListener actionListener1234 = new formslrus();
        v1.addActionListener(actionListener1234);
        totalGUI.add(v1);
        
        JButton v2 = new JButton("Литература");
        v2.setLocation(30, 40);
        v2.setSize(100,20 );
        v2.setBackground(Color.ORANGE);
        ActionListener actionListener1 = new formsllit();
        v2.addActionListener(actionListener1);
        totalGUI.add(v2);
        
        JButton v3 = new JButton("История");
        v3.setLocation(30, 70);
        v3.setSize(100,20 );
        v3.setBackground(Color.CYAN);
        ActionListener actionListener2 = new formslist();
        v3.addActionListener(actionListener2);
        totalGUI.add(v3);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}