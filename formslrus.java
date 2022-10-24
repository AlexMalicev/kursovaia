package kursovaia;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formslrus implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	         JFrame.setDefaultLookAndFeelDecorated(true);
    	         JFrame frame = new JFrame("Проект студента 3И курса Мальцева Александра Ивановича");

    	         slrus demo = new slrus();
    	         frame.setContentPane(demo.createContentPane());

    	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	         frame.setSize(1280, 800);
    	         frame.setVisible(true);
         }
    }