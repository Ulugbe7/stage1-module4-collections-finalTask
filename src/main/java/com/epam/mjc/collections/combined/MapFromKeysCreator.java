package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            Set<String> mSet = map.get(key.length());
            if (mSet != null) {
                mSet.add(key);
            } else {
                map.put(key.length(), new HashSet<>(List.of(key)));
            }
        }
        return map;
    }
}
