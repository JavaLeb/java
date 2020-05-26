package thread;

/**
 * Created by leboop on 2018/11/19.
 */
public class TemplateMethod {
    public synchronized void print(){
        System.out.println("模板方法开始执行……");
        run();
        System.out.println("模板方法执行结束……");
    }

    public void run(){
        System.out.println("核心方法，有子类实现");
    }

    public static void main(String[] args) {
        TemplateMethod templateMethod=new TemplateMethod(){
            @Override
            public void run() {
                System.out.println("我是子类");
            }
        };
        templateMethod.print();
    }
}
