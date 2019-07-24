import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

class DataSave implements Serializable{
    private int height;
    private int weight;
    
    DataSave(int x,int y){
        height=x;
        weight=y;
    }
}

public class GUI10 implements ActionListener{
    private JTextField weight,height;
    GUI10(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        JPanel panel = new JPanel();
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(new JLabel("Weight"));
        panel.add(weight = new JTextField());
        panel.add(new JLabel("Height"));
        panel.add(height = new JTextField());
        panel.add( new JButton("save"));
        panel.add( new JButton("restore"));

        frame.add(BorderLayout.CENTER,panel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){

    }

    public static void main(String args[]){
        new GUI10();
    }
}


