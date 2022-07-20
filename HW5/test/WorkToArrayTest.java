
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkToArrayTest {

    @Test
    void testSequenceSearchInArrayThisTrue() {
        int[] input = {1, 2, 3, 4, 5};
        int[] input1 = {2, 3, 4};
        WorkToArray workToArray = new WorkToArray(input, input1);
        boolean result = workToArray.sequenceSearchInArray();
        assertTrue(result);
    }

    @Test
    void testSequenceSearchInArrayThisFalse() {
        int[] input = {1, 2, 3, 4, 5};
        int[] input1 = {2, 4, 4};
        WorkToArray workToArray = new WorkToArray(input, input1);
        boolean result = workToArray.sequenceSearchInArray();
        assertFalse(result);
    }

    @Test
    void testFindLongestInArray() {
        int[] input = {11, 2, 3, 4, 5555, 7, 555};
        WorkToArray workToArray = new WorkToArray(input);
        FindResult result = workToArray.findLongest();
        Assertions.assertEquals(5555, result.value);
        Assertions.assertEquals(4, result.length);
    }

    @Test
    void testFindShortestInArray() {
        int[] input = {11, 2, 3, 4, 5555, 7, 555};
        WorkToArray workToArray = new WorkToArray(input);
        FindResult result = workToArray.findShortest();
        Assertions.assertEquals(7, result.value);
        Assertions.assertEquals(1, result.length);
    }

    @Test
    void testIsDifferentNumberFalse() {
        WorkToArray workToArray = new WorkToArray();
        boolean result = workToArray.isDifferentNumber(110);
        Assertions.assertFalse(result);
    }

    @Test
    void testIsDifferentNumberTrue() {
        WorkToArray workToArray = new WorkToArray();
        boolean result = workToArray.isDifferentNumber(123);
        Assertions.assertTrue(result);
    }


    @Test
    void testOutSqrMatrix() {
        WorkToArray workToArray = new WorkToArray();
        String result = workToArray.outSqrMatrix(5);
        String waitString = "1 2 3 \n4 5 0 \n0 0 0 \n";
        Assertions.assertEquals(waitString, result);
    }
}