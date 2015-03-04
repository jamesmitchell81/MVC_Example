package eb.models;

import eb.util.*;
import java.util.*;

public class ServiceStandardModel implements ServiceModelInterface
{
  protected ArrayList<ObserverInterface> observers = new ArrayList();
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
    notifyObservers();
  }

  public void addTyreChange()
  {
    cost += service.getTyreChangeCost();
    notifyObservers();
  }

  public void addPaintRespray()
  {
    cost += service.getPaintResprayCost();
    notifyObservers();
  }

  public void addMOT()
  {
    cost += service.getMOTCost();
    notifyObservers();
  }

  public void addFullService()
  {
    cost += service.getFullServiceCost();
    notifyObservers();
  }

  public void addReplaceExhaust()
  {
    cost += service.getReplaceExhaustCost();
    notifyObservers();
  }

  public double getTotalCost()
  {
    System.out.println(cost * vat);
    return cost * vat;
  }

  public void addObserver(ObserverInterface obs)
  {
    observers.add(obs);
  }

  public void removeObserver(ObserverInterface obs)
  {
    int i = observers.indexOf(obs);
    if ( i >= 0 )
      observers.remove(i);
  }

  public void notifyObservers()
  {
    for ( int i = 0; i < observers.size(); i++ )
    {
      ObserverInterface obs = (ObserverInterface)observers.get(i);
      obs.update();
    }
  }

}
