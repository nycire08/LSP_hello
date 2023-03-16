package org.howard.edu.lsp.hw5;

import java.util.ArrayList;

public class IntegerSet {
private ArrayList<Integer> set = new ArrayList<Integer>();
    
    // Default Constructor
    public IntegerSet(ArrayList<Integer> list) {}
    
    public ArrayList<Integer> getSet() {
        return this.set;
    }
    
    // Clears the internal representation of the set
    public void clear() {
        this.set.clear();
    }
    
    // Return the length of set
    public int length() {
        return this.set.size();
    }
    
    // Returns true if 2 sets are equal, false otherwise
    public boolean equals(IntegerSet b) {
        return this.set.equals(b.getSet());
    }
    
    // Returns true if the set contains the value, false otherwise
    public boolean contains(int value) {
        return this.set.contains(value);
    }
    
    // Return true if the set is empty, false otherwise
    boolean isEmpty() {
        return this.length() == 0;
    }
    
    // Returns the largest item in the set; Throws a IntegerSetException if set is empty
    public int largest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        int largest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) > largest) {
                largest = this.set.get(i);
            }
        }
        
        return largest;
    }
    
    // Returns the smallest item in the set; Throws a IntegerSetException if set is empty
    public int smallest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        int smallest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) < smallest) {
                smallest = this.set.get(i);
            }
        }
        
        return smallest;
    }
    
    // Adds an item to the set or does nothing if it's already there
    public void add(int item) {
        if (!this.contains(item)) {
            this.set.add(item);
        }
    }
    
    // Removes an item from the set or does nothing if it's not there
    public void remove(int item) throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        if (this.contains(item)) {
            this.set.remove(item);
        }
    }
    
    // Set union
    public IntegerSet union(IntegerSet intSetb) {
        for (int item : intSetb.getSet()) {
            this.add(item);
        }
		return intSetb;
    }
    
    // Set intersection
    public IntegerSet intersect(IntegerSet intSetb) {
        this.set.retainAll(intSetb.getSet());
		return intSetb;
    }
    
    // Set difference
    public void diff(IntegerSet intSetb) {
        for (int item : intSetb.getSet()) {
            if (this.contains(item)) {
                this.set.remove(item);
            }
        }
    }
    
    // String representation of the set
    public String toString() {
        String returnStr = " ";
        
        for (int item : this.getSet()) {
            returnStr += String.format("%d ", item);
        }
        
        return returnStr;
    }

	public IntegerSet getlist() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeItem(int i) {
		// TODO Auto-generated method stub
		
	}

	public void addItem(int i) {
		// TODO Auto-generated method stub
		
	}

	public IntegerSet intersection(IntegerSet set2) {
		// TODO Auto-generated method stub
		return null;
	}

	public IntegerSet difference(IntegerSet set2) {
		// TODO Auto-generated method stub
		return null;
	}


}
