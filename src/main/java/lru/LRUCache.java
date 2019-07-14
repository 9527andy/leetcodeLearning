package lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 当一个节点被访问时，如果 accessOrder 为 true，则会将该节点移到链表尾部。
 * 也就是说指定为 LRU 顺序之后，在每次访问一个节点时，会将这个节点移到链表尾部，
 * 保证链表尾部是最近访问的节点，那么链表首部就是最近最久未使用的节点。
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 3;

    public LRUCache() {
        super(MAX_ENTRIES, 0.75F, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache();

        //initial order: 1 2 3
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        System.out.println(cache.keySet());

        //since 1 was got, order change to 2 3 1
        cache.get(1);

        //size change to 4 exceed MAX_ENTRIES, need remove head, 2 3 1, 2 is head.
//        2 3 1 4, 2 is head will removed. out put: 3 1 4
        cache.put(4, "d");

        System.out.println(cache.keySet());
    }
}
