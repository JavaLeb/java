package design_pattern.singleton.test;


import design_pattern.singleton.LazySingleton;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by leboop on 2018/11/27.
 */
public class LazySingletonTest {
    //存放单例
    private static Set<LazySingleton> set = new HashSet<>();

    public static void main(String[] args) {
        while (set.size() < 2) {
            // 清空
            set.clear();
            //线程t1
            new Thread(() -> {
                LazySingleton singleton = LazySingleton.getInstance();
                synchronized (set) {
                    set.add(singleton);
                }
            }
                    , "t1").start();

            // 线程t2
            new Thread(() -> {
                LazySingleton singleton = LazySingleton.getInstance();
                synchronized (set) {
                    set.add(singleton);
                }
            }, "t2").start();

        }

        System.out.println("set的大小:" + set.size());
        for (LazySingleton singleton : set) {
            System.out.println(singleton);
        }


    }
}
