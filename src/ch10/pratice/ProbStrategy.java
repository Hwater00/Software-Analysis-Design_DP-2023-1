package ch10.pratice;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0; //직전에 낸 손
    
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
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;

        if (bet < history[currentHandValue][0]) { //첫번째 구간
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { //두번째 구간
            handvalue = 1;
        } else { //세번째 구간
            handvalue = 2;
        }
        
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    
    private int getSum(int handvalue) { 
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; //handvalue 행을 다 더함 
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) { 
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
