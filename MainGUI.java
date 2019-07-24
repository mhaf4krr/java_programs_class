import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;

import javax.swing.*;;

public class MainGUI{
    int x=100;
    int y=100;
    DrawPanel mydraw;
    public static void main(String[] args){
        MainGUI gui = new MainGUI();
        gui.start();
    }

    public void start(){
        JFrame frame =  new JFrame();
        mydraw = new DrawPanel();
        frame.getContentPane().add(mydraw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
        mydraw.animate();
    }

    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.ORANGE);
            g.fillOval(x, y,100,100);
            x++;
            y++;

        }

        public void animate(){
            for(int i=0;i<450;i++){
                try {
                    Thread.sleep(15);
                    mydraw.repaint();
                } catch (Exception e) {
                    System.out.print("Error occured ");
                }
            }
        }
    }

    
}