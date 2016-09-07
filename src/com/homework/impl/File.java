package com.homework.impl;

import com.homework.FileSystemElement;

import java.io.OutputStream;
import java.util.Set;
import java.util.TreeSet;

public class File implements FileSystemElement {

    private Set<Integer> sectors = new TreeSet<>();
    private Directory parent;
    private int size;

    public File() {
        this.parent = null;
    }

    public File(Directory parent) {
        this.parent = parent;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Directory getParent() {
        return parent;
    }

    public OutputStream getFileContent() {
        return null;
    }
}
