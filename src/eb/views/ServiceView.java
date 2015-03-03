package eb.views;

// Oil Change - £26
// Tyre Change - £40
// Paint Respray (Per panel) - £100
// M.O.T. - £54
// Full service - £150
// Replacement Exhaust - £52

public class ServicePanel extends JPanel implements ServiceObserver
{
  private JButton oilChange = new JButton("Oil Change");
  private JButton tyreChange = new JButton("Tyre Change");;
  private JButton paintRespray = new JButton("Paint Respray");;
  private JButton mot = new JButton("MOT");;
  private JButton fullService = new JButton("Full Service");;
  private JButton replaceExhaust = new JButton("Replace Exhaust");;

  private ServiceModel model;

  // serviceModel
  public ServicePanel(Service sm)
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
