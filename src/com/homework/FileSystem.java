package com.homework;


public interface FileSystem {

    boolean mkDir(String path, String name);
    boolean rmDir(String path, String name);
    boolean mkFile(String path, String name);
    boolean rmFile(String path, String name);
    String getCurrentPath();
    boolean initializeFileSystem(File file);
    boolean cdDir(String name);
    boolean cd();
    void lessFile();
    void ls();

}
