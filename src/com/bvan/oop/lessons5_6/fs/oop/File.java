package com.bvan.oop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private int size;

    public File(int size) {
        this("unnamed file", size);
    }

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void changeSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}
