package com.homework.impl;

import com.homework.FileSystemElement;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private final List<FileSystemElement> listOfFileSystemElements = new ArrayList<>();
    private Directory parent;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.parent = null;
    }

    public Directory(String name, Directory parent) {
        this.name = name;
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

    @Override
    public LocalDateTime getCreationTime() {
        return null;
    }

    @Override
    public LocalDateTime getModificationTime() {
        return null;
    }

    public List<FileSystemElement> getDirectoryContent() {
        return listOfFileSystemElements;
    }

}
