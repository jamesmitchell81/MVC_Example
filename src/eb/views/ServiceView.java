package eb.views;

import eb.models.*;

import javax.swing.*;
import java.awt.*;

// for a customer request a service.
public class ServiceView extends JPanel// implements ServiceObserver
{
  private JButton oilChange;
  private JButton tyreChange;
  private JButton paintRespray;
  private JButton mot;
  private JButton fullService;
  private JButton replaceExhaust;
  private JLabel display;

  private ServiceModel model;

  // serviceModel
  public ServiceView(ServiceModel sm)
  {
    this.model = sm;

    this.setLayout(new GridLayout(7, 0));
    this.createView();
  }

  private void createView()
  {

    this.oilChange = new JButton("Oil Change");
    this.oilChange.setHorizontalAlignment(SwingConstants.LEFT);
    this.tyreChange = new JButton("Tyre Change");
    this.tyreChange.setHorizontalAlignment(SwingConstants.LEFT);
    this.paintRespray = new JButton("Paint Respray");
    this.paintRespray.setHorizontalAlignment(SwingConstants.LEFT);
    this.mot = new JButton("MOT");
    this.mot.setHorizontalAlignment(SwingConstants.LEFT);
    this.fullService = new JButton("Full Service");
    this.fullService.setHorizontalAlignment(SwingConstants.LEFT);
    this.replaceExhaust = new JButton("Replace Exhaust");
    this.replaceExhaust.setHorizontalAlignment(SwingConstants.LEFT);
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
