package eb.models;

    // Oil Change - £26
    // Tyre Change - £40
    // Paint Respray (Per panel) - £100
    // M.O.T. - £54
    // Full service - £150
    // Replacement Exhaust - £52

public class Service
{
  private double oilChange;
  private double tyreChange;
  private double paintRespray;
  private double mot;
  private double fullService;
  private double replaceExhaust;

  public Service()
  {
    this.oilChange = 26.0;
    this.tyreChange = 40.0;
    this.paintRespray = 100.0;
    this.mot = 54.0;
    this.fullService = 150.0;
    this.replaceExhaust = 52.0;
  }

  // getters and setters.
}