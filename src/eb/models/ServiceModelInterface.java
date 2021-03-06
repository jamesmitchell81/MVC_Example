package eb.models;

import eb.util.*;

public interface  ServiceModelInterface
{
  void addOilChange();
  void addTyreChange();
  void addPaintRespray();
  void addMOT();
  void addFullService();
  void addReplaceExhaust();
  double getTotalCost();

  void updateServicePrices(Service s);
  Service getService();

  void addObserver(ObserverInterface obs);
  void removeObserver(ObserverInterface obs);
  void notifyObservers();
}