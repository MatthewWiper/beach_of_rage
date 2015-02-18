package assignment_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{

  JPanel pane = new JPanel();
  public gui(){
    super("test frame"); setBounds(100,100,300,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane();
    con.add(pane);

    setVisible(true);
  }
}
