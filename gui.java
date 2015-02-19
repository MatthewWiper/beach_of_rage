package assignment_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{

  JPanel pane = new JPanel();
  testLabel = new JLabel("test");
  public gui(){
    super("test frame");
	
	setSize(300,200);
	setLocation(10,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane();
    con.setLayout(null);
	con.add(pane);
	con.add(testLabel);

    setVisible(true);
  }
}
