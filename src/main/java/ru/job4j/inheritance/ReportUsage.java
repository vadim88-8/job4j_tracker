package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
//        HtmlReport report = new HtmlReport();
//        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
