package math;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10,
 * 0 1 2 3 4 5 6 7 8 9
 * 1 1 1 1 1 1 1 1 1 1 1
 * they are 2, 3, 5, 7.
 *
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int[] original = new int[n];
        for (int i = 0; i < original.length; i++) {
            original[i] = 1;
        }

        for (int j = 2; j < Math.sqrt(n); j++) {
            for (int k = j; j * k < n; k++) {
                original[j * k] = 0;
            }
        }

        int count = 0;
        for (int l = 2; l < original.length; l++) {
            if (original[l] == 1) count++;
        }

        return count;
    }
}
