package com.bvan.oop.lessons5_6.fs.proc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcDirectory {

    private final List<ProcFile> files = new ArrayList<>();
    private final List<ProcDirectory> directories = new ArrayList<>();

    public ProcDirectory add(ProcFile file) {
        files.add(file);
        return this;
    }

    public ProcDirectory add(ProcDirectory directory) {
        checkCyclicDependency(directory);
        directories.add(directory);
        return this;
    }

    private void checkCyclicDependency(ProcDirectory directory) {
        if (createsCyclicDependency(directory)) {
            throw new IllegalArgumentException("cyclic dependency");
        }
    }

    private boolean createsCyclicDependency(ProcDirectory directory) {
        return this == directory; // TODO
    }

    public int getSize() {
        int sizeSum = 0;
        for (ProcFile file : files) {
            sizeSum += file.getSize();
        }
        for (ProcDirectory directory : directories) {
            sizeSum += directory.getSize();
        }
        return sizeSum;
    }

    @Override
    public String toString() {
        // TODO
        return "d{files = " + files + ", dirs = " + directories + "}";
    }
}
