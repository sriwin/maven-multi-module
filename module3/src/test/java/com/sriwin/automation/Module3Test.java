package com.sriwin.automation;

import com.sriwin.automation.config.TestManager;
import com.sriwin.automation.test.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Module3Test extends BaseTest {
  private static final String MODULE_NAME = "Module3Test";

  @BeforeClass
  public void beforeClass() {
    try {
      super.beforeClazz(MODULE_NAME);
    } catch (Exception e) {
    }
  }

  @AfterClass
  public void afterClass() {
    super.afterClazz(MODULE_NAME);
  }

  @BeforeMethod
  public synchronized void beforeMethod() {
    try {
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @AfterMethod
  public void afterMethod() {
    try {
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void runModule2Test1() {
    try {
      System.out.println("Module 3 Test 1");
      TimeUnit.MINUTES.sleep(2);
    } catch (Exception e) {

    }
  }

  @Test
  public void runModule2Test2() {
    try {
      System.out.println("Module 3 Test 2");
      TimeUnit.MINUTES.sleep(1);
    } catch (Exception e) {

    }
  }

  @Test
  public void runModule2Test3() {
    try {
      System.out.println("Module 3 Test 3");
      TimeUnit.MINUTES.sleep(1);
    } catch (Exception e) {

    }
  }
}