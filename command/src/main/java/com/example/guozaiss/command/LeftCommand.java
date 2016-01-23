package com.example.guozaiss.command;

/**
 * Created by guozaiss on 16/1/22.
 * 左移命令
 */
public class LeftCommand implements Command {
    //定义接受者
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    /**
     * 执行的方法
     */
    @Override
    public void execute() {
        //具体执行的操作
        machine.toLeft();
    }
}
