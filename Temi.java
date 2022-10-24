package kursovaia;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Temi {
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel Label = new JLabel("Выберите тему");
        Label.setLocation(10, 10);
        Label.setSize(1250, 100);
        Label.setHorizontalAlignment(0);
        Label.setForeground(Color.blue);
        totalGUI.add(Label);

        JButton mat = new JButton("Математика");
        mat.setLocation(535, 100);
        mat.setSize(200,30 );

        ActionListener actionListener = new formsl();
        mat.addActionListener(actionListener);
        totalGUI.add(mat);

        JButton rus = new JButton("Русский язык");
        rus.setLocation(535, 150);
        rus.setSize(200, 30 );
        
        ActionListener ParceListener = new formslrus();
        rus.addActionListener(ParceListener);
        totalGUI.add(rus);

        JButton ist = new JButton("История");
        ist.setLocation(535, 200);
        ist.setSize(200, 30);
        
        ActionListener CListener  = new formslist();
        ist.addActionListener(CListener);
        totalGUI.add(ist);
        
        JButton lit = new JButton("Литература");
        lit.setLocation(535, 250);
        lit.setSize(200, 30);
        
        ActionListener CListener1  = new formsllit();
        lit.addActionListener(CListener1);
        totalGUI.add(lit);
   
   
           
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}