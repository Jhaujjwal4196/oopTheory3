import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class Saccumulator extends JFrame{
     JLabel lb1,lb2;
     JTextField tf1,tf2;
     int sum=0;
     Saccumulator(){

        Container cp= getContentPane();
        cp.setLayout(new FlowLayout());
        setLayout(new FlowLayout());
     lb1= new JLabel("Enter the Integer you wanna accumulate:");
     tf1= new JTextField("",10);
     lb2= new JLabel("The Accumulated sum is:");
     tf2= new JTextField(""+sum,20);
      tf2.setEditable(false);

      cp.add(lb1);
      cp.add(tf1);
      cp.add(lb2);
      cp.add(tf2);
      

      tf1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              sum+=Integer.parseInt(tf1.getText());
              tf2.setText(""+sum);
              tf1.setText("");

          }
      });
      setTitle("Jha's Swing Accumulator");
      setSize(500,200);
      setVisible(true);

     }
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable(){
             @Override
             public void run(){
                 new Saccumulator();
             }
         });
     }

 }