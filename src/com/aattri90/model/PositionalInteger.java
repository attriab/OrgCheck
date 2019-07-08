package com.aattri90.model;

public class PositionalInteger implements Comparable<PositionalInteger> {

  private int position;
  private int value;

  public PositionalInteger(int position, int value) {
    this.position = position;
    this.value = value;
  }

  public int getPosition() {
    return position;
  }

  public int getValue() {
    return value;
  }

  public int compareTo(PositionalInteger o) {
    return this.getValue() - o.getValue();
  }

}
