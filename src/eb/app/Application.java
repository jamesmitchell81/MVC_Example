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
    ServiceModelInterface sm = new ServiceStandardModel();
    ServiceController sc = new ServiceController(sm);
    ServiceView sv = new ServiceView(sm, sc);

    BaseFrame bf = BaseFrame.getBaseFrame();
    Container window = bf.getContentPane();

    window.add(sv);

    bf.pack();
    bf.setVisible(true);
  }
}