import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui implements ActionListener{
    JButton button;

    public static void main(String[] args){
        SimpleGui GUI = new SimpleGui();
        GUI.go();
    }

    public void go(){

        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.CENTER,button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent a){
        button.setText("I have been clicked");
    }
}