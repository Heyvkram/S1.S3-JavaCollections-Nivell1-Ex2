import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        int firstMax = 5;

        List<Integer> firstList = new ArrayList<>();
        for (int i = 1; i <= firstMax; i++) {
            firstList.add(i);
        }
        System.out.println("First list: " + firstList + "\n");

        List<Integer> secondList = new ArrayList<>(firstList);
        Collections.reverse(secondList);

        System.out.println("Second list: " + secondList + "\n");

        ListIterator<Integer> listReader = firstList.listIterator();

        while (listReader.hasNext()) {
            secondList.add(listReader.next());
        }

        System.out.println("Final list: " + secondList + "\n");
    }
}