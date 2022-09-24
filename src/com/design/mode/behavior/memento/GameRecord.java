package com.design.mode.behavior.memento;

/**

 * <p>
 * 游戏记录：也叫备忘录信息
 */
public class GameRecord {

    Integer id;
    Integer coin;
    Integer hp;
    Integer mp;
    Integer level;

    /**
     * 获取备忘录信息
     */
    void getCurrent() {
        System.out.println("coin: " + coin + "; \t" + "hp: " + hp + "; \t" + "mp:" + mp);
    }

    public GameRecord() {
    }

    public GameRecord(Integer id, Integer coin, Integer hp, Integer mp, Integer level) {
        this.id = id;
        this.coin = coin;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "GameRecord{" +
                "id=" + id +
                ", coin=" + coin +
                ", hp=" + hp +
                ", mp=" + mp +
                ", level=" + level +
                '}';
    }
}
