package eb.controllers;

import eb.ui.*;
import eb.models.*;
import eb.views.*;

import java.awt.event.*;
import java.awt.*;

public class NavigationController implements ActionListener
{
  public NavigationController()
  {

  }

  public void actionPerformed(ActionEvent eve)
  {
    String cmb = eve.getActionCommand();
    BaseFrame bf = BaseFrame.getBaseFrame();

    NavigationView nv = new NavigationView(this);

    bf.clearFrame();

    if ( cmb == "Do Admin" )
    {
      // load admin into view.
      // pass in the model.
      bf.add(nv, BorderLayout.WEST);
      bf.repaint();
      bf.revalidate();
    }

    if ( cmb == "Set Standard Customer" )
    {
      ServiceModelInterface sm = new ServiceStandardModel();
      ServiceController sc = new ServiceController(sm);
      ServiceView view = new ServiceView(sm, sc);

      bf.add(nv, BorderLayout.WEST);
      bf.add(view, BorderLayout.EAST);
      bf.repaint();
      bf.revalidate();
    }

    if ( cmb == "Set Business Customer" )
    {
      ServiceModelInterface sm = new ServiceBusinessModel();
      ServiceController sc = new ServiceController(sm);
      ServiceView view = new ServiceView(sm, sc);

      bf.add(nv, BorderLayout.WEST);
      bf.add(view, BorderLayout.EAST);
      bf.repaint();
      bf.revalidate();
    }

  }
}