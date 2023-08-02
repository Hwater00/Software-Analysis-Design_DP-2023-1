package ch07.Sample;

import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");

        sb.append("<head><title>");
        sb.append(title);
        sb.append("</title></head>\n");

        sb.append("<body>\n");

        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>");
        sb.append(str);
        sb.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");     // ul은 요소 
        for (String s: items) {
            sb.append("<li>");   // li는 listItem
            sb.append(s);
            sb.append("</li>\n");
        }
        sb.append("</ul>\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>");
        sb.append("</html>\n");

        //웹 페이지로 저장
        try {
            Writer writer = new FileWriter(filename); 
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return filename; //생성된 파일의 이름을 리턴
    }
}
