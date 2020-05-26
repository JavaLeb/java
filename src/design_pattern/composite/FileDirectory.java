package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leboop on 2020/5/26.
 */
public class FileDirectory implements Disk {
    String name="";

    List<Disk> disks = new ArrayList<>();

    public FileDirectory(String name) {
        this.name = name;
    }

    @Override
    public void add(Disk disk) {
        disks.add(disk);
    }

    @Override
    public void remove(Disk disk) {
        disk.remove(disk);
    }

    @Override
    public void kill() {
        System.out.println("===================目录"+this.name+"杀毒开始===================");
        for (Disk disk : disks) {
            disk.kill();
        }
        System.out.println("===================目录"+this.name+"杀毒结束===================");
    }
}
