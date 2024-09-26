package string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean validAnagram(String t, String s) {
        if ((t == null && s == null) || t.equals(s))
            return true;

        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();

        Map<String, Integer> tStore = calculateNumberOfCharacter(tArray);
        Map<String, Integer> sStore = calculateNumberOfCharacter(sArray);

        return compare(tStore, sStore);
    }

    private Map<String, Integer> calculateNumberOfCharacter(char[] tArray) {
        Map<String, Integer> tStore = new HashMap<>();
        for (int i = 0; i < tArray.length; i++) {
            if (tStore.containsKey(String.valueOf(tArray[i]))) {
                Integer value = tStore.get(String.valueOf(tArray[i]));
                value = Integer.sum(1, value);
                tStore.put(String.valueOf(tArray[i]), value);
                continue;
            }
            tStore.put(String.valueOf(tArray[i]), 1);

        }

        return tStore;
    }

    private boolean compare(Map<String, Integer> tStore, Map<String, Integer> sStore) {
        if (tStore.size() != sStore.size()) return false;
        for (Map.Entry<String, Integer> entry : tStore.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (sStore.get(key) == null || value.compareTo(sStore.get(key)) != 0) {
                return false;
            }
        }
        return true;
    }
}
