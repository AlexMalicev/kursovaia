package kursovaia;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
  
public class knop_mat_l_var_vopr_otvet23 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = "����� ����������";
                JOptionPane.showMessageDialog(new JFrame(), message, "�����",
                    JOptionPane.CANCEL_OPTION);
             }
        }