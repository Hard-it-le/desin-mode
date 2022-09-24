package com.design.mode.structural.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/29
 *
 * 享元工厂
 */
public class FlyweightFactory {
    private static Map<String, IFlyweight> pool = new HashMap<String, IFlyweight>();

    /**
     *  因为内部状态具备不变性，因此作为缓存的键
      * @param intrinsicState
     * @return
     */
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
