package com.aattri90.ds.array;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class SearchTest {

  private Search search = new Search();

  @Test
  public void testLinearSearch1() {

    int[] arr = new int[] {0, -4, 12, 10, 22, -100, 21};
    int searchElement = -100;
    int expectedSearchIndex = 5;
    assertEquals(search.linearSearch(arr, searchElement), expectedSearchIndex);

  }

  @Test
  public void testLinearSearch2() {

    int[] arr = new int[] {0, -4, 12, 10, 22, -100, 21};
    int searchElement = 44;
    int expectedSearchIndex = -1;
    assertEquals(search.linearSearch(arr, searchElement), expectedSearchIndex);

  }

}