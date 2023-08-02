package ch15.Sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            // 메일 데이터.txt에 있는 프로퍼티를 읽어옴
            Properties mailprop = Database.getProperties("maildata");
            // key를 주면 value가 나옴 = 이메일 주소를 주면 사람 이름이 나옴
            String username = mailprop.getProperty(mailaddr);

            //실제 웹 페이지를 작성
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);

            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        
        } catch (IOException e) { // 오류가 발생할 수 있기 때문에 IOException 
            e.printStackTrace();
        }
    }
}
