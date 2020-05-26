package design_pattern.visitor;

/**
 * Created by leboop on 2020/5/26.
 */
public class Student implements IVisitable {
    String name = "";

    public Student(String name) {
        this.name = name;
    }

    /**
     * 表示学生可接受学校领导访问
     * @param visitor 访问者
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 学生反映情况
     */
    public void response() {
        System.out.println(this.name + "反映学习问题");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
