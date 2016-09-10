package com.homework;

import com.homework.impl.Directory;

import java.io.OutputStream;

public interface FileSystem {

    boolean newFile(String name);
    boolean newDirectory(String name);
    boolean copyDirectory(String name, Directory toDirectory);
    boolean copyFile(String name, Directory toDirectory);
    boolean deleteFile(String name);
    boolean deleteDirectory(String name);
    boolean renameFile(String newName, String oldName);
    boolean renameDirectory(String newName, String oldName);
    void listDirectoryContent();
    OutputStream readFile(String name);
    void editFile(String name);
    boolean setCurrentDirectory(Directory directory);
    Directory getCurrentDirectory(Directory directory);

}
