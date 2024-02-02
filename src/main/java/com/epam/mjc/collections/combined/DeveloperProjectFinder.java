package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> stringSetEntry : projects.entrySet()) {
            if (stringSetEntry.getValue().contains(developer)) {
                result.add(stringSetEntry.getKey());
            }
        }
        result.sort(String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(result);
        result.sort(Comparator.comparingInt(String::length).reversed());
        return result;
    }
}
