package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * Example 1:
 * <p>
 * Input: 'III'
 * Output: 3
 * Example 2:
 * <p>
 * Input: 'IV'
 * Output: 4
 * Example 3:
 * <p>
 * Input: 'IX'
 * Output: 9
 * Example 4:
 * <p>
 * Input: 'LVIII'
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * <p>
 * Input: 'MCMXCIV'
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Object, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        char[] romanArray = s.toCharArray();
        int initial = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < romanArray.length; i++) {

            if (romanArray[i] == 'I' && (i + 1) < romanArray.length && (romanArray[i + 1] == 'V' || romanArray[i + 1] == 'X')) {
                list.add(map.get(romanArray[i + 1]) - map.get(romanArray[i]));
                i++;
                continue;
            }

            if (romanArray[i] == 'X' && (i + 1) < romanArray.length && (romanArray[i + 1] == 'L' || romanArray[i + 1] == 'C')) {
                list.add(map.get(romanArray[i + 1]) - map.get(romanArray[i]));
                i++;
                continue;
            }

            if (romanArray[i] == 'C' && (i + 1) < romanArray.length && (romanArray[i + 1] == 'D' || romanArray[i + 1] == 'M')) {
                list.add(map.get(romanArray[i + 1]) - map.get(romanArray[i]));
                i++;
                continue;
            }
            list.add(map.get(romanArray[i]));
        }

        for (Integer integer : list) {
            initial += integer;
        }
        return initial;
    }
}
