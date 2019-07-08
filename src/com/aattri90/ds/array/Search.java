package com.aattri90.ds.array;

public class Search {

  /**
   * @question // TODO : add the description
   * @link
   * @param arr input array
   * @param searchElement element to be searched
   * @return index of search element if present, else returns -1
   *
   */
  public int linearSearch(int[] arr, int searchElement) {

    int notFound = -1;
    int n = arr.length;
    if (arr == null || n == 0) {
      return notFound;
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] == searchElement) {
        return i;
      }
    }

    return notFound;
  }

  public static void main(String[] args) {
    Search search = new Search();
    int[] arr = new int[] {1, 2, 3, 4, 5};
    int searchIndex = search.linearSearch(arr, 4);
    System.out.println(searchIndex);
  }

}
