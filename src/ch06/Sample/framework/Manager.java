package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

// Product라는 부모 타입으로 코딩이 되어 있음
/* 원칙 : Programin to Interface / Abstract class */
public class Manager { //재사용 가능함
    private Map<String,Product> showcase = new HashMap<>();

    //넣음
    public void register(String name, Product prototype) { 
        showcase.put(name, prototype);
    }

    //꺼내옴
    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); //문자열을 이용해 쇼케이스에 문자열을 찾아옴
        //return p; X
        // return p.clone(); clone()은 자기 자신만 호출할 수 있다 = Mannager에서는 가능 
        return p.createCopy();  //복제품을 반환함
    }
}
