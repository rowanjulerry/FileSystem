package com.homework;

import com.homework.impl.Directory;

public interface FileSystemElement {

    int getSize();
    Directory getParent();
    boolean isDirectory();

}
