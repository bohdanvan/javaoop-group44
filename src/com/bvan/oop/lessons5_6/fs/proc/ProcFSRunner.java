package com.bvan.oop.lessons5_6.fs.proc;

/**
 * @author bvanchuhov
 */
public class ProcFSRunner {

    public static void main(String[] args) {
        ProcDirectory root = new ProcDirectory()
                .add(new ProcFile(10))
                .add(new ProcFile(20))
                .add(new ProcDirectory()
                        .add(new ProcFile(30))
                        .add(new ProcDirectory()
                                .add(new ProcFile(40))
                                .add(new ProcDirectory())))
                .add(new ProcDirectory()
                        .add(new ProcFile(50)));

        root.add(new ProcDirectory().add(root));

        System.out.println("size = " + root.getSize());
        System.out.println(root);
    }
}
