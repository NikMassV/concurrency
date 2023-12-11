package edu.nm.collections;

import edu.nm.concurrency.domain.Person;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void testPrioritizingOfCompareRule() {
        var treeMap = new TreeMap<Person, Integer>(Comparator.comparing(Person::getId));

        Person person1 = new Person(BigDecimal.valueOf(1001), "Alice");
        Person person2 = new Person(BigDecimal.valueOf(1002), "Bob");
        Person person3 = new Person(BigDecimal.valueOf(1003), "Alex");

        treeMap.put(person1, 1);
        treeMap.put(person3, 3);
        treeMap.put(person2, 2);

        System.out.println(treeMap);
    }
}
