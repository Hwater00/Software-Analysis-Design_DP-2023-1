package ch19.Sample;

//싱글톤 패턴 적용
public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) { //알려준 시간 
        //연습문제19-2 if (hour < 8 || 21 <= hour) {
        if (hour < 9 || 17 <= hour) { //야간에 해당되면..
            context.changeState(NightState.getInstance()); //야간 상태로 바꿔라.
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
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
}
