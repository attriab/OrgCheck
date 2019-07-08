package com.aattri90.ds.array;

import com.aattri90.model.PositionalInteger;
import java.util.Arrays;
import java.util.Collections;

public class Search {

  private static final int NOT_FOUND = -1;
  /**
   * @param arr input array
   * @param searchElement element to be searched
   * @return index of search element if present, else returns -1
   * @question // TODO : add the description
   * @link
   */
  int linearSearch(int[] arr, int searchElement) {

    if (arr == null || arr.length == 0) {
      return NOT_FOUND;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == searchElement) {
        return i;
      }
    }

    return NOT_FOUND;
  }


  /**
   * @param arr input array
   * @param searchElement element to be searched
   * @param start start index for nbinary search
   * @param end end index for nbinary search
   * @return index of search element if present, else returns -1
   * @question // TODO : add the description
   * @link
   */
  private int binarySearch(PositionalInteger[] arr, int searchElement, int start, int end) {

    if (start > end) {
      return NOT_FOUND;
    }

    int mid = (start + end) / 2;

    if (searchElement > arr[mid].getValue()) {
      return binarySearch(arr, searchElement, mid + 1, end);
    } else if (searchElement < arr[mid].getValue()) {
      return binarySearch(arr, searchElement, 0, mid - 1);
    } else {
      return arr[mid].getPosition();
    }

  }

  int binarySearch(PositionalInteger[] arr, int searchElement) {

    if (arr == null || arr.length == 0) {
      return NOT_FOUND;
    }
    Arrays.sort(arr);
    return binarySearch(arr, searchElement, 0, arr.length - 1);

  }

}
