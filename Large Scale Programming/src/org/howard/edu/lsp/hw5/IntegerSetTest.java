package org.howard.edu.lsp.hw5;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
    
    private IntegerSet set;
    
    @Before
    public void setUp() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        set = new IntegerSet(list);
    }
    
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertEquals(0, set.length());
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set.length());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        IntegerSet set2 = new IntegerSet(list);
        assertTrue(set.equals(set2));
        list.add(2);
        set2 = new IntegerSet(list);
        assertFalse(set.equals(set2));
    }
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest1() throws IntegerSetException {
        assertEquals(5, set.largest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for largest exception")
    public void testLargestException() throws IntegerSetException {
        set.clear();
        set.largest();
    }
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest1() throws IntegerSetException {
        assertEquals(1, set.smallest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() throws IntegerSetException {
        set.clear();
        set.smallest();
    }
    
    @Test
    @DisplayName("Test case for addItem")
    public void testAddItem() {
        set.addItem(2);
        assertEquals(4, set.length());
        assertTrue(set.getlist().contains(2));
        set.addItem(5);
        assertEquals(4, set.length());
    }
    
    @Test
    @DisplayName("Test case for removeItem")
    public void testRemoveItem() {
        set.removeItem(3);
        assertEquals(0, set.length());
        assertFalse(set.getlist().contains(3));
        set.removeItem(4);
        assertEquals(0, set.length());
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet set3 = set.union(set2);
        assertEquals(6, set3.length());
        assertTrue(set3.getlist().contains(2));
        assertTrue(set3.getlist().contains(4));
        assertTrue(set3.getlist().contains(6));
    }
    
    @Test
    @DisplayName("Test case for intersection")
    public void testIntersection() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet result = set.intersect(set2);
        assertEquals(2, result.length());
        assertTrue(result.getlist().contains(3));
        assertTrue(result.getlist().contains(5));
        assertFalse(result.getlist().contains(1));
        assertFalse(result.getlist().contains(2));
        assertFalse(result.getlist().contains(4));
    }

    @Test
    @DisplayName("Test case for empty intersection")
    public void testEmptyIntersection() {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
		IntegerSet result = set.intersection(set2);
        assertEquals(0, result.length());
    }

    @Test
    @DisplayName("Test case for difference")
    public void testDifference() {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet result = set.difference(set2);
        assertEquals(1, result.length());
        assertTrue(result.getlist().contains(1));
        assertFalse(result.getlist().contains(3));
        assertFalse(result.getlist().contains(5));
        assertFalse(result.getlist().contains(2));
        assertFalse(result.getlist().contains(4));
    }

    @Test
    @DisplayName("Test case for empty difference")
    public void testEmptyDifference() {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet result = set.difference(set2);
        assertEquals(3, result.length());
        assertTrue(result.getlist().contains(1));
        assertTrue(result.getlist().contains(3));
        assertTrue(result.getlist().contains(5));
        assertFalse(result.getlist().contains(2));
        assertFalse(result.getlist().contains(4));
        assertFalse(result.getlist().contains(6));
    }
    
    @Test
    @DisplayName("Test case for largest with non-empty set")
    public void testLargest() {
        try {
            assertEquals(5, set.largest());
        } catch (IntegerSetException e) {
            fail("Should not have thrown an exception");
        }
    }
    
	@Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestEmpty() {
        assertThrows(IntegerSetException.class, () -> {
			set.largest();
        });
    }
    
    @Test
    @DisplayName("Test case for smallest with non-empty set")
    public void testSmallest() {
        try {
            assertEquals(1, set.smallest());
        } catch (IntegerSetException e) {
            fail("Should not have thrown an exception");
        }
    }
    
	@Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestEmpty() {
        assertThrows(IntegerSetException.class, () -> {
			set.smallest();
        });
    }
}
