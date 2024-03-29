package ch10.pratice;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random; // 임의의 수 생성기
    private Hand prevHand; //지난번 승부에서 내민 손 저장
    private boolean won = false; //지난번 승부에서 결과 저장

    public WinningStrategy(int seed) { 
        random = new Random(seed); //sead가 같으면 동일한 숫자가 생성됨
    }

    @Override
    public Hand nextHand() {
        if (!won) { // !won은 직전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3)); //0, 1, 2 중 하나
                     // 숫자 값을 enum 상수로 바꿔서 보낸다 
        }
        return prevHand; // 직전에 이겼으면 같은 손을 리턴함
    }

    @Override
    public void study(boolean win) { //졌는지 이겼는지 알려줌
        won = win;
    }
}
