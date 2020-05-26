package design_pattern.visitor;

/**
 * Created by leboop on 2020/5/26.
 * 该接口对访问者进行抽象
 */
public interface IVisitor {
    /**
     * 可访问教师
     * @param teacher 教师
     */
    void visit(Teacher teacher);

    /**
     * 可访问学生
     * @param student 学生
     */
    void visit(Student student);
}
