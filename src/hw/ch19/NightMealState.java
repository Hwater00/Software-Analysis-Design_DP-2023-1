package hw.ch19;

//야식시간
public class NightMealState  implements State {
    private static NightMealState singleton = new NightMealState();

    private NightMealState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
        public void doClock(Context context, int hour) {
            if (hour < 9 || 17 <= hour&& 20 > hour) { //만약  9시보다 크거나 17시보다 작으면 야간
            context.changeState(NightState.getInstance());
            } else if (9 <= hour && hour < 17) {
                context.changeState(DayState.getInstance()); //주간
            }
        }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(야식)");
        context.callSecurityCenter(" 비상상태 통보: 야식 금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야식)");
    }

    @Override
    public void doPhone(Context context) {
        // context.recordLog("야식: 자동응답기 호출");
        context.callSecurityCenter("야식: 자동응답기 호출");
    }

    @Override
    public String toString() {
        return "[야식]";
    }

    @Override
    public void doCCTV(Context context){
        context.recordLog("CCTV : OFF");
    }
}
