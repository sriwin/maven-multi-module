package com.sriwin.automation;

import com.sriwin.automation.config.TestManager;
import com.sriwin.automation.test.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Module1Test extends BaseTest {
  private static final String MODULE_NAME = "Module1Test";

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
  public void runModule1Test1() {
    try {
      System.out.println("Module 1 Test 1");
      TimeUnit.MINUTES.sleep(1);
    } catch (Exception e) {

    }
  }

  @Test
  public void runModule1Test2() {
    try {
      System.out.println("Module 1 Test 2");
      TimeUnit.MINUTES.sleep(1);
    } catch (Exception e) {

    }
  }
}
