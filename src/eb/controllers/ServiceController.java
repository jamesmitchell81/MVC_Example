package eb.controllers;

import eb.views.*;
import eb.models.*;

import java.awt.event.*;

public class ServiceController implements ActionListener
{
  private ServiceModel model;

  public ServiceController(ServiceModel sm)
  {
    this.model = sm;
  }

  public void actionPerformed(ActionEvent eve)
  {
    // Object src = eve.getSource();
    String cmb = eve.getActionCommand();

    if ( cmb == "Add Oil Change" )
    {
      this.model.addOilChange();
    }

  }
}