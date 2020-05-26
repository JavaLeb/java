package design_pattern.composite;

/**
 * Created by leboop on 2020/5/26.
 */
public class File implements Disk {
    private String name="";

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(Disk disk) {
//        无需实现，文件下无法添加文件
    }

    @Override
    public void remove(Disk disk) {
//         无需实现，文件下无法删除文件
    }

    @Override
    public void kill() {
        System.out.println("++++++文件"+this.name+"杀毒开始+++++++");
        System.out.println("杀毒中，请等待……");
        System.out.println("++++++文件"+this.name+"杀毒结束+++++++");
    }
}
