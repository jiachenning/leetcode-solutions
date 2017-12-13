package rocks.ninjachen.hacker_rank_soulutions;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by ninja on 12/13/17.
 */
public class LarrysArrayTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testCase1() throws Exception {
        // 3 1 2 should be YES
        Assert.assertTrue(LarrysArray.canBeSorted(3, 1, 2));
        // 1 3 4 2 should be YES
        Assert.assertTrue(LarrysArray.canBeSorted(1,3,4,2));
        // 1 2 3 5 4 should be NO
        Assert.assertFalse(LarrysArray.canBeSorted(1,2,3,5,4));
    }

    @org.junit.Test
    public void testCase2() throws Exception {
        // 9 6 8 12 3 7 1 11 10 2 5 4 should be NO
        Assert.assertFalse(LarrysArray.canBeSorted(9,6,8,12,3,7,1,11,10,2,5,4));
        // 17 21 2 1 16 9 12 11 6 18 20 7 14 8 19 10 3 4 13 5 15 should be YES
        Assert.assertTrue(LarrysArray.canBeSorted(17,21,2,1,16,9,12,11,6,18,20,7,14,8,19,10,3,4,13,5,15));
        // 5 8 13 3 10 4 12 1 2 7 14 6 15 11 9 should be NO
        Assert.assertFalse(LarrysArray.canBeSorted(5,8,13,3,10,4,12,1,2,7,14,6,15,11,9));
        // 8 10 6 11 7 1 9 12 3 5 13 4 2 should be YES
        Assert.assertTrue(LarrysArray.canBeSorted(8,10,6,11,7,1,9,12,3,5,13,4,2));
        // 7 9 15 8 10 16 6 14 5 13 17 12 3 11 4 1 18 2 should be NO
        Assert.assertFalse(LarrysArray.canBeSorted(7,9,15,8,10,16,6,14,5,13,17,12,3,11,4,1,18,2));
    }

}