package eb.models;

public class Service
{
  private double oilChange;
  private double tyreChange;
  private double paintRespray;
  private double mot;
  private double fullService;
  private double replaceExhaust;

  private String customerName;

  public Service()
  {
    this.oilChange = 26.0;
    this.tyreChange = 40.0;
    this.paintRespray = 100.0;
    this.mot = 54.0;
    this.fullService = 150.0;
    this.replaceExhaust = 52.0;
  }

  public void getOilChangeCost()
  {
    return this.oilChange;
  }

  // getters and setters.
}