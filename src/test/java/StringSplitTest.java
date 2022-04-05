import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals(Arrays.toString(StringSplit.solution(s)),"[ab, cd, ef]", "Should handle even string");
        assertEquals( Arrays.toString(StringSplit.solution(s1)),"[He, ll, oW, or, ld]", "Should handle even string");
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals(Arrays.toString(StringSplit.solution(s)),"[ab, cd, e_]", "Should handle odd string");
        assertEquals(Arrays.toString(StringSplit.solution(s1)),"[Lo, ve, Pi, zz, a_]","Should handle odd string" );
    }
}