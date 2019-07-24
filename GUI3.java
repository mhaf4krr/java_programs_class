import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        int red = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        Color newColor =  new Color(red, green, blue);
        g.setColor(newColor);
        g.fillOval(50, 50, 100, 100);
    }
}

public class GUI3 {
    JButton colorButton;
    JButton labelButton;
    JLabel label;
    DrawPanel mydraw;



    class ColorListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            mydraw.repaint();
        }

    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            label.setText("Label Changed");
        }
    }
    public static void main(String[] args){
        GUI3 gui = new GUI3();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        colorButton = new JButton();
        colorButton.setText("Change Color");

        labelButton = new JButton();
        labelButton.setText("Change Label");

        label = new JLabel();
        label.setText("The Originals");

        mydraw =  new DrawPanel();

        colorButton.addActionListener(new ColorListener() );
        labelButton.addActionListener(new LabelListener());

        frame.getContentPane().add(BorderLayout.CENTER,mydraw);
        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.EAST,label);
        frame.getContentPane().add(BorderLayout.WEST,labelButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

    }
}