package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private List<Token> tokenList = Collections.synchronizedList(new ArrayList<>());
    public boolean myTurn = false;

    public Board(int tokens) {
        for (int i = 0; i < tokens; i++) {
            tokenList.add(new Token(i+1));
        }
    }

    public Board() {

    }

   /* public void Board(int nTokens) {
        this.tokenList = tokenList;
    }*/

    public synchronized void extractToken(int index) {
        while(myTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        myTurn = true;
        Token current = tokenList.get(index);
        tokenList.remove(index);
        notifyAll();

    }

    public synchronized  List<Token> getTokenList() {
        return tokenList;
    }
}
