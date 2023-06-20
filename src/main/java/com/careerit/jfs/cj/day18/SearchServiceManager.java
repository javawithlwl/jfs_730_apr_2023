package com.careerit.jfs.cj.day18;

interface SearchService {
  int search(int[] arr,int ele);
}

class BinarySearchService implements SearchService{

  @Override
  public int search(int[] arr, int ele) {
    return 0;
  }
}
class LinearSearchService implements SearchService{

  @Override
  public int search(int[] arr, int ele) {
    return 0;
  }
}

class NumberSearch{
      public int search(int[] arr,int ele,SearchService service){
          return service.search(arr,ele);
      }
}
public class SearchServiceManager {

  public static void main(String[] args) {
        NumberSearch obj = new NumberSearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ele = 5;
        int index = obj.search(arr,ele,new LinearSearchService());
        System.out.println("Element :"+ele+" found at :"+index);
  }
}
