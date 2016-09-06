package com.homework.impl;

import com.homework.FileSystemElement;

import java.io.*;
import java.io.File;

public class FileSystem implements com.homework.FileSystem {

    private final static int PAGE_SIZE = 4096;
    private static final String FILE_NAME = "FileSystem.txt";
    private static java.io.File file;

    public FileSystem() {
        file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
