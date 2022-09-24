package com.design.mode.behavior.interpreter;

import java.util.Set;

/**

 *
 * 终结符表达式
 * 多少种解析规则就定义多少种规则类
 */
public class TerminalExpression  extends  IDCardExpression{

    Set<String> data;
    /**
     *  定义解析用的符合如 ： -
     */
    String symbol;

    public TerminalExpression(Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpret(String expression) {
        //1。先按照制定符号进行分割
        String[] split = expression.split(symbol);
        //2。冒号分割：上海市   张三-医生
        //2。1 -分割  上海市：张三  医生
        boolean result =false;
        for (String s : split){
            //如果包含则说明是免费的信息在里面
          if (data.equals(s)){
              return  true;
          }
        }
        //不再免费里面
        return false;
    }
}
