package com.design.mode.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

/**

 */
public class Area {
    Set<String> city = new HashSet<>();

    Set<String> type = new HashSet<>();

    /**
     * 身份证信息解析，抽象表达式
     * {"武汉市", "上海市"};
     * {"医生", "老人", "儿童"}
     */
    IDCardExpression idCardExpression;


    /**
     * 环境类持有表达式
     */
    public Area() {
        city.add("武汉市");
        city.add("上海市");
        type.add("医生");
        type.add("老人");
        type.add("儿童");

        TerminalExpression city = new TerminalExpression(this.city, ":");
        TerminalExpression type = new TerminalExpression(this.type, "-");

        //以上规则满足一个即可
        idCardExpression = new OrExpression(city, type);
    }

    /**
     * 传入表达式，判断当前表达式是否指定为免费人群
     */
    public void getTicker(String expression) {
        boolean interpret = idCardExpression.interpret(expression);

        if (interpret){
            System.out.println("免费参观");
        }else {
            System.out.println("错误");
        }

    }
}
