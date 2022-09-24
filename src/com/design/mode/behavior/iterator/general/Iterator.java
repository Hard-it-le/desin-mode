package com.design.mode.behavior.iterator.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/14
 *
 * 抽象迭代器
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}