package string;

public class ReverseInteger {
    public int reverse(int num) {
        int rev_num = 0;
        while(num!= 0 && (Integer.MIN_VALUE< num && num<Integer.MAX_VALUE))
        {
            if(rev_num>Integer.MAX_VALUE/10 || rev_num<Integer.MIN_VALUE/10){
                return 0;
            }
            rev_num = rev_num * 10 + num % 10;

            num = num / 10;
        }
        return rev_num;
    }
}
