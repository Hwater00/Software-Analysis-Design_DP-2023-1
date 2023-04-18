package ch10.pratice;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0; //지난번에 낸 손
    private int currentHandValue = 0;  //이번에 낸 손
    
     //2차원 배열 indwx 2개 [][]
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() { //이번에 낸 손을 기반으로 다음에 낸 손
        //함수 내 지역변수
        int bet = random.nextInt(getSum(currentHandValue)); 
        int handvalue = 0;

        if (bet < history[currentHandValue][0]) { //첫번째 구간
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { //두번째 구간
            handvalue = 1;
        } else { //세번째 구간
            handvalue = 2;
        }
        
        prevHandValue = currentHandValue; //이번에 낸 손을 과거 손으로 이동
        currentHandValue = handvalue;
        return Hand.getHand(handvalue); //숫자 값을 enum 상수로 바꿔서 보낸다. 그러기 위해서는 Hand. !실수 주의!
    }
    

    
    private int getSum(int handvalue) { 
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; //handvalue 행을 다 더함 
        }
        return sum;
    }

    @Override
    public void study(boolean win) { //졌는지 이겼는지 알려줌
        if (win) { 
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
