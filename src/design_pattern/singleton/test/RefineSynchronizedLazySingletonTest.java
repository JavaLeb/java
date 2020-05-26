package design_pattern.singleton.test;

import design_pattern.singleton.RefineSynchronizedLazySingleton;

import java.util.*;

/**
 * Created by leboop on 2020/5/23.
 */
public class RefineSynchronizedLazySingletonTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            for (int i=0;i<10;i++){
                new Thread(()->{
                    RefineSynchronizedLazySingleton s=RefineSynchronizedLazySingleton.getInstance();
                    if (s!=null){
                        int a=s.getA();
                        if(a == 0){
                            System.out.println("成功");
                        }
                    }

                }).start();
            }



        }

    }


}
