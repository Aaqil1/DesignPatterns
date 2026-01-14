package com.example.designpatterns.behavioral.visitor;

/**
 * Visitor that computes total line count in the tree.
 */
public class LineCountingVisitor implements NodeVisitor {
    private int totalLines = 0;

    @Override
    public void visitFile(TextFile file) {
        totalLines += file.getLines();
    }

    @Override
    public void visitDirectory(Directory directory) {
        directory.getChildren().forEach(child -> child.accept(this));
    }

    public int getTotalLines() {
        return totalLines;
    }
}
