package ch19.Sample;

public interface State {
    public abstract void doClock(Context context, int hour);	// 시간 설정
    
    public abstract void doUse(Context context);		// 금고 사용 
    public abstract void doAlarm(Context context);		// 비상벨 
    public abstract void doPhone(Context context);		// 일반 통화 
    //doYYY() 추가하면 모든 상태가 추가된 메소드를 구현해야 한다.
}
