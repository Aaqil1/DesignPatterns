package com.example.designpatterns.behavioral.templatemethod;

/**
 * Problem: Multiple report formats share the same steps (fetch, format, export)
 * but differ in details. Copying step order risks inconsistencies.
 *
 * Template Method fixes the algorithm skeleton while subclasses fill the steps.
 */
public class Main {
    public static void main(String[] args) {
        ReportGenerator pdf = new PdfReport();
        ReportGenerator csv = new CsvReport();

        System.out.println("--- PDF Report ---");
        pdf.generate();

        System.out.println("--- CSV Report ---");
        csv.generate();
    }
}
