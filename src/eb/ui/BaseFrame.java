package eb.ui;

import java.awt.*;
import javax.swing.*;

public class BaseFrame extends JFrame
{
  public static BaseFrame instance = new BaseFrame();

  private BaseFrame()
  {
    this.setSize(500, 500);
    this.setMinimumSize(new Dimension(500, 500));
    this.setLocationRelativeTo(null);
    this.setLayout(new BorderLayout());
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static BaseFrame getBaseFrame()
  {
    if (instance == null )
    {
      instance = new BaseFrame();
    }
    return instance;
  }

  public static void clearFrame()
  {
    getBaseFrame().getContentPane().removeAll();
  }

  public static int getBaseFrameWidth()
  {
    return (int)getBaseFrame().getSize().getWidth();
  }

  public static int getBaseFrameHeight()
  {
    return (int)getBaseFrame().getSize().getHeight();
  }

  public void showFrame()
  {
    instance.setVisible(true);
  }

  public void hideFrame()
  {
    instance.setVisible(false);
  }
}