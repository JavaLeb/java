package design_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leboop on 2020/5/26.
 */
public class ObjectCollection {
    /**
     * 所有可访问对象集合
     */
    List<IVisitable> visitableList = new ArrayList<>();

    /**
     * 访问者逐个访问被访问者
     * @param visitor
     */
    public void iterator(IVisitor visitor) {
        for (IVisitable visitable : visitableList) {
            visitable.accept(visitor);
        }
    }

    /**
     * 新增被访问者
     * @param visitable
     * @return
     */
    public ObjectCollection add(IVisitable visitable) {
        visitableList.add(visitable);

        return this;
    }

}
