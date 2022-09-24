package com.design.mode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 * <p>
 * 享元工厂
 */
public class FlyWeightFactory {

    private static Map<String, AbstractWaitressFlyWeight> pool = new HashMap<>();

    /**
     * 享元，池字中有对象
     */
    static {
        BeautifulWaitress beautifulWaitress = new BeautifulWaitress();
        beautifulWaitress.setAge(18);
        beautifulWaitress.setId("1111");
        beautifulWaitress.setName("张三");
        pool.put(beautifulWaitress.getId(), beautifulWaitress);
        BeautifulWaitress beautifulWaitress1 = new BeautifulWaitress();
        beautifulWaitress1.setAge(18);
        beautifulWaitress1.setId("11111");
        beautifulWaitress1.setName("李四");
        pool.put(beautifulWaitress1.getId(), beautifulWaitress1);
    }

    public void addWaitress(AbstractWaitressFlyWeight abstractWaitressFlyWeight) {
        pool.put(UUID.randomUUID().toString(), abstractWaitressFlyWeight);
    }

    public static AbstractWaitressFlyWeight getWaitress(String name) {
        AbstractWaitressFlyWeight abstractWaitressFlyWeight = pool.get(name);
        if (abstractWaitressFlyWeight == null) {
            for (AbstractWaitressFlyWeight value : pool.values()) {
                //当前共享对象是否可以使用
                if (value.isCanService()) {
                    return value;
                }
            }
            return null;
        }
        return abstractWaitressFlyWeight;
    }
}
