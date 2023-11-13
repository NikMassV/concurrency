package edu.nm.collections;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PerformanceTest {

    @Test
    public void test() {
        System.out.println();
        long start = System.nanoTime();
        var arrayList = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            if (i == 100) {
                arrayList.add(100);
            }
            if (i == 1000000) {
                arrayList.add(1000000);
            }
            if (i == 1999999) {
                arrayList.add(1999999);
            } else {
                arrayList.add(BigDecimal.valueOf(Math.random()));
            }
        }
        long end = System.nanoTime();
        System.out.println("Creating ArrayList: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.get(100);
        end = System.nanoTime();
        System.out.println("Getting 100 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.get(1000000);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.get(1999999);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.add(1, 1);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.add(1000000, 1000001);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.add(2000000, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        System.out.println("Removing by index 0 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(1111111);
        end = System.nanoTime();
        System.out.println("Removing by index 1111111 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(2000000);
        end = System.nanoTime();
        System.out.println("Removing by index 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1));
        end = System.nanoTime();
        System.out.println("Removing by value 100 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1000000));
        end = System.nanoTime();
        System.out.println("Removing by value 1000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1999999));
        end = System.nanoTime();
        System.out.println("Removing by value 1999999 element: " + (end - start) + " ns");
    }
}
