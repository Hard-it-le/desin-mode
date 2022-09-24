package com.design.mode.creation.singleton.enumSingleton;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *  * 枚举实现单例
 *  * 天然不支持反射创建对应的实例,且有自己的反序列化机制
 *  * 利用类加载机制保证线程安全.
 **/
public enum EnumSingleton {
    /*
    * 反射实例化
     */
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}