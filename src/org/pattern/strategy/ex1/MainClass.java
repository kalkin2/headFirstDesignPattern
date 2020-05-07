package org.pattern.strategy.ex1;

public class MainClass {


    public static void main(String[] args) {

        //엑셀로 출력한다.
        ExportData exportData ;

        exportData = new ExcelExport();
        exportData.start();

        //CSV로출력한다
        exportData = new CsvExport();
        exportData.start();

        //TXT 파일로 출력한다.
        exportData = new TxtExport();
        exportData.start();


    }
}
