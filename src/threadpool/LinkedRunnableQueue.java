package threadpool;

import java.util.LinkedList;

/**
 * Created by leboop on 2018/11/26.
 */
public class LinkedRunnableQueue implements RunnableQueue {
    private  int limit;
    private DenyPolicy denyPolicy;
    private LinkedList<Runnable> runnableLinkedList=new LinkedList<>();
    private ThreadPool threadPool;

    public LinkedRunnableQueue(int limit, DenyPolicy denyPolicy, ThreadPool threadPool) {
        this.limit = limit;
        this.denyPolicy = denyPolicy;
        this.threadPool = threadPool;
    }

    @Override
    public void offer(Runnable runnable) {
        synchronized (runnableLinkedList){
            if(runnableLinkedList.size()>=limit){
                denyPolicy.reject(runnable,threadPool);
            }else {
                runnableLinkedList.addLast(runnable);
                runnableLinkedList.notifyAll();
            }
        }
    }

    @Override
    public Runnable take() throws InterruptedException{
        synchronized (runnableLinkedList){
            while (runnableLinkedList.isEmpty()){
                try {
                    runnableLinkedList.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }

            return runnableLinkedList.removeFirst();
        }
    }

    @Override
    public int size() {
        synchronized (runnableLinkedList){
            return runnableLinkedList.size();
        }
    }
}
