package eb.controllers;

import eb.ui.*;
import eb.models.*;
import eb.views.*;

import java.awt.event.*;
import java.awt.*;

private class ServiceAdminController implements ActionListener
{
  public ServiceAdminController()
  {

  }

  public void actionPerformed(ActionEvent eve)
  {

    if ( cmb == "Do Admin" )
    {
      ServiceModelInterface sm = new ServiceStandardModel();
      ServiceController sc = new ServiceController(sm);
      ServiceAdminView view = new ServiceAdminView(sm, sc);

      bf.add(nv, BorderLayout.WEST);
      bf.add(view, BorderLayout.EAST);
      bf.repaint();
      bf.revalidate();
    }
  }
}