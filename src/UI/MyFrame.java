package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {
    public static void componentsGUI() {
        final JFrame f= new JFrame("Exchange Rate Program");;//creating instance of JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Exchange Rate Program");
        f.getContentPane().add(label);

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        JButton exit=new JButton("Exit");//creating instance of JButton
        exit.setBounds((width / 2),(height / 2),100, 40);//x axis, y axis, width, height

        f.add(exit);//adding button in JFrame
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setUndecorated(true);

        //f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }



    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                componentsGUI();
            }
        });
    }
}