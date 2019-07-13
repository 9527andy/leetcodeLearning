package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出所有和为 S 的连续正数序列。
 */
public class FindContinuesSequence {
    private List<List> storeContinuesSequence = new ArrayList();

    public List getStoreContinuesSequence() {
        return storeContinuesSequence;
    }

    public void setStoreContinuesSequence(List storeContinuesSequence) {
        this.storeContinuesSequence = storeContinuesSequence;
    }

    public void findContinuesSequence(int sum) {
        if (sum < 3) return;

        int lower = 1;
        int higher = 2;
        int initialSum = 3;

        while (lower < (1 + sum) / 2) {
            if (initialSum == sum) {
                storeContinuesSequence.add(initialList(lower, higher));
            }

            while (initialSum < sum) {
                higher++;
                initialSum += higher;
                if (initialSum == sum) {
                    storeContinuesSequence.add(initialList(lower, higher));
                }
            }

            initialSum -= lower;
            lower++;
        }
    }

    private List initialList(int start, int end) {
        List list = new ArrayList();

        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        return list;
    }
}
