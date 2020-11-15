// Ujjwal Kumar Jha
// 20194196
//  KeyEventDemo


import java.awt.*;
import java.awt.event.*;

//import org.graalvm.compiler.asm.Label;

public class AWTKeyEvent extends Frame {
    TextField tf1;
    TextArea ta1;
    Label lb1;
     
    AWTKeyEvent(){
        setLayout(new FlowLayout());
        lb1= new Label("Enter The Text Please:");
        tf1= new TextField("",20);
        ta1= new TextArea("",20,40);
        ta1.setEditable(false);

        add(lb1);
        add(tf1);
        add(ta1);

        

        tf1.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                ta1.append("You have typed "+ e.getKeyChar()+"\n");
            }
        });
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        setTitle("Jha's KeyEventDemo");
        setSize(500,500);
        setVisible(true);


    }
    public static void main(String[] args) {
        new AWTKeyEvent();
    }
}
