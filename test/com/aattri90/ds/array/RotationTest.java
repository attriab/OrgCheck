package com.aattri90.ds.array;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RotationTest {

  private Rotation rotationTest = new Rotation();

  @Test
  public void testRotateArrayCyclicUsingTempVar() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int rotationCount = 3;
    rotationTest.rotateArrayCyclicUsingTempVar(arr, rotationCount);
    assertEquals(arr, new int[]{5, 6, 7, 1, 2, 3, 4});

  }

}