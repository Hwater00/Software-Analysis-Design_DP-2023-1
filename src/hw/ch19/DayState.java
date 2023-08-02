package hw.ch19;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) { //9시보다 작거나 17시보다 크거나 같으면 야간
            context.changeState(NightState.getInstance());
        } else if (12 <= hour && hour < 13) { //12시보다 크거나 같으면서 13시보다 작으면 점심
            context.changeState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }

    @Override
    public void doCCTV(Context context){
        context.recordLog("CCTV : 해상도 600 dpi로 변경");
    }
}
