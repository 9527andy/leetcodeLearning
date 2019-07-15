package math;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * Input: 27
 * Output: true
 * <p>
 * Input: 0
 * Output: false
 * <p>
 * Input: 9
 * Output: true
 * <p>
 * Input: 45
 * Output: false
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;

        for (int i = 1; i <= n / 2; i *= 3) {
            if (3 * i == n) return true;
        }
        return false;
    }
}
