package design_pattern.composite;

/**
 * Created by leboop on 2020/5/26.
 */
public class CompositeMain {
    public static void main(String[] args) {
//        目录结构如下
//        dir1-------dir2
//               |
//                ---dir3------file_1
//                         |
//                          ---file_2
//                         |
//                          ---file_3

        File f1=new File("file_1");
        File f2=new File("file_2");
        File f3=new File("file_3");
        FileDirectory dir1=new FileDirectory("dir_1");
        FileDirectory dir2=new FileDirectory("dir_2");
        FileDirectory dir3=new FileDirectory("dir_3");
//        文件目录dir_3下放置三个文件
        dir3.add(f1);
        dir3.add(f2);
        dir3.add(f3);
//        文件目录dir1下放置两个目录dir2和dir3
        dir1.add(dir2);
        dir1.add(dir3);
//        目录dir_1杀毒
        dir1.kill();
    }
}
