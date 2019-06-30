package com.aattri90.ds.array;

public class Rotation {

  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>clockwise</b>
   * @link https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
   * @time-complexity O(n * d)
   */
  void rotateArrayCyclicUsingTempVar(int[] arr, int d) {

    if (arr == null) {
      return;
    }
    int temp, arrLength = arr.length;
    d = d % arrLength;
    while (d > 0) {
      temp = arr[arrLength - 1];
      System.arraycopy(arr, 0, arr, 1, arrLength - 1);
      arr[0] = temp;
      d--;
    }

  }

  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>clockwise</b>
   * @link https://www.geeksforgeeks.org/array-rotation/
   * @time-complexity O(n)
   * @space-complexity O(d)
   */
  int[] rotateArrayCyclicUsingTempArray(int[] arr, int d) {

    if (arr == null) {
      return arr;
    }
    int arrLength = arr.length;
    d = d % arrLength;
    int[] rotatedArr = new int[arrLength];
    System.arraycopy(arr, 0, rotatedArr, d, arrLength - d);
    System.arraycopy(arr, arrLength - d, rotatedArr, 0, d);
    arr = rotatedArr;
    return arr;
  }

  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>anti-clockwise</b>
   * @link https://www.geeksforgeeks.org/array-rotation/
   * @time-complexity O(n)
   * @space-complexity O(1)
   */
  void rotateArrayAcyclicUsingJugglingAlgorithm(int[] arr, int d) {

    if (arr == null) {
      return;
    }
    int n = arr.length;
    d = d % n;
    int i, j, k, temp;

    for (i = 0; i < gcd(n, d); i++) {

      temp = arr[i];
      j = i;

      while (true) {
        k = j + d;
        if (k >= n) {
          k = k - n;
        }
        if (k == i) {
          break;
        }
        arr[j] = arr[k];
        j = k;
      }
      arr[j] = temp;
    }

  }

  private int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }


  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>anti-clockwise</b>
   * @link https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
   * @time-complexity O(n)
   */
  void rotateArrayAcyclicUsingSubReverse(int[] arr, int d) {

    if (arr == null) {
      return;
    }
    int n = arr.length;
    d = d % n;
    reverseArray(arr, 0, d - 1);
    reverseArray(arr, d, n - 1);
    reverseArray(arr, 0, n - 1);

  }

  /**
   * @param arr input array
   * @param d rotation count
   * @question Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
   * <b>clockwise</b>
   * @link https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
   * @time-complexity O(n)
   */
  void rotateArrayCyclicUsingSubReverse(int[] arr, int d) {

    if (arr == null) {
      return;
    }
    int n = arr.length;
    d = d % n;
    reverseArray(arr, n - d, n - 1);
    reverseArray(arr, 0, n - d - 1);
    reverseArray(arr, 0, n - 1);

  }

  private void reverseArray(int[] arr, int start, int end) {

    if (arr == null) {
      return;
    }
    int temp;
    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

  }

}

