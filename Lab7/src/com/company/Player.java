package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Runnable{
    private  String name;
    private Board gameBoard;
    private List<Token> tokenList = Collections.synchronizedList(new ArrayList<>(Token));

    public Player(String name, Board gameBoard) {
        this.name = name;
        this.gameBoard = gameBoard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(!gameBoard.getTokenList() = 0) {
            tokenList.add(gameBoard.extractToken());
        }
    }
}
