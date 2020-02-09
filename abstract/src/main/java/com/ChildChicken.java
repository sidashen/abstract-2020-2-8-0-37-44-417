package com;

public class ChildChicken extends Chicken {

  public double getPrice() {
    return 1;
  }

  public String getType() {
    return getClass().getSimpleName();
  }

}
