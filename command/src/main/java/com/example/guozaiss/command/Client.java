package com.example.guozaiss.command;

/**
 * Created by guozaiss on 16/1/22.
 */
public class Client {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private TranCommand tranCommand;
    private FallCommand fallCommand;

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setTranCommand(TranCommand tranCommand) {
        this.tranCommand = tranCommand;
    }
    public void toLeft(){
        leftCommand.execute();
    }
    public void toRight(){
        rightCommand.execute();
    }

    public void toDown(){
        fallCommand.execute();
    }

    public void toTran(){
        tranCommand.execute();
    }
}
