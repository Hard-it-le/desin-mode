package com.design.mode.structural.bridge;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/11
 */
public abstract class AbstractPhone {

    /**
     * 分离渠道（桥接的关注点
     */
    AbstractSale abstractSale;

    /**
     * 获取手机的信息
     *
     * @return
     */
    abstract String getPhone();

    public void setAbstractSale(AbstractSale abstractSale) {
        this.abstractSale = abstractSale;
    }
}
