package design_pattern.proto;

/**
 * Created by leboop on 2020/5/23.
 */
public class ProtoMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        City city=new City("shanghai");
        Person person = new Person("zs", 30, city);
        Person p2 = (Person) person.clone();
        System.out.println(p2.getCity()==person.getCity());
        p2.setAge(100);
        p2.getCity().setCityName("beijing");
        System.out.println(p2);
        System.out.println(person);
    }
}
