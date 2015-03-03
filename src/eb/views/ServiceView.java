package eb.views;

import eb.models.*;

import javax.swing.*;

public class ServiceView extends JPanel implements ServiceObserver
{
  private JButton oilChange = new JButton("Oil Change");
  private JButton tyreChange = new JButton("Tyre Change");;
  private JButton paintRespray = new JButton("Paint Respray");;
  private JButton mot = new JButton("MOT");;
  private JButton fullService = new JButton("Full Service");;
  private JButton replaceExhaust = new JButton("Replace Exhaust");

  private ServiceModel model;

  // serviceModel
  public ServiceView(ServiceModel sm)
  {
    this.model = sm;

    this.add(oilChange);
    this.add(tyreChange);
    this.add(paintRespray);
    this.add(mot);
    this.add(fullService);
    this.add(replaceExhaust);
  }
}
