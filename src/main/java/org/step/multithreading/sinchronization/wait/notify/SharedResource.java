package org.step.multithreading.sinchronization.wait.notify;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {

    private List<Integer> integerList;

    public SharedResource() {
        this.integerList = new ArrayList<>();
    }

    public void setElement(Integer integer) {
        integerList.add(integer);
    }

    public Integer getElement() {
        if (integerList.size() > 0) {
            return integerList.remove(0);
        }
        return null;
    }
}
