package com.example.guozaiss.command;

/**
 * Created by guozaiss on 16/1/22.
 * 变形命令
 */
public class TranCommand  implements Command{
    //接收者
    private TetrisMachine machine;

    public TranCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toTran();
    }
}
