package design_pattern.visitor;

/**
 * Created by leboop on 2020/5/26.
 */
public class Teacher implements IVisitable {
    String name = "";

    public Teacher(String name) {
        this.name = name;
    }

    /**
     * 表示教师接收访问
     * @param visitor 访问者
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void reponse() {
        System.out.println(this.name + "反映教学问题");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
