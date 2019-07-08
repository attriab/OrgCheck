package com.aattri90.ds.array;

import static org.testng.Assert.assertEquals;

import com.aattri90.model.PositionalInteger;
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

  @Test
  public void testBinarySearch1() {

    PositionalInteger[] arr = new PositionalInteger[]{
        new PositionalInteger(0, 0), new PositionalInteger(1, -4),
        new PositionalInteger(2, 12), new PositionalInteger(3, 10),
        new PositionalInteger(4, 22), new PositionalInteger(5, -100),
        new PositionalInteger(6, 21)};
    int searchElement = -100;
    int expectedSearchIndex = 5;
    assertEquals(search.binarySearch(arr, searchElement), expectedSearchIndex);

  }

  @Test
  public void testBinarySearch2() {

    PositionalInteger[] arr = new PositionalInteger[]{
        new PositionalInteger(0, 0), new PositionalInteger(1, -4),
        new PositionalInteger(2, 12), new PositionalInteger(3, 10),
        new PositionalInteger(4, 22), new PositionalInteger(5, -100),
        new PositionalInteger(6, 21)};    int searchElement = 44;
    int expectedSearchIndex = -1;
    assertEquals(search.binarySearch(arr, searchElement), expectedSearchIndex);

  }



}