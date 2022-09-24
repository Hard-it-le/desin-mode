package com.design.mode.behavior.memento;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import org.apache.commons.beanutils.BeanUtils;

/**

 * <p>
 * 游戏发起人
 */
public class Gamer {
    Integer coin;
    Integer hp;
    Integer mp;
    Integer level;
    //以上内部状态，需要保存

    GameServer gameServer = new GameServer();

    void saveGameRecord() throws InvocationTargetException, IllegalAccessException {
        System.out.println("正在保存当前记录......");
        GameRecord gameRecord = new GameRecord();
        BeanUtils.copyProperties(gameRecord, this);
        gameServer.add(gameRecord);
    }

    Gamer getFromMemento(Integer id) throws Exception {
        System.out.println("获取历史存档信息。。。。");
        Gamer gameRecord = gameServer.getGameRecord(id);
        return gameRecord;
    }

    void playGame() {
        System.out.println("。。。。。。。。");
        int i = new Random().nextInt();
        coin = i;
        hp = i;
        mp = i;
        level = i;
    }

    void exitGame() throws InvocationTargetException, IllegalAccessException {
        System.out.println("退出游戏。。。");
        saveGameRecord();
    }

    public Gamer() {
    }

    public Gamer(Integer coin, Integer hp, Integer mp, Integer level) {
        this.coin = coin;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "coin=" + coin +
                ", hp=" + hp +
                ", mp=" + mp +
                ", level=" + level +
                '}';
    }
}
