package com.design.mode.behavior.iterator.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/14
 */
public class MainTest {
    public static void main(String[] args) {
        //来一个容器对象
        IAggregate<String> aggregate = new ConcreteAggregate<String>();
        //添加元素
        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");
        //获取容器对象迭代器
        Iterator<String> iterator = aggregate.iterator();
        //遍历
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
