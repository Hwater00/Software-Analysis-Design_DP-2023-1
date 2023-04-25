package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA;

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); //  지정된 이름을 가진 지정된 열거형 유형의 열거형 상수를 반환합니다. 
        
    }
}
