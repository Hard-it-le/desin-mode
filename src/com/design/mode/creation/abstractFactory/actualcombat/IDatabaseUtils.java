package com.design.mode.creation.abstractFactory.actualcombat;

/**
 * @author yujiale
 */
public interface IDatabaseUtils {
    IConnection getConnection();
    ICommand getCommand();
}
