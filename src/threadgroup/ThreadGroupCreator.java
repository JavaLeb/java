package threadgroup;

/**
 * Created by leboop on 2018/11/26.
 */
public class ThreadGroupCreator {
    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        System.out.println("当前线程组名称：" + threadGroup);
        ThreadGroup group1 = new ThreadGroup("Group1");
        System.out.println("group1的父线程组：" + group1.getParent());

        ThreadGroup group2=new ThreadGroup(group1,"group2");
        System.out.println("group2的父线程组："+group2.getParent());

    }
}
