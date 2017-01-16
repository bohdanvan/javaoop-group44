package com.bvan.oop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public class FSRunner {

    public static void main(String[] args) {
        FSItem item = new File("Hello", 10);

        Directory root = new Directory()
                .add(new File(10))
                .add(new File(20))
                .add(new Directory()
                        .add(new File(30))
                        .add(new Directory()
                                .add(new File(40))
                                .add(new Directory())))
                .add(new Directory()
                        .add(new File(50)))
                .add(new Symlink())
                .add(new Symlink());

        System.out.println("size = " + root.getSize());
        System.out.println(root);
    }
}
