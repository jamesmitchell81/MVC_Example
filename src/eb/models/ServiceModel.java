package eb.models;

public class ServiceModel
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

  public double getTotalCost()
  {
    return cost;
  }

  public void removeService(int id)
  {

  }


}