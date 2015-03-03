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
    ServiceModel sm = new ServiceModel();
    ServiceView sv = new ServiceView(sm);
    ServiceController sc = new ServiceController(sm, sv);

    BaseFrame bf = BaseFrame.getBaseFrame();
    Container window = bf.getContentPane();

    window.add(sv);

    bf.pack();
    bf.setVisible(true);
  }
}