package org.step.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FullListLong {

    private List<Long> longList;

    public FullListLong() {
        longList = new ArrayList<>();
        for (long i = 0; i < 1_000_000_00; i++) {
            longList.add(i);
        }
    }

    public List<Long> getLongListByDefaultOperator() {
        List<Long> newLongList = new ArrayList<>();

        for (Long l : longList) {
            if ((l % 250) == 0) {
                newLongList.add(l);
            }
        }
        return newLongList;
    }

    public List<Long> getLongListByStream() {
        /*
        ordered, unordered, sequential, parallel
         */
        return longList.parallelStream()
                .unordered()
                .filter(l -> (l % 250) == 0)
                .collect(Collectors.toList());
    }

    public List<Long> getLongList() {
        return longList;
    }
}
