package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FlowEx2 {
    static public void run() {
        System.out.println("\n+++Exercise 2 \n");
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> integerList = new ArrayList<Integer>();
        Arrays.stream(integers).forEach(integerList::add);
        integerList.forEach(System.out::println);
        List<Integer> secondIntegerList = new ArrayList<Integer>();
        ListIterator<Integer> secondIt = integerList.listIterator(integerList.size());
        while (secondIt.hasPrevious())
            secondIntegerList.add(secondIt.previous());
        secondIntegerList.forEach(System.out::println);
    }
}
