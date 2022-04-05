import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "down-Black-side-Green";
        System.out.println("input: "+input);
        assertEquals("downBlackSideGreen", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testNormalCondition() {
        assertEquals(9, Solution.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Solution.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Solution.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }
}