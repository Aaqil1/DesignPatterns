package com.example.designpatterns.behavioral.templatemethod;

public class PdfReport extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching data from analytics DB");
    }

    @Override
    protected void format() {
        System.out.println("Formatting data into PDF layout");
    }

    @Override
    protected void export() {
        System.out.println("Exporting PDF to /reports/summary.pdf");
    }
}
