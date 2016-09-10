package com.homework;

import com.homework.impl.Directory;

import java.time.LocalDateTime;

public interface FileSystemElement {

    int getSize();
    Directory getParent();
    LocalDateTime getCreationTime();
    LocalDateTime getModificationTime();

}
