package com.bvan.oop.lessons5_6.fs.proc;

/**
 * @author bvanchuhov
 */
public class ProcFile {

    private int size;

    public ProcFile(int size) {
        this.size = size;
    }

    public ProcFile() {
        this(0);
    }

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
