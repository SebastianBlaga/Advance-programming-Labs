package com.company;

public class Game extends  Thread {
    Board gameBoard = new Board(30);

    public void start(){
        Player p1 = new Player("P1",gameBoard);
        Player p2 = new Player("P2", gameBoard);
        new Thread(p1).start();
        new Thread(p2).start();
    }


}
