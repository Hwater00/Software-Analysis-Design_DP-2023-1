package ch20.Sample;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만든 BigChar 인스턴스를 관리
    private Map<String,BigChar> pool = new HashMap<>(); //key와 value 쌍을 관리, Map은 인터페이스이고 이를 구현한게 HasMap
    
    // Singleton 패턴 
    private static BigCharFactory singleton = new BigCharFactory();
    // 생성자 
    private BigCharFactory() {
    }
    // 유일한 인스턴스를 얻는다
    public static BigCharFactory getInstance() {
        return singleton;
    }

//Flyweight핵심 구문
    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) { // '1'
        //pool에서 먼저 검색을 함
        BigChar bc = pool.get(String.valueOf(charname)); // "1" String으로 바꿔서 키 검색
        
        
        if (bc == null) { // 검색한결과 없으면..
            // 여기서 BigChar 인스턴스를 생성 
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc); //pool에 보관
        }

        return bc;
    }
}
