package design_pattern.iterator;


/**
 * Created by leboop on 2020/5/24.
 */
public class IteratorMain {
    public static void main(String[] args) {
        MyCollection<String> c=new MyArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        MyIterator<String> iterator=c.myIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
