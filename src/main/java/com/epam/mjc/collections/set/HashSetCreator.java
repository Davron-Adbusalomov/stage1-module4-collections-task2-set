package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer elem:sourceList) {
            if (elem%2==1){
                hashSet.add(elem);
                hashSet.add(2*elem);
            }
            else {
                boolean bool=true;
                while (bool){
                    hashSet.add(elem);
                    elem=elem/2;
                    if (elem%2==1){
                        hashSet.add(elem);
                        bool=false;
                    }
                }
            }
        }
        return hashSet;
    }
}
