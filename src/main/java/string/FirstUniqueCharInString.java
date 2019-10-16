package string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * First Unique Character in a String
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * s = "cc"
 * return -1
 * s = "aadadaad"
 * return -1
 */
public class FirstUniqueCharInString {

    public int findFirstUniqueChar(String args) {
        if (args == null || args.length() == 0) {
            return -1;
        }

        Map<String, Integer> store = new LinkedHashMap<>();

        char[] strArray = args.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            String si = String.valueOf(strArray[i]);
            if (store.containsKey(si)) continue;
            store.put(si, 0);
            for (int j = i + 1; j < strArray.length; j++) {
                String sj = String.valueOf(strArray[j]);
                if (si.equals(sj)) {
                    Integer sum = store.get(si);
                    sum = Integer.sum(sum, 1);
                    store.put(sj, sum);
                }
            }

        }

        String first = "";
        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            if (entry.getValue() == 0) {
                first = entry.getKey();
                break;
            }
        }

        if (!first.equals("")) {
            return args.indexOf(first);
        }
        return -1;
    }

}
