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

  public double getOilChangeCost()
  {
    return this.oilChange;
  }

  public double getTyreChangeCost()
  {
    return this.tyreChange;
  }

  public double getPaintResprayCost()
  {
    return this.paintRespray;
  }

  public double getMOTCost()
  {
    return this.mot;
  }

  public double getFullServiceCost()
  {
    return this.fullService;
  }

  public double getReplaceExhaustCost()
  {
    return this.replaceExhaust;
  }
}