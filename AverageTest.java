// File: AverageTest.java
import static org.junit.Assert.*;
import org.junit.Test;

public class AverageTest {

    @Test
    public void testAverage_Functional() {
        Average avg = new Average();
        
        // Test Case 1: k < list.length
        assertEquals(8, avg.average(3, new int[] {4, 8, 12, 16}));
        
        // Test Case 2: k > list.length
        assertEquals(5, avg.average(5, new int[] {2, 4, 6, 8}));
        
        // Test Case 3: k = 0
        assertEquals(0, avg.average(0, new int[] {1, 2, 3}));
        
        // Test Case 4: Empty array
        assertEquals(0, avg.average(2, new int[] {}));
        
        // Test Case 5: k = 1
        assertEquals(10, avg.average(1, new int[] {10}));
    }

    @Test
    public void testAverage_Partition() {
        Average avg = new Average();
        
        assertEquals(20, avg.average(3, new int[] {10, 20, 30, 40}));
        assertEquals(25, avg.average(4, new int[] {10, 20, 30, 40}));
        assertEquals(25, avg.average(5, new int[] {10, 20, 30, 40}));
        assertEquals(0, avg.average(2, new int[] {}));
        assertEquals(0, avg.average(0, new int[] {10, 20, 30}));
        assertEquals(10, avg.average(1, new int[] {10}));
    }

    @Test
    public void testAverage_Boundary() {
        Average avg = new Average();
        assertEquals(100, avg.average(1, new int[] {100}));
        assertEquals(0, avg.average(0, new int[] {}));
        assertEquals(0, avg.average(0, new int[] {10, 20}));
        assertEquals(2, avg.average(1000, new int[] {1, 2, 3}));
        assertEquals(10, avg.average(3, new int[] {5, 10, 15}));
    }
}
