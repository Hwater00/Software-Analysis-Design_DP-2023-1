package ch04.practice.framework;

//인스턴스를 생성하는 뼈대 역할
public abstract class Factory { //Factory가 템플릿 메소드 패턴

    //제품 생산 시 하는 큰 흐름 
    public final Product create(String owner) {
        Product p = createProduct(owner); //제품을 만들고
        registerProduct(p); //제품을 등록하고
        return p; 
    }

    //실제로 어떤 제품(객체)을 생산할 지는 자식에게 맡긴다.
    protected abstract Product createProduct(String owner); //new를 사용해 실제 인스턴스를 생성하는 대신에. 인스턴스를 생성하는 메소드를 호출함으로써 구체적인 이름에 의한 속박에서 상위클래스를 자유롭게 한다.
    protected abstract void registerProduct(Product product);
}
