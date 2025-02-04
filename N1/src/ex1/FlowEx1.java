package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class FlowEx1 {
    static public void run() {
        System.out.println("+++Exercise 1 \n");
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        System.out.println("All months but August:\n");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("\nAgain with August:\n");
        months.add(7, new Month("August"));
        ListIterator<Month> it = months.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
        System.out.println("\n\nAgain with a second reference to January, and a copy of february: \n");
        Month januaryCopy = months.getFirst();
        months.add(januaryCopy);
        months.add(new Month(months.get(1)));
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("\n\nAgain with a HashSet - we observe that two references to the same object aren't allowed, but two identical objects are:\n");
        HashSet<Month> setMonths = new HashSet<Month>(months);
        for (Month month : setMonths) {
            System.out.println(month.getName());
        }
    }
}
