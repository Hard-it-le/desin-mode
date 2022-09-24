package com.design.principle.compositReuse;

/**

 */
public class MyOracleConnection extends DbConnection{
    @Override
    public String getConnection() {
        return "获取Oracle数据连接";
    }
}
