package offer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindContinuesSequenceTest {

    FindContinuesSequence findContinuesSequence = null;

    @Before
    public void setup() {
        findContinuesSequence = new FindContinuesSequence();

    }

    @Test
    public void findContinuesSequence() {
        List expectFirst = new ArrayList(Arrays.asList(2, 3, 4));
        List expectSecond = new ArrayList(Arrays.asList(4, 5));
        findContinuesSequence.findContinuesSequence(9);

        assertTrue(findContinuesSequence.getStoreContinuesSequence().size() == 2);


        List actualFirst = (List) findContinuesSequence.getStoreContinuesSequence().get(0);
        for (Object o : actualFirst) {
            assertTrue(expectFirst.contains(o));
        }

        List actualSecond = (List) findContinuesSequence.getStoreContinuesSequence().get(1);
        for (Object o : actualSecond) {
            assertTrue(expectSecond.contains(o));
        }
    }
}