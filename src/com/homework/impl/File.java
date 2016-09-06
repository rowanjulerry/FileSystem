package com.homework.impl;

import com.homework.FileSystemElement;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class File implements FileSystemElement {

    private final boolean isDirectory;
    private Directory parent;
    private int size;

    public File() {
        this.isDirectory = false;
        parent = null;
    }

    public File(boolean isDirectory) {
        this.isDirectory = true;
        parent = null;
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
    public boolean isDirectory() {
        return isDirectory;
    }

    public BufferedOutputStream getFileContent() throws IOException {
        return new BufferedOutputStream(new ObjectOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
        }));
    }
}
