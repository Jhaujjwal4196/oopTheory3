import javax.swing.JFrame;
import javax.swing.JLabel;

import jdk.internal.org.jline.terminal.MouseEvent;

import java.awt.*;


 public class  gui extends JFrame{
private String details;
private JLabel statusbar;
 public gui(){
     super ("Title");
     statusbar = new JLabel("This is default");
     add(statusbar, BorderLayout.SOUTH);
     addMouseListener(new MouseClass());


 }
 private MouseClass extends MouseAdapter {
public void mouseClicked(MouseEvent event){
details= String.format("You clicked %d",event.getClickCount);
if(event.isMetaDown())
details += "you have clicked the right button";
else if (event.isAltDown())
details+= "clicked with wwither centre option";
else
details += "left mouse button clicked";
statusbar.setText(details);
 }

}}
 public class AdapterClass{
     public static void main(String[] args) {
         gui go= new gui();
         go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         go.setSize(300,400);
         go.setVisible(true);
     }
 }