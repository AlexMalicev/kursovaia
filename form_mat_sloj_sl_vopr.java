package kursovaia;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_mat_sloj_sl_vopr implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	         JFrame.setDefaultLookAndFeelDecorated(true);
    	         JFrame frame = new JFrame("������ �������� 3� ����� �������� ���������� ���������");

    	         knop_mat_sl_var_vopr demo = new knop_mat_sl_var_vopr();
    	         frame.setContentPane(demo.createContentPane());

    	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	         frame.setSize(1280, 800);
    	         frame.setVisible(true);
         }
    }