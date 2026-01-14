package com.example.designpatterns.behavioral.visitor;

/**
 * Problem: Need multiple operations (print, line count) over a file tree.
 * Visitor separates operations from the structure so new operations don't
 * touch node classes.
 */
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root")
                .add(new TextFile("readme.txt", 10))
                .add(new Directory("docs")
                        .add(new TextFile("api.md", 30))
                        .add(new TextFile("design.md", 25)));

        PrintingVisitor printer = new PrintingVisitor();
        root.accept(printer);

        LineCountingVisitor counter = new LineCountingVisitor();
        root.accept(counter);
        System.out.println("Total lines: " + counter.getTotalLines());
    }
}
