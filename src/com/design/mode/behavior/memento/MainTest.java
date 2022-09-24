package com.design.mode.behavior.memento;

/**

 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Gamer gamer = new Gamer();
        gamer.playGame();

        gamer.saveGameRecord();

        gamer.playGame();

        gamer.saveGameRecord();

        Gamer fromMemento = gamer.getFromMemento(1);

        fromMemento.playGame();

    }
}
