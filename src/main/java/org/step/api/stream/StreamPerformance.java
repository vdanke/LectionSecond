package org.step.api.stream;

import java.util.List;

public class StreamPerformance {

    public static void main(String[] args) {
        FullListLong fullListLong = new FullListLong();

        long defaultIteratorStart = System.nanoTime();
        List<Long> longListByDefaultOperator = fullListLong.getLongListByDefaultOperator();
        long defaultIteratorFinish = System.nanoTime();

        long streamStart = System.nanoTime();
        List<Long> longListByStream = fullListLong.getLongListByStream();
        long streamFinish = System.nanoTime();

        System.out.println("Default time is " + (defaultIteratorFinish - defaultIteratorStart));
        System.out.println("Stream time is " + (streamFinish - streamStart));
        System.out.println("Collection size is " + fullListLong.getLongList().size());
    }
}
