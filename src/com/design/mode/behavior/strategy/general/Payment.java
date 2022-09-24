package com.design.mode.behavior.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 * <p>
 * 抽象策略角色
 */
public interface Payment<T> {

    /**
     * 获取支付方式
     *
     * @return 响应，支付方式
     */
    void getPayType();
}
