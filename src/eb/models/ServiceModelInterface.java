package eb.models;

public interface  ServiceModelInterface
{
  void addOilChange();
  void addTyreChange();
  void addPaintRespray();
  void addMOT();
  void addFullService();
  void addReplaceExhaust();
  double getTotalCost();

  // addObserver.
  // removeObserver.
  // notify
}