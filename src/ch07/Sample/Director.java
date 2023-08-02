package ch07.Sample;

public class Director {
    private Builder builder; // 어떤 종류의 빌더도 가능<- 부모 타입 

    // 생성자 
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 문서를 만드는 메소드
    public void construct() { 
        // 빌더에게 일을 시킨다 = 재료 제공
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
            "How are you?",
            "Hello.",
            "Hi.",
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
            "Good morning.",
            "Good afternoon.",
            "Good evening.",
        });
        builder.close();

    }
}
