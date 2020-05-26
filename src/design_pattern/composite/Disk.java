package design_pattern.composite;

/**
 * Created by leboop on 2020/5/26.
 */
public interface Disk {
    String name = "";

    void add(Disk disk);

    void remove(Disk disk);

    void kill();
}
