package com.example.guozaiss.command;

/**
 * Created by guozaiss on 16/1/22.
 * 下落命令
 */
public class FallCommand implements Command {
    //接收者
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toDown();
    }
}
