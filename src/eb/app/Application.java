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

    NavigationView nf = new NavigationView();
    Container window = bf.getContentPane();

    window.add(nf, BorderLayout.WEST);

    bf.pack();
    bf.setVisible(true);
  }
}