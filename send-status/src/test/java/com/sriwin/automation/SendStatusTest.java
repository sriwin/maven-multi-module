package com.sriwin.automation;

import com.sriwin.automation.test.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendStatusTest extends BaseTest {
  private static final String MODULE_NAME = "SendStatusTest";

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

  @Test(priority = 999)
  public void runModule1Test() {
    try {
      /*System.out.println("Module Name = "+MODULE_NAME);
      int cnt = 0;
      boolean flag = false;
      TestManager testManager = TestManager.getInstance();
      for (int i = 0; i < 7; i++) {
        int configMapCount = testManager.getTestConfigMapSize();
        System.out.println("Checking ConfigMapCount = " + configMapCount);
        if (configMapCount == 0) {
          cnt++;
        }
        TimeUnit.MINUTES.sleep(1);

        if (cnt > 2) {
          break;
        }
      }

      if (cnt > 0) {
        System.out.println("Send status");
      }*/

      System.out.println("Send status");

    } catch (Exception e) {
    }
  }
}