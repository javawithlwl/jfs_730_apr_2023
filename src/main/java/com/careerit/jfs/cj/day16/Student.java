package com.careerit.jfs.cj.day16;

public final class Student {

  private final int id;
  private final String name;
  private final int section;
  private final int year;

  public Student(int id,String name,int year,int section){
      this.id = id;
      this.name = name;
      this.section = section;
      this.year = year;
  }

  public Student promote(){
        return new Student(this.id,this.name,this.year,this.section+1);
  }
  public void showDetails(){
      System.out.println("Id :"+id+" Name :"+name+" Year :"+year+" Section :"+section);
  }

}
