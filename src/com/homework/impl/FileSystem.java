package com.homework.impl;

import com.homework.FileSystemElement;

import java.util.HashMap;
import java.util.Set;

public class FileSystem implements com.homework.FileSystem {

    private final static int PAGE_SIZE = 4096;
    private HashMap<FileSystemElement, Set<Integer>> freeSectors = new HashMap<>();

    public FileSystem() {
    }

    @Override
    public boolean mk(FileSystemElement fileSystemElement) {
        return false;
    }

    @Override
    public boolean rm(FileSystemElement fileSystemElement) {
        return false;
    }
}
