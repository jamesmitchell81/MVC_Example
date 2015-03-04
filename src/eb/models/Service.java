package eb.models;

public class Service
{
  // public only for example.
  public double oilChange;
  public double tyreChange;
  public double paintRespray;
  public double mot;
  public double fullService;
  public double replaceExhaust;

  public Service()
  {
    // get real data.

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