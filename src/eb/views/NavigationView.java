package eb.views;

import eb.controllers.*;

import javax.swing.*;
import java.awt.*;

public class NavigationView extends JPanel
{
  private JButton standard;
  private JButton business;
  private JButton admin;

  private NavigationController controller;

  public NavigationView(NavigationController controller)
  {
    this.controller = controller;
    this.setLayout(new GridLayout(3, 0));

    this.setSize(new Dimension(100, 500));

    createView();
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
