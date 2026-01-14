package com.example.designpatterns.behavioral.visitor;

public interface NodeVisitor {
    void visitFile(TextFile file);
    void visitDirectory(Directory directory);
}
