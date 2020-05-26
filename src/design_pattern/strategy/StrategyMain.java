package design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leboop on 2020/5/23.
 */
public class StrategyMain {
    public static void main(String[] args) {
        Person p1=new Person("C",10);
        Person p2=new Person("B",30);
        Person p3=new Person("A",20);
        List<Person> personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        MyComparator<Person> ageComparator=new AgeComparator();
        System.out.println(MyCollections.sort(personList,ageComparator));

        MyComparator<Person> nameComparator=new NameComparator();
        System.out.println(MyCollections.sort(personList,nameComparator));

    }
}
