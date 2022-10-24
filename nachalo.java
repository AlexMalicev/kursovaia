package kursovaia;

import javax.swing.JFrame;

public class nachalo {
    public static void main(String[] args) {
         JFrame.setDefaultLookAndFeelDecorated(true);
         JFrame frame = new JFrame("Курсовой проект, Мальцева Александра");

         Temi demo = new Temi();
         frame.setContentPane(demo.createContentPane());

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(1280, 800);
         frame.setVisible(true);
      }
}