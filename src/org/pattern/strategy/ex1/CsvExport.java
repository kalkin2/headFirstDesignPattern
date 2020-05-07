package org.pattern.strategy.ex1;

public class CsvExport implements ExportData {
    @Override
    public void start() {
        System.out.println("csv Export ..");
    }
}
