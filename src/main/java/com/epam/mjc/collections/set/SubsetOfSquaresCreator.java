package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (Integer num : sourceList) {
            set.add(num * num);
        }
        NavigableSet<Integer> subset = set.subSet(lowerBound, true, upperBound, true);
        return new TreeSet<>(subset);
    }
}
