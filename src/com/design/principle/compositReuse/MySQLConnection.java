package com.design.principle.compositReuse;

/**

 */
public class MySQLConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "获取MySQL数据连接";
    }
}
