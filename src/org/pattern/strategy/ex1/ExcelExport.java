package org.pattern.strategy.ex1;


import org.w3c.dom.ls.LSOutput;

public class ExcelExport  implements ExportData {




    @Override
    public void start() {
         System.out.println("엑셀 내보내기 시작 ");
    }
}
