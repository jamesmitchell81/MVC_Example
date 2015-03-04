package eb.app;

import eb.ui.*;
import eb.models.*;
import eb.controllers.*;
import eb.views.*;

import javax.swing.*;
import java.awt.*;

public class Application
{

  public static void main(String[] args)
  {
    BaseFrame bf = BaseFrame.getBaseFrame();
    bf.setLayout(new BorderLayout());
    Container window = bf.getContentPane();

    NavigationController nc = new NavigationController();
    NavigationView nf = new NavigationView(nc);

    window.add(nf, BorderLayout.WEST);

    bf.pack();
    bf.setVisible(true);
  }
}