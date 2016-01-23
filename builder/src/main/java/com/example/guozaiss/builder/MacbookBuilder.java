package com.example.guozaiss.builder;

/**
 * Created by guozaiss on 16/1/19.
 * 具体构建类
 */
public class MacbookBuilder extends Builder {
    private Computer computer=new Macbook();


    @Override
    Builder builderBoard(String board) {
        computer.setmBoard(board);
        return this;
    }

    @Override
    Builder builderDisplay(String display) {
        computer.setmDisplay(display);
        return this;
    }

    @Override
    Builder builderOS(String OS) {
        computer.setOS(OS);
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}
