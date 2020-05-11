package org.step.collections.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(16);
        String[] objects = (String[]) Arrays.copyOf(stringList.toArray(), stringList.size() * 2);
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedListString = new LinkedList<>();

        linkedListString.addFirst("s");
        linkedListString.addLast("ss");

        linkedListString.removeFirst();
        linkedListString.removeLast();

        linkedListString.removeFirstOccurrence("s");
        linkedListString.removeLastOccurrence("ss");

        linkedListString.getFirst();
        linkedListString.getLast();

        boolean isAdd = list.addAll(Arrays.asList(objects));

        list.ensureCapacity(15);
        list.trimToSize();

        boolean isAddSecond = stringList.add("a");
        stringList.add("e");
        stringList.add("p");

        String integer = stringList.get(0);
        String set = stringList.set(0, "b");
        stringList.add(0, "c");
        boolean isRemoved = stringList.remove("b");
        int c = stringList.indexOf("c");
        int c1 = stringList.lastIndexOf("c");

        ListIterator<String> stringListIterator = stringList.listIterator();

        while (stringListIterator.hasNext()) {
            if (stringListIterator.nextIndex() == 2) {
                stringListIterator.add("q");
            }
            if (stringListIterator.next().equals("p")) {
                stringListIterator.add("k");
            }
        }

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
