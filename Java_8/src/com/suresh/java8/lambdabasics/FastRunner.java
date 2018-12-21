
package com.suresh.java8.lambdabasics;

/**
 * this interface test method(functional descriptor).
 * 
 * @author Suresh Y
 *
 */

@FunctionalInterface
public interface FastRunner {

  public abstract boolean testSpeed(Runner runner);
}
