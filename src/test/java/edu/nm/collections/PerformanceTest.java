package edu.nm.collections;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

public class PerformanceTest {

    @Test
    public void testPerformance() {
        testPerformanceArrayList();
        testPerformanceLinkedList();
        testPerformanceHashMap();
        testPerformanceLinkedHashMap();
    }

    @Test
    public void testPerformanceArrayList() {
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
        start = System.nanoTime();
        arrayList.get(1000000);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.get(1999999);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.add(1, 1);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.add(1000000, 1000001);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.add(2000000, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        System.out.println("Removing by index 0 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.remove(1111111);
        end = System.nanoTime();
        System.out.println("Removing by index 1111111 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.remove(2000000);
        end = System.nanoTime();
        System.out.println("Removing by index 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1));
        end = System.nanoTime();
        System.out.println("Removing by value 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1000000));
        end = System.nanoTime();
        System.out.println("Removing by value 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(1999999));
        end = System.nanoTime();
        System.out.println("Removing by value 1999999 element: " + (end - start) + " ns");
    }

    @Test
    public void testPerformanceLinkedList() {
        System.out.println();
        long start = System.nanoTime();
        var linkedList = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            if (i == 100) {
                linkedList.add(100);
            }
            if (i == 1000000) {
                linkedList.add(1000000);
            }
            if (i == 1999999) {
                linkedList.add(1999999);
            } else {
                linkedList.add(BigDecimal.valueOf(Math.random()));
            }
        }
        long end = System.nanoTime();
        System.out.println("Creating LinkedList: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        linkedList.get(100);
        end = System.nanoTime();
        System.out.println("Getting 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.get(1000000);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.get(1999999);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        linkedList.add(1, 1);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.add(1000000, 1000001);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.add(2000000, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        System.out.println("Removing by index 0 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.remove(1111111);
        end = System.nanoTime();
        System.out.println("Removing by index 1111111 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.remove(2000000);
        end = System.nanoTime();
        System.out.println("Removing by index 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        linkedList.remove(Integer.valueOf(1));
        end = System.nanoTime();
        System.out.println("Removing by value 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.remove(Integer.valueOf(1000000));
        end = System.nanoTime();
        System.out.println("Removing by value 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedList.remove(Integer.valueOf(1999999));
        end = System.nanoTime();
        System.out.println("Removing by value 1999999 element: " + (end - start) + " ns");
    }

    @Test
    public void testPerformanceHashMap() {
        var p1 = new Person(BigDecimal.valueOf(100));
        var p2 = new Person(BigDecimal.valueOf(1000000));
        var p3 = new Person(BigDecimal.valueOf(1999999));
        var p4 = new Person(BigDecimal.valueOf(Math.random()));
        System.out.println();
        long start = System.nanoTime();
        var hashMap = new HashMap<>();
        for (int i = 0; i < 2000000; i++) {
            if (i == 100) {
                hashMap.put(p1, i);
            }
            if (i == 1000000) {
                hashMap.put(p2, i);
            }
            if (i == 1999999) {
                hashMap.put(p3, i);
            } else {
                hashMap.put(p4, i);
            }
        }
        long end = System.nanoTime();
        System.out.println("Creating HashMap: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.get(p1);
        end = System.nanoTime();
        System.out.println("Getting 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p2);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p3);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        var p5 = new Person(BigDecimal.valueOf(1));
        var p6 = new Person(BigDecimal.valueOf(1000000));
        var p7 = new Person(BigDecimal.valueOf(2000000));

        System.out.println();
        start = System.nanoTime();
        hashMap.put(p5, 5);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p6, 1000000);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p7, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.remove(p1);
        end = System.nanoTime();
        System.out.println("Removing p1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p2);
        end = System.nanoTime();
        System.out.println("Removing p2 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p3);
        end = System.nanoTime();
        System.out.println("Removing p3 element: " + (end - start) + " ns");

//        System.out.println();
//        start = System.nanoTime();
//        hashMap.remove(Integer.valueOf(1));
//        end = System.nanoTime();
//        System.out.println("Removing by value 100 element: " + (end - start) + " ns");
//        start = System.nanoTime();
//        hashMap.remove(Integer.valueOf(1000000));
//        end = System.nanoTime();
//        System.out.println("Removing by value 1000000 element: " + (end - start) + " ns");
//        start = System.nanoTime();
//        hashMap.remove(Integer.valueOf(1999999));
//        end = System.nanoTime();
//        System.out.println("Removing by value 1999999 element: " + (end - start) + " ns");
    }

    @Test
    public void testPerformanceLinkedHashMap() {
        var p1 = new Person(BigDecimal.valueOf(100));
        var p2 = new Person(BigDecimal.valueOf(1000000));
        var p3 = new Person(BigDecimal.valueOf(1999999));
        var p4 = new Person(BigDecimal.valueOf(Math.random()));
        System.out.println();
        long start = System.nanoTime();
        var hashMap = new LinkedHashMap<>();
        for (int i = 0; i < 2000000; i++) {
            if (i == 100) {
                hashMap.put(p1, i);
            }
            if (i == 1000000) {
                hashMap.put(p2, i);
            }
            if (i == 1999999) {
                hashMap.put(p3, i);
            } else {
                hashMap.put(p4, i);
            }
        }
        long end = System.nanoTime();
        System.out.println("Creating LinkedHashMap: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.get(p1);
        end = System.nanoTime();
        System.out.println("Getting 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p2);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p3);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        var p5 = new Person(BigDecimal.valueOf(1));
        var p6 = new Person(BigDecimal.valueOf(1000000));
        var p7 = new Person(BigDecimal.valueOf(2000000));

        System.out.println();
        start = System.nanoTime();
        hashMap.put(p5, 5);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p6, 1000000);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p7, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.remove(p1);
        end = System.nanoTime();
        System.out.println("Removing p1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p2);
        end = System.nanoTime();
        System.out.println("Removing p2 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p3);
        end = System.nanoTime();
        System.out.println("Removing p3 element: " + (end - start) + " ns");
    }

    @Test
    public void testPerformanceTreeMap() {
        var p1 = new Person(BigDecimal.valueOf(100));
        var p2 = new Person(BigDecimal.valueOf(1000000));
        var p3 = new Person(BigDecimal.valueOf(1999999));
        var p4 = new Person(BigDecimal.valueOf(Math.random()));
        System.out.println();
        long start = System.nanoTime();
        var hashMap = new TreeMap<>(Comparator.comparing(Person::getId));
        for (int i = 0; i < 2000000; i++) {
            if (i == 100) {
                hashMap.put(p1, i);
            }
            if (i == 1000000) {
                hashMap.put(p2, i);
            }
            if (i == 1999999) {
                hashMap.put(p3, i);
            } else {
                hashMap.put(p4, i);
            }
        }
        long end = System.nanoTime();
        System.out.println("Creating TreeMap: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.get(p1);
        end = System.nanoTime();
        System.out.println("Getting 100 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p2);
        end = System.nanoTime();
        System.out.println("Getting 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.get(p3);
        end = System.nanoTime();
        System.out.println("Getting 1999999 element: " + (end - start) + " ns");

        var p5 = new Person(BigDecimal.valueOf(1));
        var p6 = new Person(BigDecimal.valueOf(1000000));
        var p7 = new Person(BigDecimal.valueOf(2000000));

        System.out.println();
        start = System.nanoTime();
        hashMap.put(p5, 5);
        end = System.nanoTime();
        System.out.println("Adding 1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p6, 1000000);
        end = System.nanoTime();
        System.out.println("Adding 1000000 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.put(p7, 2000000);
        end = System.nanoTime();
        System.out.println("Adding 2000000 element: " + (end - start) + " ns");

        System.out.println();
        start = System.nanoTime();
        hashMap.remove(p1);
        end = System.nanoTime();
        System.out.println("Removing p1 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p2);
        end = System.nanoTime();
        System.out.println("Removing p2 element: " + (end - start) + " ns");
        start = System.nanoTime();
        hashMap.remove(p3);
        end = System.nanoTime();
        System.out.println("Removing p3 element: " + (end - start) + " ns");
    }
}
