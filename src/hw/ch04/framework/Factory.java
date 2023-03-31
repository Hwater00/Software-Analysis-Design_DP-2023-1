package hw.ch04.framework;

public abstract class Factory {
    //제품 생산 시 하는 큰 흐름 => 템플릿 메소드 패턴
    public final Product create(String owner) {
        Product p = createProduct(owner); //제품을 만들고
        registerProduct(p); //제품을 등록하고
        return p; 
    }

    //실제로 어떤 제품(객체)을 생산할 지는 자식에게 맡긴다.
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

    public void printAlModelNames() {
    }
}
