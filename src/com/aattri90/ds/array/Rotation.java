package com.aattri90.ds.array;

public class Rotation {


  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>clockwise</b>
   */
  void rotateArrayCyclicUsingTempVar(int[] arr, int d) {

    if (arr == null) {
      return;
    }
    int temp, arrLength = arr.length;
    while (d > 0) {
      temp = arr[arrLength - 1];
      for (int i = arrLength - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = temp;
      d--;
    }

  }

}
