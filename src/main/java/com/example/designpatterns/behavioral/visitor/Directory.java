package com.example.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory add(FileSystemNode node) {
        children.add(node);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<FileSystemNode> getChildren() {
        return children;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visitDirectory(this);
    }
}
