import javax.swing.*;
import java.awt.event.*;

public class swing {
    public static void main(String [] args){
        JFrame f = new JFrame("Swing example");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("Click here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome the Graphical user interface");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    } 
}
