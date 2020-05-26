package design_pattern.visitor;


/**
 * Created by leboop on 2020/5/26.
 */
public class VisitorMain {
    /**
     * 校长张三丰访问2位老师和2位学生
     * @param args
     */
    public static void main(String[] args) {
        ObjectCollection os=new ObjectCollection();
        Teacher t1=new Teacher("teacher-1");
        Teacher t2=new Teacher("teacher-2");
        Student s1=new Student("student-1");
        Student s2=new Student("student-2");
        os.add(t1).add(t2).add(s1).add(s2);
        os.iterator(new SchoolLeader("张三丰"));
    }
}
