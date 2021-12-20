package lab13;

import java.util.*;

public class Solution {

    static class Pair<K,V> {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static <T> List<T> newArrayList(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    public static <T> HashSet<T> newHashSet(T... items) {
        return new HashSet<>(Arrays.asList(items));
    }

    public static <K, V> HashMap<K,V> newHashMap(Pair<K,V>... pairs) {
        HashMap<K,V> hashMap = new HashMap<>();
        for(Pair<K, V> pair: pairs)
            hashMap.put(pair.key, pair.value);
        return hashMap;
    }
}