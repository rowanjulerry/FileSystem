package com.homework;


import java.util.List;

public interface Directory extends FileSystemElement {

    List<Directory> getDirectories();
    List<File> getFiles();

}
