
package com.suresh.java8.lambdabasics;

/**
 * speed runner test program.
 * 
 * @author Suresh Y
 *
 */

public class SpeedRunnerTest {

  /**
   * method to test lambda.
   * @param fastRunner .
   * @param runner .
   */
  public void testRunner(FastRunner fastRunner, Runner runner) {
    if (fastRunner.testSpeed(runner)) {
      System.out.println(runner.getName() + " Congratulations! you are speed runner.");
    } else {
      System.out.println(runner.getName() + " Better luck next time.");
    }
  }

  /**
   * main method.
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    SpeedRunnerTest speedRunnerTest = new SpeedRunnerTest();

    speedRunnerTest.testRunner(a -> a.isSpeedRunner(), new Runner("suresh", 150));
    speedRunnerTest.testRunner(a -> a.isSpeedRunner(), new Runner("usen bolt", 40));

  }

}
