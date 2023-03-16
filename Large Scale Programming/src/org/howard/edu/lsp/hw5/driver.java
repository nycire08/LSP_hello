package org.howard.edu.lsp.hw5;

public class driver
{
        public static void main(String[] args) {
            IntegerSet set1 = new IntegerSet(null);
            set1.add(1);
            set1.add(2);
            set1.add(3);
                System.out.println("Value of Set1 is:" + set1);
                
                try {
                    System.out.println("Smallest value in Set1 is:" + set1.smallest());
                } catch(IntegerSetException ise) {
                    System.out.println(ise);
                }
                
                try {
                    System.out.println("Largest value in Set1 is:" + set1.largest());
                } catch(IntegerSetException ise) {
                    System.out.println(ise);
                }
                
                IntegerSet set2 = new IntegerSet(null);
            set2.add(4);
            set2.add(5);
            
            System.out.println("\nUnion of Set1 and Set2");
            System.out.println("Value of Set1 is:" + set1);
            System.out.println("Value of Set2 is:" + set2);
            
            set1.union(set2);
                
                System.out.println("\nResult of union of Set1 and Set2");
                System.out.println(set1);
                
                set1.clear();
                
                try {
                    System.out.println("Largest value in Set1 is:" + set1.largest());
                } catch(IntegerSetException ise) {
                    System.out.println(ise);
                }
            
        }
}
