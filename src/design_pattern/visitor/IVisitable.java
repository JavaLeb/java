package design_pattern.visitor;

/**
 * Created by leboop on 2020/5/26.
 * 该接口对被访问者的“可访问性”进行抽象
 */
public interface IVisitable {
    /**
     * 表示接受访问者访问
     * @param visitor 访问者
     */
    void accept(IVisitor visitor);
}
