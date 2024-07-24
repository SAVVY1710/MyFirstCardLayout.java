/*
Sai Avula
3.27.24
MyFirstCardLayout.java
Use CardLayout
 */

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFirstCardLayout {
    public MyFirstCardLayout()
    {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        Practice pc = new Practice();
        frame.setContentPane(pc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        MyFirstCardLayout cld = new MyFirstCardLayout();
    }

    class Practice extends JPanel{
        int counter;
        JLabel taxt;
        JLabel taxt2;
        JLabel taxt3;
        JLabel taxt4;
        public Practice(){
            runIt();
            counter = 0;
        }
        public void paintComponent(Graphics g){
            super.paintComponent (g);
        }
        public void runIt(){
            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel(new BorderLayout());
            JPanel panel2 = new JPanel(new BorderLayout());
            JPanel panel3 = new JPanel(new BorderLayout());
            JPanel panel4 = new JPanel(new BorderLayout());

            JPanel btnPanel = new JPanel(new GridLayout(2,1));
            JPanel btnPanel2 = new JPanel(new GridLayout(2,1));
            JPanel btnPanel3 = new JPanel(new GridLayout(2,1));
            JPanel btnPanel4 = new JPanel(new GridLayout(2,1));

        }
        class Handler implements ActionListener{public void actionPerformed(ActionEvent e){}}
    }
}