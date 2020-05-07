package org.pattern.strategy.ex1;

public class TxtExport implements ExportData {
    @Override
    public void start() {
        System.out.println("txt 파일로 내보내기");
    }
}
