package com.careerit.jfs.cj.day18;
abstract class HttpServlet{

      public abstract void doGet();
      public abstract void doPost();
      public abstract void init();
      public abstract void destroy();
      public void service(){
          doGet();
      }
}
abstract class MyServlet extends HttpServlet{
  public void doGet(){

  }
}
class MySuperServlet extends MyServlet{

  @Override
  public void doPost() {

  }

  @Override
  public void init() {

  }

  @Override
  public void destroy() {

  }
}
public class AbstractManager {

  public static void main(String[] args) {

  }
}
