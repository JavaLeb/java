package threadgroup;

import java.util.concurrent.TimeUnit;

/**
 * Created by leboop on 2018/11/26.
 */
public class ThreadGroupEnumerateThreadGroups {
    public static void main(String[] args) {
        ThreadGroup myGroup1=new ThreadGroup("MyGroup1");
        ThreadGroup myGroup2=new ThreadGroup(myGroup1,"MyGroup2");
        try {
            TimeUnit.MILLISECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();

        ThreadGroup[] list=new ThreadGroup[mainGroup.activeGroupCount()];

        int recurseSize=mainGroup.enumerate(list);
        mainGroup.list();
        System.out.println("====================");
        mainGroup.interrupt();
        ThreadGroup[] list2=new ThreadGroup[mainGroup.activeGroupCount()];
        recurseSize=mainGroup.enumerate(list2,false);
        for (ThreadGroup tg:list2){
            if(tg!=null){
                System.out.println(tg.getName());
            }
        }
    }
}
