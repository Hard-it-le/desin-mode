package com.design.mode.behavior.interpreter;

/**

 *
 * 表达式的解析器
 */
public abstract class IDCardExpression {

    /**
     * 定义解析逻辑
     *       假设我们需要解析的信息格式：
     *              上海：张三 -医生
     *              武汉：李四-程序员
     *              北京：王五-老人
     *              表达式：之前表示城市成，-后面表示职业
     * @param expression
     * @return
     */
    abstract boolean interpret(String expression);

}
