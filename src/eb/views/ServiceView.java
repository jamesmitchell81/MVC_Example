package eb.views;

import eb.models.*;
import eb.util.*;
import eb.controllers.*;

import javax.swing.*;
import java.awt.*;

public class ServiceView extends JPanel implements ObserverInterface
{
  private JButton oilChange;
  private JButton tyreChange;
  private JButton paintRespray;
  private JButton mot;
  private JButton fullService;
  private JButton replaceExhaust;
  private JLabel display;

  private ServiceModelInterface model;
  private ServiceController controller;

  public ServiceView(ServiceModelInterface sm, ServiceController sc)
  {
    this.model = sm;
    this.model.addObserver((ObserverInterface)this);
    this.controller = sc;

    this.setLayout(new GridLayout(9, 0));
    this.setSize(new Dimension(400, 500));
    this.createView();
  }

  public void update()
  {
    double cost = model.getTotalCost();
    this.display.setText("Cost:" + cost);
  }

  private void createView()
  {
    this.oilChange = new JButton("Oil Change");
    this.oilChange.setHorizontalAlignment(SwingConstants.LEFT);
    this.oilChange.addActionListener(this.controller);
    this.oilChange.setActionCommand("Add Oil Change");

    this.tyreChange = new JButton("Tyre Change");
    this.tyreChange.setHorizontalAlignment(SwingConstants.LEFT);
    this.oilChange.addActionListener(this.controller);
    this.oilChange.setActionCommand("Add Tyre Change");

    this.paintRespray = new JButton("Paint Respray");
    this.paintRespray.setHorizontalAlignment(SwingConstants.LEFT);
    this.paintRespray.addActionListener(this.controller);
    this.paintRespray.setActionCommand("Add Paint Respray");

    this.mot = new JButton("MOT");
    this.mot.setHorizontalAlignment(SwingConstants.LEFT);
    this.mot.addActionListener(this.controller);
    this.mot.setActionCommand("Add MOT");

    this.fullService = new JButton("Full Service");
    this.fullService.setHorizontalAlignment(SwingConstants.LEFT);
    this.fullService.addActionListener(this.controller);
    this.fullService.setActionCommand("Add Full Service");

    this.replaceExhaust = new JButton("Replace Exhaust");
    this.replaceExhaust.setHorizontalAlignment(SwingConstants.LEFT);
    this.replaceExhaust.addActionListener(this.controller);
    this.replaceExhaust.setActionCommand("Add Replace Exhaust");

    this.display = new JLabel();
    this.display.setHorizontalAlignment(SwingConstants.LEFT);

    this.add(oilChange);
    this.add(tyreChange);
    this.add(paintRespray);
    this.add(mot);
    this.add(fullService);
    this.add(replaceExhaust);
    this.add(display);
  }
}
