package com.bvan.oop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public abstract class NamedFSItem implements FSItem {

    private String name;

    public NamedFSItem() {
        this("unnamed");
    }

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
