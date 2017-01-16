package com.bvan.oop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public class Symlink extends NamedFSItem {

    public Symlink() {
    }

    public Symlink(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s";
    }
}
