package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();

    // undo 삭제 시
    private Deque<Command> commandsForDeque = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        for (Command cmd: commands) {
            Iterator it = commands.iterator();
            while (((Iterator) it).hasNext()) {
            ((Command) it.next()).execute();
            }
        }  
        
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
            commandsForDeque.push(commands.pop());;
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }

    public void redo(){
        commandsForDeque.pop();
        commands.push(commandsForDeque.pop()); 
        

    }

}
