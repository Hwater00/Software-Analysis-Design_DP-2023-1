package hw.ch15.pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer; 

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀 출력 
    public void title(String title) throws IOException {
        
        //파일에 작성 writer.write
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" +"김혜수의 " +title + "</h1>");
        writer.write("\n");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
        writer.write("\n");
    }

    // 링크 출력
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");

       // paragraph("<a href=\"" + href +"\">" + caption + "</a>"); //따움표 안에 따움표가 있는 형태, hrep, caption은 변수니깐 +로 연결


    }

    // 이메일 주소 출력 
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    //하이퍼링크
    public void linkto( String username,String mailadr) throws IOException {
        link(username,mailadr);
    }

    // HTML 닫기 
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");

        writer.close(); // 파일에 접근하고 나면 항상 clode 필요
        
    }
}
