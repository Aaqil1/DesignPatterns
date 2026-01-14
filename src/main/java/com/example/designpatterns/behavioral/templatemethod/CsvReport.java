package com.example.designpatterns.behavioral.templatemethod;

public class CsvReport extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching data from warehouse");
    }

    @Override
    protected void format() {
        System.out.println("Formatting rows as CSV");
    }

    @Override
    protected void export() {
        System.out.println("Exporting CSV to /reports/summary.csv");
    }
}
