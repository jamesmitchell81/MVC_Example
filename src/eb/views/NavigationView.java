package eb.views;

import javax.swing.*;
import java.awt.*;

public class NaviationView
{
  private JButton standard;
  private JButton business;
  private JButton admin;

  private NaviationController controller;

  public NaviationView(NaviationController controller)
  {
    this.controller = controller;
    this.setLayout(new GridLayout(0, 3));
  }

  private void createView()
  {
    standard = new JButton("Standard Customer");
    standard.setHorizontalAlignment(SwingConstants.LEFT);
    standard.addActionListener(controller);
    standard.setActionCommand("Set Standard Customer");

    business = new JButton("Business Customer");
    business.setHorizontalAlignment(SwingConstants.LEFT);
    business.addActionListener(controller);
    business.setActionCommand("Set Business Customer");

    admin = new JButton("Do Admin");
    admin.setHorizontalAlignment(SwingConstants.LEFT);
    admin.addActionListener(controller);
    admin.setActionCommand("Do Admin");

    this.add(standard);
    this.add(business);
    this.add(admin);
  }

}
