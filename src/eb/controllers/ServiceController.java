package eb.controllers;

import eb.views.*;
import eb.models.*;

import java.awt.event.*;

public class ServiceController implements ActionListener
{
  private ServiceModelInterface model;

  public ServiceController(ServiceModelInterface sm)
  {
    this.model = sm;
  }

  public void actionPerformed(ActionEvent eve)
  {
    // Object src = eve.getSource();
    String cmb = eve.getActionCommand();

    if ( cmb == "Add Oil Change" )
      this.model.addOilChange();

    if ( cmb == "Add Tyre Change" )
      this.model.addTyreChange();

    if ( cmb == "Add Paint Respray" )
      this.model.addPaintRespray();

    if ( cmb == "Add MOT" )
      this.model.addMOT();

    if ( cmb == "Add Full Service" )
      this.model.addFullService();

    if ( cmb == "Add Replace Exhaust" )
      this.model.addReplaceExhaust();

  }
}