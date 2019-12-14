package com.sriwin.automation.test;

import com.sriwin.automation.config.TestManager;

public abstract class BaseTest {
  public void beforeClazz(String moduleName) {
    try {
      TestManager testManager = TestManager.getInstance();
      testManager.addConfigProperty(moduleName, moduleName);
      System.out.println("#####################################################################");
      System.out.println("#### Module Name = "+moduleName);
      System.out.println("#####################################################################");
    } catch (Exception e) {
    }
  }

  public void afterClazz(String moduleName) {
    TestManager testManager = TestManager.getInstance();
    testManager.removeConfigProperty(moduleName);
  }
}