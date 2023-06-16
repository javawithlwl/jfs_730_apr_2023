package com.careerit.sc.lc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class FileReaderService implements InitializingBean, DisposableBean {

  @Override
  public void destroy() throws Exception {
    System.out.println("Destroy method");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("After properties set");
  }

  public void service() {
    System.out.println("Service method");
  }
}
