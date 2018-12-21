
package com.suresh.java8.lambdabasics;

/**
 * runner class.
 * 
 * @author Suresh Y
 *
 */

public class Runner {

  private static final double MIN_SPEED_OF_FAST_RUNNER = 50;
  private String name;
  private double speed;

  /**
   * constructor for runner class.
   * 
   * @param name
   *          runner name.
   * @param speed
   *          runner speed
   */
  public Runner(String name, double speed) {
    super();
    this.name = name;
    this.speed = speed;
  }

  public boolean isSpeedRunner() {
    return this.speed >= MIN_SPEED_OF_FAST_RUNNER;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

}
