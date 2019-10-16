package math;

import java.util.Arrays;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * n = 15,
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] tmp = new String[n];
        for (int i = 0; i<tmp.length;i++){
            if((i+1) % 3==0 && (i+1) % 5!=0){
                tmp[i] ="Fizz";
                continue;
            }
            if((i+1) % 3!=0 && (i+1) % 5==0){
                tmp[i] ="Buzz";
                continue;
            }

            if((i+1) % 3==0 && (i+1) % 5==0){
                tmp[i] ="FizzBuzz";
                continue;
            }
            tmp[i]=String.valueOf(i+1);
        }
      return Arrays.asList(tmp);
    }
}
