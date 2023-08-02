package ch22.Sample.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>(); //컬랙션 (stack)

    // 실행 
    @Override
    public void execute() {
        //for (Command cmd: commands) { 
        //    cmd.execute(); 
        //}

     // 스택에 아래쪽 부터 꺼내오기 구현 방법
        Command cmd;
        Iterator<Command> i = commands.descendingIterator();
        while(i.hasNext()){
            cmd=i.next();
            cmd.execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) { //자기 자신이 원소로 들어가는 것을 막기 위해 검사
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
