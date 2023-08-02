package hw.ch14;

public class LimitSupport extends Support {
    private int limit; // 이 번호 미만이면 해결할 수 있다

    public LimitSupport(String name, int limit) {
        super(name); //이름은 부모쪽에 보관
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) { 
            return true;
        } else {
            return false;
        }
    }
}