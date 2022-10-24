package kursovaia;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_ist_sloj_sr implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	         JFrame.setDefaultLookAndFeelDecorated(true);
    	         JFrame frame = new JFrame("Проект студента 3И курса Мальцева Александра Ивановича");

    	         knop_ist_sr_var demo = new knop_ist_sr_var();
    	         frame.setContentPane(demo.createContentPane());

    	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	         frame.setSize(1280, 800);
    	         frame.setVisible(true);
         }
    }