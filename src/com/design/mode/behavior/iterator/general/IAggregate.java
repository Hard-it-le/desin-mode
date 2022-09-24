package com.design.mode.behavior.iterator.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/14
 * 抽象容器
 */
public interface IAggregate<E> {
    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}