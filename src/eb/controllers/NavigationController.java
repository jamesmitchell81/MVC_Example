package eb.controllers;

import java.awt.event.*;

public class NavigationController implements ActionListener
{
  public NavigationController()
  {

  }

  public void actionPerformed(ActionEvent eve)
  {
    String cmb = eve.getActionCommand();

    if ( cmb == "Do Admin" )
    {
      // load admin into view.
      // pass in the model.
    }

    if ( cmb == "Set Standard Customer" )
    {
      ServiceModelInterface sm = new ServiceStandardModel();
      ServiceController sc = new ServiceController(sm);
      ServiceView sv = new ServiceView(sm, sc);

    }

    if ( cmb == "Set Business Customer" )
    {
      ServiceModelInterface sm = new ServiceBusinessModel();
      ServiceController sc = new ServiceController(sm);
      ServiceView sv = new ServiceView(sm, sc);
    }

  }
}