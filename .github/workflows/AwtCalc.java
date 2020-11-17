import java.awt.*;
import java.awt.event.*;
public class AwtCalc extends Frame implements ActionListener{
    TextField tf1;
    TextField tf2,tf3;
    Button bt1,bt2,bt3,bt4,bt5;
    AwtCalc(){
        setLayout(new FlowLayout());
        setTitle("AWT CAlciulator");
        setSize(300,400);
        setVisible(true);

        tf1= new TextField("",10);
        tf2= new TextField("",10);
        tf3= new TextField("",10);
        bt1= new Button("+");
        bt2= new Button("-");
        bt3= new Button("*");
        bt4= new Button("/");
        bt5= new Button("C");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
         
        tf1.addActionListener(this);
        tf2.addActionListener(this);
        

        // add these compnents

        add(tf1);
        add(tf2);
        add(tf3);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);

    }
    @Override
    public class actionPerformed(ActionEvent e){
    tf1.setText("");
    tf2.setText("");
    }
 public static void main(String[] args) {
     AwtCalc v = new AwtCalc();
 }
}