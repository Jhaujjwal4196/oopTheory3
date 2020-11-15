import java.awt.*;
import java.awt.event.*;

//import jdk.internal.org.objectweb.asm.Label;

public class Counter extends Frame {
 TextField tf1;
 Button bt1;
 Label lb1;
int count =0;
 Counter(){

    setLayout(new FlowLayout());
     tf1= new TextField(""+count,10);
     lb1= new Label("Counter");
     bt1= new Button("Count");
     tf1.setEditable(false);

     add(lb1);
     add(tf1);
     add(bt1);

     bt1.addActionListener(new ActionListener(){
           @Override
        public void actionPerformed(ActionEvent e){
            count++;
            tf1.setText(""+count);

        }

     });
     addWindowListener(new WindowAdapter(){
         @Override
         public void windowClosing(WindowEvent e){
             System.exit(0);
         }
     });
 setTitle("Jha's Counter");
 setSize(550,100);
 setVisible(true);
 }
 public static void main(String[] args) {
     new Counter();
 }
    
}
