/*
Sai Avula
3.27.24
MyFirstCardLayout.java
Use CardLayout
 */

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
        public void paintComponent(Graphics g)
        {
            super.paintComponent (g);
        }
        public void runIt()
        {
            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel(new BorderLayout());
            JPanel panel2 = new JPanel(new BorderLayout());
            JPanel panel3 = new JPanel(new BorderLayout());
            JPanel panel4 = new JPanel(new BorderLayout());

            JPanel btnPanel = new JPanel(new GridLayout(2,1));
            JPanel btnPanel2 = new JPanel(new GridLayout(2,1));
            JPanel btnPanel3 = new JPanel(new GridLayout(2,1));
            JPanel btnPanel4 = new JPanel(new GridLayout(2,1));

            JPanel btnpanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel btnpanel8 = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnPanel.add(btnpanel1);
            btnPanel.add(btnpanel2);
            btnPanel2.add(btnpanel3);
            btnPanel2.add(btnpanel4);
            btnPanel3.add(btnpanel5);
            btnPanel3.add(btnpanel6);
            btnPanel4.add(btnpanel7);
            btnPanel4.add(btnpanel8);

            Color blue1 = new Color(3,173,252);
            JPanel blanc = new JPanel();
            JPanel blank = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel blank1 = new JPanel();
            blank.setPreferredSize(new Dimension(50, 300));
            blanc.setPreferredSize(new Dimension(600, 150));
            blank1.setPreferredSize(new Dimension(50, 300));
            JTextArea blue = new JTextArea("\n\n\n\n\n\n\n\n                                                                            Button1");
            JTextArea red = new JTextArea("\n\n\n\n\n\n\n\n                                                                            Button2");
            JTextArea green = new JTextArea("\n\n\n\n\n\n\n\n                                                                            Button3");
            JTextArea yellow = new JTextArea("\n\n\n\n\n\n\n\n                                                                            Button4");
            blue.setBackground(blue1);
            red.setBackground(Color.red);
            green.setBackground(Color.green);
            yellow.setBackground(Color.yellow);
            blue.setPreferredSize(new Dimension(500,300));
            panel1.add(blue, BorderLayout.CENTER);
            panel2.add(red, BorderLayout.CENTER);
            panel3.add(green, BorderLayout.CENTER);
            panel4.add(yellow, BorderLayout.CENTER);

            JButton btn1 = new JButton("Display Card 1");
            JButton btn2 = new JButton("Display Card 2");
            JButton btn3 = new JButton("Display Card 3");
            JButton btn4 = new JButton("Display Card 4");
            JButton next = new JButton("Next");
            JButton previous = new JButton("Previous");

            JButton btn11 = new JButton("Display Card 1");
            JButton btn21 = new JButton("Display Card 2");
            JButton btn31 = new JButton("Display Card 3");
            JButton btn41 = new JButton("Display Card 4");
            JButton next1 = new JButton("Next");
            JButton previous1 = new JButton("Previous");

            JButton btn12 = new JButton("Display Card 1");
            JButton btn22 = new JButton("Display Card 2");
            JButton btn32 = new JButton("Display Card 3");
            JButton btn42 = new JButton("Display Card 4");
            JButton next2 = new JButton("Next");
            JButton previous2 = new JButton("Previous");

            JButton btn13 = new JButton("Display Card 1");
            JButton btn23 = new JButton("Display Card 2");
            JButton btn33 = new JButton("Display Card 3");
            JButton btn43 = new JButton("Display Card 4");
            JButton next3 = new JButton("Next");
            JButton previous3 = new JButton("Previous");

            CardLayout cardLayout = new CardLayout();
            panel.setLayout(cardLayout);
            btnpanel1.add(previous);
            btnpanel1.add(next);
            btnpanel2.add(btn1);
            btnpanel2.add(btn2);
            btnpanel2.add(btn3);
            btnpanel2.add(btn4);

            btnpanel3.add(previous1);
            btnpanel3.add(next1);
            btnpanel4.add(btn11);
            btnpanel4.add(btn21);
            btnpanel4.add(btn31);
            btnpanel4.add(btn41);

            btnpanel5.add(previous2);
            btnpanel5.add(next2);
            btnpanel6.add(btn12);
            btnpanel6.add(btn22);
            btnpanel6.add(btn32);
            btnpanel6.add(btn42);

            btnpanel7.add(previous3);
            btnpanel7.add(next3);
            btnpanel8.add(btn13);
            btnpanel8.add(btn23);
            btnpanel8.add(btn33);
            btnpanel8.add(btn43);

            btnPanel.setPreferredSize(new Dimension(600, 100));
            btnPanel2.setPreferredSize(new Dimension(600, 100));
            btnPanel3.setPreferredSize(new Dimension(600, 100));
            btnPanel4.setPreferredSize(new Dimension(600, 100));

            JPanel blanc1 = new JPanel();
            JPanel blank2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel blank3 = new JPanel();
            blank2.setPreferredSize(new Dimension(50, 300));
            blanc1.setPreferredSize(new Dimension(600, 150));
            blank3.setPreferredSize(new Dimension(50, 300));

            JPanel blanc2 = new JPanel();
            JPanel blank4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel blank5 = new JPanel();
            blank4.setPreferredSize(new Dimension(50, 300));
            blanc2.setPreferredSize(new Dimension(600, 150));
            blank5.setPreferredSize(new Dimension(50, 300));

            JPanel blanc3 = new JPanel();
            JPanel blank6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel blank7 = new JPanel();
            blank6.setPreferredSize(new Dimension(50, 300));
            blanc3.setPreferredSize(new Dimension(600, 150));
            blank7.setPreferredSize(new Dimension(50, 300));

        
        }
        class Handler implements ActionListener{public void actionPerformed(ActionEvent e){}}
    }
}