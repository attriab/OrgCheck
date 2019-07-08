package com.aattri90.ds.array;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class RotationTest {

  private Rotation rotationTest = new Rotation();

  @Test
  public void testRotateArrayCyclicUsingTempVar_1() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 3;
    int[] expectedRotatedArray = new int[]{5, 6, 7, 1, 2, 3, 4};
    rotationTest.rotateArrayCyclicUsingTempVar(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayCyclicUsingTempVar_2() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 7;
    int[] expectedRotatedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    rotationTest.rotateArrayCyclicUsingTempVar(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayCyclicUsingTempArray_1() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 3;
    int[] expectedRotatedArray = new int[]{5, 6, 7, 1, 2, 3, 4};
    arr = rotationTest.rotateArrayCyclicUsingTempArray(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayCyclicUsingTempArray_2() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 7;
    int[] expectedRotatedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    arr = rotationTest.rotateArrayCyclicUsingTempArray(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayAcyclicUsingJugglingAlgorithm_1() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 4;
    int[] expectedRotatedArray = new int[]{5, 6, 7, 1, 2, 3, 4};
    rotationTest.rotateArrayAcyclicUsingJugglingAlgorithm(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayAcyclicUsingJugglingAlgorithm_2() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 7;
    int[] expectedRotatedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    rotationTest.rotateArrayAcyclicUsingJugglingAlgorithm(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayAcyclicUsingSubReverse_1() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 2;
    int[] expectedRotatedArray = new int[]{3, 4, 5, 6, 7, 1, 2};
    rotationTest.rotateArrayAcyclicUsingSubReverse(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayAcyclicUsingSubReverse_2() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 5;
    int[] expectedRotatedArray = new int[]{6, 7, 1, 2, 3, 4, 5};
    rotationTest.rotateArrayAcyclicUsingSubReverse(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayCyclicUsingSubReverse_1() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 2;
    int[] expectedRotatedArray = new int[]{6, 7, 1, 2, 3, 4, 5};
    rotationTest.rotateArrayCyclicUsingSubReverse(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

  @Test
  public void testRotateArrayCyclicUsingSubReverse_2() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 5;
    int[] expectedRotatedArray = new int[]{3, 4, 5, 6, 7, 1, 2};
    rotationTest.rotateArrayCyclicUsingSubReverse(arr, rotationCount);
    assertEquals(arr, expectedRotatedArray);

  }

}