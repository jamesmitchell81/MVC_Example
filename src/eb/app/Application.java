package eb.app;

import eb.ui.*;
import eb.models.*;
import eb.controllers.*;
import eb.views.*;

public class Application
{

  public static void main(String[] args)
  {
    ServiceModel sm = new ServiceModel();
    ServiceView sv = new ServiceView(sm);
    ServiceController sc = new ServiceController(sm, sv);


  }
}