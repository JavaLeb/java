package design_pattern.visitor;

/**
 * Created by leboop on 2020/5/26.
 * 具体的访问者：学校领导
 */
public class SchoolLeader implements IVisitor {
    String name = "";

    public SchoolLeader(String name) {
        this.name = name;
    }

    /**
     * 访问教师
     *
     * @param teacher
     */
    @Override
    public void visit(Teacher teacher) {
        /**
         * 教师向学校领导反映情况
         */
        teacher.reponse();
    }

    /**
     * 访问学生
     *
     * @param student
     */
    @Override
    public void visit(Student student) {
        /**
         * 学生向学校领导反映情况
         */
        student.response();
    }
}
