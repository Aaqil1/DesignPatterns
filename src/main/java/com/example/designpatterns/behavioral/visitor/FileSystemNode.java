package com.example.designpatterns.behavioral.visitor;

public interface FileSystemNode {
    void accept(NodeVisitor visitor);
}
