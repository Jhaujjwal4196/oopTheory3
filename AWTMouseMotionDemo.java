import java.awt.*;
import java.awt.event.*;

// import jdk.internal.org.jline.terminal.MouseEvent;
// import jdk.internal.org.objectweb.asm.Label;

//import org.w3c.dom.Text;

public class AWTMouseMotionDemo extends Frame {
    private Label lb1,lb1p,lb2,lb2p;
    private TextField tf1,tf1p,tf2,tf2p;
  AWTMouseMotionDemo(){
      setLayout(new FlowLayout());
      lb1= new Label("X-Click");
      lb2= new Label("Y-click");
      lb1p= new Label("X-Click Pos");
      lb2p= new Label("Y-Click Pos");

      tf1= new TextField("",9);
      tf1p= new TextField("",9);
      tf2= new TextField("",15);
      tf2p= new TextField("",9);

      add(lb1);
      add(tf1);
      add(lb2);
      add(tf2);
      add(lb1p);
      add(tf1p);
      add(lb2p);
      add(tf2p);

      addMouseListener(new MouseAdapter(){
       @Override
       public void mouseClicked(MouseEvent e){
        tf1.setText(e.getX()+"");
        tf2.setText(e.getY()+"");
       }
      });

      addMouseMotionListener(new MouseAdapter(){
          @Override
          public void mouseMoved(MouseEvent e){
              tf1p.setText(e.getX()+"");
              tf2p.setText(e.getY()+"");
          }
      });

     addWindowListener(new WindowAdapter(){
         @Override
         public void windowClosing(WindowEvent e){
             System.exit(0);
         }
     });
     setTitle("Jha's MouseEventDemo");
     setSize(400,400);
     setVisible(true);
  }
  public static void main(String[] args) {
      new AWTMouseMotionDemo();
  }

    
}
