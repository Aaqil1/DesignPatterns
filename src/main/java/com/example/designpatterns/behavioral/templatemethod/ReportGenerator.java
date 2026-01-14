package com.example.designpatterns.behavioral.templatemethod;

/**
 * Abstract template defining the steps to generate a report.
 */
public abstract class ReportGenerator {
    public final void generate() {
        fetchData();
        format();
        export();
    }

    protected abstract void fetchData();
    protected abstract void format();
    protected abstract void export();
}
