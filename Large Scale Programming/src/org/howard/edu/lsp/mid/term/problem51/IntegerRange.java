package org.howard.edu.lsp.mid.term.problem51;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IntegerRange implements Range {
	private int lower;
	private int upper;

// Hint: implement getters for lower and upper

	public IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    @Override
    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    @Override
    public boolean overlaps(Range other) throws EmptyRangeException {
        if (other == null) {
            throw new EmptyRangeException();
        }
        int otherLower = ((IntegerRange)other).getLower();
        int otherUpper = ((IntegerRange)other).getUpper();
        return (lower <= otherUpper && upper >= otherLower) ||
                (lower >= otherLower && upper <= otherUpper) ||
                (otherLower <= upper && otherUpper >= lower);
    }

    @Override
    public int size() {
        return upper - lower + 1;
    }
    
    public class IntegerRangeTest {

        @Test
        public void testContains() {
            Range range = new IntegerRange(5, 10);
            assertTrue(range.contains(7));
            assertTrue(range.contains(5));
            assertTrue(range.contains(10));
            assertFalse(range.contains(3));
            assertFalse(range.contains(12));
        }

    }
}