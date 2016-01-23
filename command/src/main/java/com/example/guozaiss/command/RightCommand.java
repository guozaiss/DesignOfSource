package com.example.guozaiss.command;

/**
 * Created by guozaiss on 16/1/22.
 * 右移命令
 */
public class RightCommand implements Command{
    //接收者
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //具体执行的操作
        machine.toRight();
    }
}
