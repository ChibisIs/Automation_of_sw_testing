package lesson_7_junit_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    private Arithmetic arithmetic = new Arithmetic();

    @Test
     void testFactorial0() {
        assertEquals(1, arithmetic.factorial(0));
    }

    @Test
    void testfactorial1() {
        assertEquals(1, arithmetic.factorial(1));
    }

    @Test 
    void testFactorial20() {
        assertEquals(2432902008176640000L, arithmetic.factorial(20));
    }

    @Test 
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> arithmetic.factorial(-1));
    }
    
    @Test
    void testTriangleArea1() {
        assertEquals(6.0, arithmetic.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleArea2() {
        assertEquals(Math.sqrt(3), arithmetic.triangleArea(2, 2, 2));
    }

    @Test 
    void restTriangleAreaInvalid() {
        assertThrows(IllegalArgumentException.class, () -> arithmetic.triangleArea(0, 2, 3));
    }

    @Test
    void testArithmetic1() {
        Arithmetic.ArithmeticResult result = arithmetic.arithmeticOperations(10, 5);
        assertEquals(15, result.sum);
        assertEquals(5, result.diff);
        assertEquals(50, result.mult);
        assertEquals(2.0, result.div);
        
    }

    @Test 
    void testArithmetic2() {
        Arithmetic.ArithmeticResult result = arithmetic.arithmeticOperations(10, 0);
        assertEquals(10, result.sum);
        assertEquals(10, result.diff);
        assertEquals(0, result.mult);
        assertNull(result.div);
    }

    @Test
    void testCompareGreater() {
        assertEquals(1, arithmetic.compare(10, 5));
    }

    @Test 
    void testCompareLess() {
        assertEquals(-1, arithmetic.compare(5, 10));
    }

    @Test
    void testCompareEqual() {
        assertEquals(0, arithmetic.compare(10, 10));
    }
}
