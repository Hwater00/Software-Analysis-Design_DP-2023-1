package ch15.Sample.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() { }// 객체 생성을 못 함

    // 데이터베이스 이름에서 Properties를 얻는다 
    public static Properties getProperties(String dbname) throws IOException {

        // 프러퍼티 파일 이름
        String filename = dbname + ".txt";
        
        Properties prop = new Properties();
        prop.load(new FileReader(filename));

        return prop;
    }
}
