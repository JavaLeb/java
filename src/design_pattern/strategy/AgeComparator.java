package design_pattern.strategy;

/**
 * Created by leboop on 2020/5/23.
 */
public class AgeComparator implements MyComparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        return o1.getAge()-o2.getAge();
    }
}
