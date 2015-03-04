package eb.views;

import eb.models.*;
import eb.util.*;
import eb.controllers.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ServiceAdminView extends JPanel implements ObserverInterface
{
  protected JTextField oilChange;
  protected JTextField tyreChange;
  protected JTextField paintRespray;
  protected JTextField mot;
  protected JTextField fullService;
  protected JTextField replaceExhaust;

  protected JButton updateValues;

  protected ServiceModelInterface model;
  protected ServiceAdminController controller;

  public ServiceAdminView(ServiceModelInterface sm)
  {
    this.model = sm;
    this.model.addObserver((ObserverInterface)this);
    this.controller = new ServiceAdminController(this.model);

    this.setLayout(new GridLayout(9, 2));
    this.setSize(new Dimension(400, 500));

    this.createView();
  }

  public void update()
  {
    Service s = this.model.getService();

    oilChange.setText("" + s.getOilChangeCost());
    tyreChange.setText("" + s.getTyreChangeCost());
    paintRespray.setText("" + s.getPaintResprayCost());
    mot.setText("" + s.getMOTCost());
    fullService.setText("" + s.getFullServiceCost());
    replaceExhaust.setText("" + s.getReplaceExhaustCost());
  }

  private void createView()
  {
    Service s = this.model.getService();

    oilChange = new JTextField("" + s.getOilChangeCost());
    tyreChange = new JTextField("" + s.getTyreChangeCost());
    paintRespray = new JTextField("" + s.getPaintResprayCost());
    mot = new JTextField("" + s.getMOTCost());
    fullService = new JTextField("" + s.getFullServiceCost());
    replaceExhaust = new JTextField("" + s.getReplaceExhaustCost());

    updateValues = new JButton("Update Values");
    updateValues.addActionListener((ActionListener)this.controller);
    updateValues.setActionCommand("Update Values");

    this.add(new JLabel("Oil Change"));
    this.add(oilChange);

    this.add(new JLabel("Tyre Change"));
    this.add(tyreChange);

    this.add(new JLabel("Paint Respray"));
    this.add(paintRespray);

    this.add(new JLabel("MOT"));
    this.add(mot);

    this.add(new JLabel("Full Service"));
    this.add(fullService);

    this.add(new JLabel("Replace Exhaust"));
    this.add(replaceExhaust);

    this.add(updateValues);
  }

  private class ServiceAdminController implements ActionListener
  {
    private ServiceModelInterface model;

    public ServiceAdminController(ServiceModelInterface model)
    {
      this.model = model;
    }

    public void actionPerformed(ActionEvent eve)
    {
      String cmb = eve.getActionCommand();

      if ( cmb == "Update Values" )
      {
        Service s = new Service();

        this.model.updateServicePrices(s);
      }
    }
  }

}