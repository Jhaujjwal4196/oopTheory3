import java.awt.*;
//import java.util.*;
import java.awt.event.*;
public class Accumulator extends Frame{
    private Label lb1,lb2;
    private TextField tf1,tf2;
    int sum=0;
    Accumulator(){
        setLayout(new FlowLayout());
        tf1= new TextField("",15);
        lb1= new Label("Enter the integer you wanna acummulate:");
        lb2= new Label("The Accumulated sum is");
        tf2=new TextField(""+sum,10);
        tf2.setEditable(false);
         
        
       add(lb1)
;
add(tf1);
add(lb2);
add(tf2);

tf1.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e){
     sum+= Integer.parseInt(tf1.getText());
     tf2.setText(""+sum);
     tf1.setText("");
    }
});

addWindowListener(new WindowAdapter(){
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
});

setTitle("Jha's Accumulator");
setSize(500,200);
setVisible(true);
    }
    public static void main(String[] args) {
        new Accumulator();

    }

}