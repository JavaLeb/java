package design_pattern.strategy;

import java.util.List;

/**
 * Created by leboop on 2020/5/23.
 */
public class MyCollections {

    public static List<Person> sort(List<Person> personList, MyComparator c) {
        int len = personList.size();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                Person p1 = personList.get(j);
                Person p2 = personList.get(j + 1);
                if (c.compare(p1, p2) > 0) {        // 相邻元素两两对比
                    personList.set(j + 1, p1);
                    personList.set(j, p2);
                }
            }
        }
        return personList;
    }
}
