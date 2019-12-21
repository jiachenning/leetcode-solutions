package rocks.ninjachen.leet_code_solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void testCase1() {
        LRUCache cache = new LRUCache(2);
        cache.set(2,1);
        cache.set(1,1);
        assertEquals(1, cache.get(2));
        cache.set(4,1);
        assertEquals(-1, cache.get(1));
        assertEquals(1, cache.get(2));
    }
}