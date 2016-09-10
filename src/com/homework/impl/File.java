package com.homework.impl;

import com.homework.FileSystemElement;

import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class File implements FileSystemElement {

    private Set<Integer> sectors = new TreeSet<>();
    private Directory parent;
    private int size;
    private String name;

    public File(String name) {
        this.name = name;
        this.parent = null;
    }

    public File(String name, Directory parent) {
        this.name = name;
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

    @Override
    public LocalDateTime getCreationTime() {
        return null;
    }

    @Override
    public LocalDateTime getModificationTime() {
        return null;
    }

    public OutputStream getFileContent() {
        return null;
    }
}
