package com.example.designpatterns.behavioral.visitor;

/**
 * Visitor that prints a tree structure.
 */
public class PrintingVisitor implements NodeVisitor {
    private int depth = 0;

    @Override
    public void visitFile(TextFile file) {
        indent();
        System.out.println("- " + file.getName() + " (" + file.getLines() + " lines)");
    }

    @Override
    public void visitDirectory(Directory directory) {
        indent();
        System.out.println("+ " + directory.getName());
        depth++;
        directory.getChildren().forEach(child -> child.accept(this));
        depth--;
    }

    private void indent() {
        System.out.print("  ".repeat(depth));
    }
}
