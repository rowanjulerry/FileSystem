package com.homework.impl;

import com.homework.FileSystemElement;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private final List<FileSystemElement> listOfFileSystemElements = new ArrayList<>();
    private Directory parent;

    public Directory() {
        this.parent = null;
    }

    public Directory(Directory parent) {
        this.parent = parent;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemElement fileSystemElement : listOfFileSystemElements) {
            size += fileSystemElement.getSize();
        }
        return size;
    }

    @Override
    public Directory getParent() {
        return parent;
    }

    public List<FileSystemElement> getDirectoryContent() {
        return listOfFileSystemElements;
    }

}
