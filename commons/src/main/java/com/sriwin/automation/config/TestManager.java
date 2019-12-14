package com.sriwin.automation.config;

import java.util.HashMap;
import java.util.Map;

public class TestManager {
  private static Map<String, String> testConfigMap = null;
  private static TestManager ourInstance = new TestManager();

  private TestManager() {
    testConfigMap = new HashMap<>();
  }

  public static TestManager getInstance() {
    return ourInstance;
  }

  public int getTestConfigMapSize() {
    return testConfigMap.size();
  }

  public void addConfigProperty(String key, String value) {
    testConfigMap.put(key, value);
  }

  public void removeConfigProperty(String key) {
    testConfigMap.remove(key);
  }
}