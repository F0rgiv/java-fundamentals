/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
  @Test
  public void testRoll() {
    int[] result = Library.roll(1);
    int[] result2 = Library.roll(5);

    //assert the right number of rolls
    assertTrue("roll count is 1", result.length == 1);
    assertTrue("roll count is 5", result2.length == 5);

    //assert each roll is within range
    for (int num : result) {
      assertTrue("num is out of range: ", num > 0 && num < 7);
    }
    for (int num : result2) {
      assertTrue("num is out of range: ", num > 0 && num < 7);
    }
  }

  @Test
  public void testContainsDuplicates() {
    int[] dupesArr = {2,2,6,4,8};
    int[] noDupesArr = {2,4,5,6,8};

    assertTrue("[2,2,6,4,8] should return true", Library.ContainsDuplicates(dupesArr));
    assertFalse("[2,4,5,6,8] should return false", Library.ContainsDuplicates(noDupesArr));
  }

  @Test
  public void testAverage() {
    float[] Arr1 = {2,4,6};
    float[] Arr2 = {20,50,20,10};
    float[] Arr3 = {1,2};

    assertEquals("[2,4,6] should return 4", Library.average(Arr1), 4, .001);
    assertEquals("[20,50,20,10] should return 50", Library.average(Arr2), 25, .001);
    assertEquals("[1,2] should return 1.5", Library.average(Arr3), 1.5, .001);
  }

  @Test
  public void testArrayAverage() {
    float[][] arrArr1 = {
      {66, 64, 58, 65, 71, 57, 60},
      {57, 65, 65, 70, 72, 65, 51},
      {55, 54, 60, 53, 59, 57, 61},
      {65, 56, 55, 52, 55, 62, 57}
    };
    float[][] arrArr2 = {
      {50, 50, 50, 50, 50, 50, 50},
      {52, 52, 52, 52, 52, 52, 52}
    };
    assertEquals(
      "arrArr2 should average out to 51",
      51,
      Library.arrayAverage(arrArr2),
      .001);
    assertEquals(
      "arrArr1 should average out to x",
      60.25,
      Library.arrayAverage(arrArr1),
      .001);
  }
}