package BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinarySearch {
  public static void main(String[] args) {

    int[] list = {1,3,5,7,9};
    System.out.println(binarySearch(list,5));
    System.out.println(binarySearch(list,10));
  }

  public static int binarySearch(int[] list, int number){
    int low =0;
    int high = list.length-1;
    while (low<=high){
      int mid = low+high;
      int guess = list[mid];
      if (guess ==number){
        return mid;
      }
      if (guess>number){
        high=mid-1;
      }else {
        low = mid+1;
      }
    }
      return 0;
  }
}
