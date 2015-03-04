package eb.models;

public class ServiceModelStandard implements  ServiceModelInterface
{
  private Service service;
  private double cost;

  public ServiceModel()
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
    return cost;
  }



}