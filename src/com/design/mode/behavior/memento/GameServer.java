package com.design.mode.behavior.memento;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;

/**

 * <p>
 * 管理者
 */
public class GameServer {

    /**
     * 管理备忘录信息
     */
    Map<Integer, GameRecord> records = new HashMap<>();
    Integer i = 1;

    void add(GameRecord gameRecord) {
        gameRecord.setId(i++);
        records.put(gameRecord.id, gameRecord);
    }

    Gamer getGameRecord(Integer id) throws Exception {
        GameRecord gameRecord = records.get(id);
        //获取到备忘录里面内容以后还要逆转
        Gamer gamer = new Gamer();
        BeanUtils.copyProperties(gamer, gameRecord);
        return gamer;
    }

}
