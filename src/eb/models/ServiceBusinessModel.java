package eb.models;

public class ServiceBusinessModel extends ServiceStandardModel implements  ServiceModelInterface
{
  public ServiceBusinessModel()
  {
    super();
  }

  public double getTotalCost()
  {
    return cost;
  }

}