import javax.swing.*;
import java.util.*;

public class extending_class {
public static void main(String[] args) {
JFrame frame=new JFrame();

frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
frame.add(new JLabel("First Name"));
frame.add(new JTextField(8));
frame.add(new JLabel("MI"));
frame.add(new JTextField(1));
frame.add(new JLabel("Last Name"));
frame.add(new JTextField(8));
frame.setTitle("MY Test Frame");
frame.setSize(400, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);

}
}
