package eb.models;

public class ServiceStandardModel implements  ServiceModelInterface
{
  protected Service service;
  protected double cost;
  private double vat = 0.175;

  public ServiceStandardModel()
  {
    service = new Service();
  }

  public void addOilChange()
  {
    cost += service.getOilChangeCost();
    // notify.
  }

  public void addTyreChange()
  {
    cost += service.getTyreChangeCost();
  }

  public void addPaintRespray()
  {
    cost += service.getPaintResprayCost();
  }

  public void addMOT()
  {
    cost += service.getMOTCost();
  }

  public void addFullService()
  {
    cost += service.getFullServiceCost();
  }

  public void addReplaceExhaust()
  {
    cost += service.getReplaceExhaustCost();
  }

  public double getTotalCost()
  {
    System.out.println(cost * vat);
    return cost * vat;
  }
}