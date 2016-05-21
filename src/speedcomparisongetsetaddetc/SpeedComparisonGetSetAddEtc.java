package speedcomparisongetsetaddetc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SpeedComparisonGetSetAddEtc {

    public static void main(String[] args) {
        long start, end;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        Random rand = new Random();
        start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            int value = 1 + rand.nextInt(100);
            list1.add(value);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList");
        System.out.println("Add: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list1.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Get: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list1.set(i, i);
        }
        end = System.currentTimeMillis();
        System.out.println("Set: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list1.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove: " + (end - start) + " ms");

        System.out.println();
        start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            int value = rand.nextInt(100);
            list2.add(value);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList");
        System.out.println("Add: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list2.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Get: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list2.set(i, i);
        }
        end = System.currentTimeMillis();
        System.out.println("Set: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            list2.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove: " + (end - start) + " ms");
    }
}
