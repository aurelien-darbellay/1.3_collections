import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  Exercise 1
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
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("\n\nAgain with August:\n");
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

        //Exercise 2
        System.out.println("\n+++Exercise 2 \n");
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> integerList = new ArrayList<Integer>();
        Arrays.stream(integers).forEach(integerList::add);
        integerList.forEach(System.out::println);
        List<Integer> secondIntegerList = new ArrayList<Integer>();
        ListIterator<Integer> secondIt = integerList.listIterator(integerList.size());
        while (secondIt.hasPrevious())
            secondIntegerList.add(secondIt.previous());
        for (Integer integer: secondIntegerList)
            System.out.println(integer);
    }
}