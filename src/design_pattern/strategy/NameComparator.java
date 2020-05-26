package design_pattern.strategy;

/**
 * Created by leboop on 2020/5/23.
 */
public class NameComparator implements MyComparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
