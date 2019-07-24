import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class DrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.ORANGE);
        g.fillOval(70, 70, 100, 100);
    }
}

public class GUI2{
    public static void main(String args[]){
        GUI2 gui = new GUI2();
        gui.go();     
    }

    public void go(){
        JFrame frame = new JFrame();
        DrawPanel mydraw = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,mydraw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}