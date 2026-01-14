package com.example.designpatterns.behavioral.visitor;

public class TextFile implements FileSystemNode {
    private final String name;
    private final int lines;

    public TextFile(String name, int lines) {
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visitFile(this);
    }
}
